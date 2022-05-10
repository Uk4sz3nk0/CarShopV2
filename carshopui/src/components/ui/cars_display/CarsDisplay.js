import React from "react";
import CarComponent from '../../cars/CarComponent'

class CarDisplay extends React.Component{

    render(){
        return (
            <div class="m-3 py-5 pl-10 pr-10">
                <CarComponent />
            </div>
        )
    }
}

export default CarDisplay;