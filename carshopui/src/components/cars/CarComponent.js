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
            this.state.cars.map(
                car => 
                <a href={car.id} class="flex font-sans border-solid border-2 rounded-md mt-2 ml-12 mr-12" key={car.id}>
                    <div class="flex-none w-64 px-auto relative">
                        <img src="https://storage.carsmile.pl/cache/upload/8337/format,webp;size,1000,500/volkswagen_id3_1st_26.webp" alt="" class="absolute inset-0 w-full h-auto object-cover py-7 ml-2" />
                    </div>
                    <form class="flex-auto p-4">
                        <div class="flex flex-wrap">
                            <h1 class="flex-auto text-xl font-bold text-left text-slate-900 pl-5 py-3">
                                {car.name} {car.model}
                            </h1>
                            <div class="text-lg font-semibold text-red-500">
                                {car.price} PLN
                                <button class="flex-none items-center justify-center m-2 w-9 h-9 rounded-md text-slate-300 border border-slate-200" type="button" aria-label="Like">
                                    <svg width="20" height="20" fill="currentColor" aria-hidden="true" class="items-center justify-center mx-auto py-auto">
                                        <path fill-rule="evenodd" clip-rule="evenodd" d="M3.172 5.172a4 4 0 015.656 0L10 6.343l1.172-1.171a4 4 0 115.656 5.656L10 17.657l-6.828-6.829a4 4 0 010-5.656z" />
                                    </svg>
                            </button>
                            </div>
                            <div class="w-full text-left flex-none text-sm font-medium text-slate-700 mt-0.5 pl-5">
                                {car.short_description}
                            </div>
                        </div>
                        <div class="flex  mt-4 mb-6 pb-6 border-b border-slate-200">
                        <div class="flex text-sm pl-3 ml-2">
                            <label>
                            <div class="w-14 h-9 rounded-lg inline mr-8 items-center justify-center text-slate-700 peer-checked:font-semibold peer-checked:bg-slate-900 peer-checked:text-white">
                                {car.production_year}
                            </div>
                            </label>
                            <label>
                            <div class="w-14 h-9 rounded-lg inline mr-8 items-center justify-center text-slate-700 peer-checked:font-semibold peer-checked:bg-slate-900 peer-checked:text-white">
                                {car.mileage} km
                            </div>
                            </label>
                            <label>
                            <div class="w-14 h-9 rounded-lg inline mr-8 items-center justify-center text-slate-700 peer-checked:font-semibold peer-checked:bg-slate-900 peer-checked:text-white">
                                {car.engine_capacity} cm3
                            </div>
                            </label>
                            <label>
                            <div class="w-14 h-9 rounded-lg inline mr-8 items-center justify-center text-slate-700 peer-checked:font-semibold peer-checked:bg-slate-900 peer-checked:text-white">
                                {car.fuel_type}
                            </div>
                            </label>
                        </div>
                        </div>
                        <label>
                            <div class="w-full h-9 rounded- flex items-left justify-left pl-5 font-semibold">
                                {car.localization}
                            </div>
                            </label>
                    </form>
                    </a>
                    

            )
        );
    }
}

export default CarComponent;