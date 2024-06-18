package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class DriveBase {
    WPI_VictorSPX frontLeftMotor;
    WPI_VictorSPX frontRightMotor;
    WPI_VictorSPX backLeftMotor;
    WPI_VictorSPX backRighttMotor;
    // WPI_VictorSPX mockMotor;

    public DriveBase() {
        this.frontLeftMotor = new WPI_VictorSPX(10);
        this.backLeftMotor = new WPI_VictorSPX(1);
        
        this.frontRightMotor = new WPI_VictorSPX(3);
        this.backRighttMotor = new WPI_VictorSPX(2);

        // this.mockMotor = new WPI_VictorSPX(0);
    }

    public void stop() {
        // this.mockMotor.set(0);
    }

    public void goBackwards() {
        // this.mockMotor.set(-1);
    }

    public void goForwards() {
        // this.mockMotor.set(1);
    }

    
}
