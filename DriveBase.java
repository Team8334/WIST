package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class DriveBase {
    // THESE Numbers might need updated
    private Integer frontLeftMotorCadId = 0;
    private Integer backLeftMotorCadId = 1;
    private Integer frontRightMotorCadId = 2;
    private Integer backRightMotorCadId = 3;

    private final SparkMax  m_leftFrontDrive = new SparkMax (frontLeftMotorCadId, MotorType.kBrushless);
    private final SparkMax  m_backLeftDrive = new SparkMax (backRightMotorCadId, MotorType.kBrushless);

    public DriveBase() {

    }

    public void move() {
        this.m_backLeftDrive.set(-1);
        this.m_leftFrontDrive.set(-1);
    }

    public void goBackwards() {
    }

    public void goForwards() {
    }

    
}
