import React from "react";
import CarComponent from '../../cars/CarComponent'

class CarDisplay extends React.Component{

    render(){
        return (
            <div class="m-3 p-5">
                <CarComponent />
            </div>
        )
    }
}

export default CarDisplay;