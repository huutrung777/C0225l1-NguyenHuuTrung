package bai_tap.bai8.service;

import bai_tap.bai8.entity.Car;

import java.util.List;

public interface ICarService {
void addCar(Car car);
    List<Car> findAllCars();
void deleteCar(String id);
void updateCar(Car car);

    void updateCar(String id, Car car);
}
