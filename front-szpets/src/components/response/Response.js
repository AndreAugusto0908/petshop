import React from 'react';
import './Response.css';

/**
 * Componente Response para exibir os detalhes do melhor PetShop.
 *
 * @component
 * @param {Object} props - Propriedades do componente.
 * @param {Object} props.bestPetShop - Objeto contendo informações do melhor PetShop.
 * @param {string} props.bestPetShop.name - Nome do PetShop.
 * @param {number} props.bestPetShop.distanceFromKennel - Distância do PetShop em quilômetros.
 * @param {number} props.bestPetShop.totalCost - Custo total dos serviços do PetShop.
 * @returns {JSX.Element | null} Retorna o JSX para renderizar os detalhes do PetShop ou null se `bestPetShop` for inválido.
 */
const Response = ({ bestPetShop }) => {
  if (!bestPetShop) return null;

  const { name, distanceFromKennel, totalCost } = bestPetShop;

  if (!name || distanceFromKennel === undefined || totalCost === undefined) {
    console.error("Invalid bestPetShop data", bestPetShop);
    return <div className="response-error">Erro nos dados do PetShop</div>;
  }

  return (
    <div className="response">
      <h2>Melhor PetShop</h2>
      <p><strong>Nome:</strong> {name}</p>
      <p><strong>Distância:</strong> {distanceFromKennel} km</p>
      <p><strong>Valor Total:</strong> R$ {totalCost.toFixed(2)}</p>
    </div>
  );
};

export default Response;