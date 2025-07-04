package bai_tap.bai8.controller;

import bai_tap.bai8.entity.Motor;
import bai_tap.bai8.service.IMotorService;
import bai_tap.bai8.service.MotorService;

import java.util.List;

public class MotorController {
private IMotorService motorService=new MotorService();

    public void addMotor(Motor motor) { motorService.addMotor(motor); }

    public List<Motor> getMotors() { return motorService.findAllMotors(); }

    public void deleteMotor(String id) { motorService.deleteMotor(id);}

    public void updateMotor(String id, Motor motor) { motorService.updateMotor(id, motor); }
}
