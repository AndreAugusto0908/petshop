import React, { useState } from 'react';
import DatePicker from 'react-datepicker';
import 'react-datepicker/dist/react-datepicker.css';
import './Form.css';

/**
 * Componente de formulário para selecionar data e quantidade de cães pequenos e grandes.
 * Ao submeter o formulário, faz uma requisição POST para buscar o melhor PetShop com base nos dados fornecidos.
 *
 * @component
 * @param {Object} props - Propriedades do componente.
 * @param {function} props.setBestPetShop - Função para definir o melhor PetShop após a requisição.
 * @returns {JSX.Element} Retorna o JSX para renderizar o formulário.
 */
const Form = ({ setBestPetShop }) => {
  const [date, setDate] = useState(null);
  const [smallDogs, setSmallDogs] = useState(0);
  const [largeDogs, setLargeDogs] = useState(0);

    /**
   * Manipulador de mudança de data do DatePicker.
   *
   * @param {Date} date - Nova data selecionada.
   */
  const handleDateChange = (date) => {
    if (date >= new Date()) {
      setDate(date);
    }
  };

    /**
   * Manipulador de envio do formulário.
   *
   * @param {Event} e - Evento de submissão do formulário.
   */
  const handleSubmit = async (e) => {
    e.preventDefault();
    const formattedDate = date ? `${String(date.getDate()).padStart(2, '0')}/${String(date.getMonth() + 1).padStart(2, '0')}/${date.getFullYear()}` : '';
    try {
      const response = await fetch('http://localhost:8080/petshop/bestPetShop', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({ date: formattedDate, smallDogs, largeDogs })
      });

      if (!response.ok) {
        throw new Error('Network response was not ok');
      }

      const data = await response.json();

      if (!data.name || data.distanceFromKennel === undefined || data.totalCost === undefined) {
        throw new Error('Invalid data structure');
      }

      setBestPetShop(data);
    } catch (error) {
      console.error('Fetch error:', error);
      setBestPetShop(null); // Clear the previous data if there's an error
    }
  };

  return (
    <form className="form" onSubmit={handleSubmit}>
      <div className="form-group">
        <label htmlFor="date">Data:</label>
        <DatePicker
          id="date"
          selected={date}
          onChange={handleDateChange}
          minDate={new Date()}
          dateFormat="dd/MM/yyyy"
          placeholderText="Selecione uma data"
        />
      </div>
      <div className="form-group">
        <label htmlFor="small-dogs">Número de Cães Pequenos:</label>
        <input
          type="number"
          id="small-dogs"
          value={smallDogs}
          onChange={(e) => setSmallDogs(Math.max(0, e.target.value))}
          min="0"
        />
      </div>
      <div className="form-group">
        <label htmlFor="large-dogs">Número de Cães Grandes:</label>
        <input
          type="number"
          id="large-dogs"
          value={largeDogs}
          onChange={(e) => setLargeDogs(Math.max(0, e.target.value))}
          min="0"
        />
      </div>
      <button type="submit" className="submit-button">Enviar</button>
    </form>
  );
};

export default Form;