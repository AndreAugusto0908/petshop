import React, { useState } from 'react';
import './App.css';
import Header from './components/header/header.js';
import Form from './components/formulario/Form.js';
import Response from './components/response/Response.js';

function App() {
  const [bestPetShop, setBestPetShop] = useState(null);

  return (
    <div className="App">
      <Header />
      <div className="content">
        <Form setBestPetShop={setBestPetShop} />
        <Response bestPetShop={bestPetShop} />
      </div>
    </div>
  );
}

export default App;