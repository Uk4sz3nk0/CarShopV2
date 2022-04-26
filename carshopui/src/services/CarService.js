import axios from 'axios';

const CARS_API_URL = 'http://localhost:8080/cars';

class CarService {

    getCars(){
        return axios.get(CARS_API_URL);
    }
}

export default new CarService();