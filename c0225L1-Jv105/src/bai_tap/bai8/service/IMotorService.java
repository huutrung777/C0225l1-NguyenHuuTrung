package bai_tap.bai8.service;

import bai_tap.bai8.entity.Motor;

import java.util.List;

public interface IMotorService {
    void addMotor(Motor motor);
    List<Motor> findAllMotors();
    void deleteMotor(String id);
    void updateMotor(String id, Motor motor);
    void searchMotor(String name);

}
