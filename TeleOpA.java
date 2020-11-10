package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="TeleOpA", group="11846")
public class TeleOpA extends OpMode{
    Robot myrobot = new Robot();
    double left = 0.00;
    double right = 0.00;

    @Override
    public void init() {
        myrobot.initHW(hardwareMap);

    }

    @Override
    public void loop() {
        left = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;

        if (gamepad1.right_bumper) {
            myrobot.Drive(1,1);
        }else{
            myrobot.Drive(1/2,1/2);
        }
    }
}