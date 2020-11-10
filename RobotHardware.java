package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RobotHardware {
    public DcMotor leftDrive = null;
    public DcMotor rightDrive = null;

    HardwareMap hwMap = null;

    public RobotHardware(){

    }

    public void init (HardwareMap ahwMap){
        hwMap = ahwMap;

        leftDrive = hwMap.get(DcMotor.class, "ld");
        rightDrive = hwMap.get(DcMotor.class, "rd");
        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);
        leftDrive.setPower(0);
        rightDrive.setPower(0);
        leftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}