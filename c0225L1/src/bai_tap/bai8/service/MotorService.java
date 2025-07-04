package bai_tap.bai8.service;

import bai_tap.bai8.entity.Motor;
import bai_tap.bai8.reponsitory.MotoReponsitory;

import java.util.List;

public class MotorService implements IMotorService {
    MotoReponsitory motoReponsitory = new MotoReponsitory();

    @Override
    public void addMotor(Motor motor) {
        if (motoReponsitory.addMotor(motor)) {
            System.out.println("Motor added successfully");
        } else {
            System.out.println("Motor add failed");
        }

    }

    @Override
    public List<Motor> findAllMotors() {

        return motoReponsitory.findALlMotors();
    }

    @Override
    public void deleteMotor(String id) {
        if (motoReponsitory.deleteMotor(id)) {
            System.out.println("Motor deleted successfully");
        } else  {
            System.out.println("Motor delete failed");
        }

    }

    @Override
    public void updateMotor(String id, Motor motor) {
        if (motoReponsitory.updateMotor(id, motor)) {
            System.out.println("Motor updated successfully");
        } else  {
            System.out.println("Motor updated failed");
        }


    }

    @Override
    public void searchMotor(String name) {

    }
}
