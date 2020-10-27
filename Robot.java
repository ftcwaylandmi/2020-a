package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime; 
import org.firstinspires.ftc.teamcode.RobotHardware;
public class Robot {
    RobotHardware myself = new RobotHardware();
    double InchesPerSecond=2.00;
    public void initHW(HardwareMap ahwMap){
        myself. init (ahwMap);
    }
    public void Drive(double s) {
        myself.leftfrontDrive.setPower(s);
        myself.rightfrontDrive.setPower(s);
        myself.leftbackDrive.setPower(s);
        myself.rightbackDrive.setPower(s);
    }

    public void StopDrive() {
        myself.leftfrontDrive.setPower(0);
        myself.rightfrontDrive.setPower(0);
        myself.leftbackDrive.setPower(0);
        myself.rightbackDrive.setPower(0);
    }

    public void SpinRight(double s) {
        myself.leftfrontDrive.setPower(s);
        myself.rightfrontDrive.setPower(-s);
        myself.leftbackDrive.setPower(s);
        myself.rightbackDrive.setPower(-s);
    }

    public void SpinLeft(double s) {
        myself.leftfrontDrive.setPower(-s);
        myself.rightfrontDrive.setPower(s);
        myself.leftbackDrive.setPower(-s);
        myself.rightbackDrive.setPower(s);
    }

    public void RightDrive(double s) {
        myself.leftfrontDrive.setPower(s);
        myself.rightfrontDrive.setPower(0);
        myself.leftbackDrive.setPower(s);
        myself.rightbackDrive.setPower(0);
    }

    public void LeftDrive(double s) {
        myself.leftfrontDrive.setPower(0);
        myself.rightfrontDrive.setPower(s);
        myself.leftbackDrive.setPower(0);
        myself.rightbackDrive.setPower(s);
    }

    public void DriveByInchesTimeSetPower( int inches, double power) {
        double waitTime = 0.00;
        if (inches > 0) {
            power = power * -1;
            waitTime = inches * InchesPerSecond;
            myself.leftfrontDrive.setPower(power);
            myself.leftbackDrive.setPower(power);
            myself.rightfrontDrive.setPower(power);
            myself.rightbackDrive.setPower(power);
        } else {
            waitTime = -inches * InchesPerSecond;
            myself.leftfrontDrive.setPower(power);
            myself.leftbackDrive.setPower(power);
            myself.rightfrontDrive.setPower(power);
            myself.rightbackDrive.setPower(power);
        }
        ElapsedTime timer =  new ElapsedTime();
        timer.reset();
        while (timer.milliseconds() < (waitTime* 100)) {

        }
        myself.leftfrontDrive.setPower(0);
        myself.leftbackDrive.setPower(0);
        myself.rightfrontDrive.setPower(0);
        myself.rightbackDrive.setPower(0);

    }







}






