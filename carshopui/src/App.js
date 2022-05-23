import './App.css';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom'

import Navbar from './components/ui/navbar/Navbar'
import CarsDisplay from './components/ui/cars_display/CarsDisplay'

function App() {
  return (
    <div className="App">
        <Navbar />
        <CarsDisplay />

    </div>
  );
}

export default App;
