package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime; 
import org.firstinspires.ftc.teamcode.RobotHardware;
public class Robot {
    RobotHardware myself = new RobotHardware();
    double InchesPerSecond = 0.17;
    public void initHW(HardwareMap ahwMap){
        myself. init (ahwMap);
    }
    private double DegreesPerSecond = .46;
    private boolean moving;
    public void initrobot(){
        moving=false;
    }


    public void Drive(double lpower, double rpower) {
        myself.leftDrive.setPower(lpower);
        myself.rightDrive.setPower(rpower);
        moving=true;
    }
    public void driveForward(double power){
        Drive(power,power);
    }
    public void driveReverse(double power){
        Drive(-power,-power);
    }
    public void driveLeft(double power){
        Drive(-power,power);
    }
    public void driveRight(double power){
        Drive(power,-power);
    }
    public boolean ISMoving(){
        return moving;
    }


    public void StopDrive() {
        myself.leftDrive.setPower(0);
        myself.rightDrive.setPower(0);
        moving=false;
    }

    public void DriveByInchesTimeSetPower( int inches, double power) {
        double waitTime = 0.00;
        if (inches > 0) {

            waitTime = inches * InchesPerSecond;
            Drive(power,power);
        } else {
            inches = -inches;
            waitTime = -inches * InchesPerSecond;
            Drive(-power,-power);

        }
        ElapsedTime timer =  new ElapsedTime();
        timer.reset();
        while (timer.milliseconds() < (waitTime* 100)) {

        }
        StopDrive();
    }
    public void TurnByDegrees( int degrees) {
        moving = true;
        double power = 1;

        double waitTime = 0;
        if (degrees > 0) {
            waitTime = degrees * DegreesPerSecond;
            myself.leftDrive.setPower(-power);
            myself.rightDrive.setPower(power);
        } else {
            waitTime = -degrees * DegreesPerSecond;
            myself.leftDrive.setPower(power);
            myself.rightDrive.setPower(-power);
        }

        ElapsedTime timer =  new ElapsedTime();
        timer.reset();
        while (timer.milliseconds() < (waitTime*10)) {

        }
        myself.leftDrive.setPower(0);
        myself.rightDrive.setPower(0);
        moving = false;

    }







}






