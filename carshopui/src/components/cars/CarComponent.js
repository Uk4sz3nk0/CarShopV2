import React from 'react';
import CarService from '../../services/CarService';
import '../../index.css';

class CarComponent extends React.Component {

    constructor(props){
        super(props);
        this.state = {
            cars: []
        }
    }

    componentDidMount(){
        CarService.getCars().then((response) => {
            this.setState({cars: response.data})
        });
    }

    render() {

        return (
            <div>
                <table className="table-fixed">
                    <thead>
                        <tr>
                            <td>Car name</td>
                            <td>Car model</td>
                            <td>Production year</td>
                            <td>Price</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.cars.map(
                                car => 
                                <tr key={car.id}>
                                    <td>{car.name}</td>
                                    <td>{car.model}</td>
                                    <td>{car.production_year}</td>
                                    <td>{car.price}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        );
    }
}

export default CarComponent;