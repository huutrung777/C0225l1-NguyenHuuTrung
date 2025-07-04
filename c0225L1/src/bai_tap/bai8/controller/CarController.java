package bai_tap.bai8.controller;

import bai_tap.bai8.entity.Car;
import bai_tap.bai8.service.CarService;
import bai_tap.bai8.service.ICarService;

import java.util.List;

public class CarController {
    private ICarService carService=new CarService();
    public void addCar(Car car) {carService.addCar(car);}
public List<Car> getAllCars() {return carService.findAllCars();}
    public void deleteCar(String id) {carService.deleteCar(id);}
    public void updateCar(String bienKiemSoat, Car car) {carService.updateCar(car);}


}
