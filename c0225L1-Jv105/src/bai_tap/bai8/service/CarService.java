package bai_tap.bai8.service;

import bai_tap.bai8.entity.Car;
import bai_tap.bai8.reponsitory.CarReponsitory;

import java.util.List;

public class CarService  implements ICarService{
CarReponsitory carReponsitory=new CarReponsitory();


    @Override
    public void addCar(Car car) {
        if (carReponsitory.addCar(car)) {
    System.out.println("thêm thành công");

}else {
    System.out.println("thêm không thành công");
}

    }


    @Override
    public List<Car> findAllCars() {
return carReponsitory.findAllCars();
    }

    @Override
    public void deleteCar(String id) {
if (carReponsitory.deleteCar(id)) {
    System.out.println("xóa thành công");
}else {
    System.out.println("xóa không thành công");
}

    }

    @Override
    public void updateCar(Car car) {

    }

    @Override
    public void updateCar(String id, Car car) {
        if (carReponsitory.updateCar(id, car)) {
            System.out.println("Car updated successfully");
        } else   {
            System.out.println("Car not found");
        }

    }
}
