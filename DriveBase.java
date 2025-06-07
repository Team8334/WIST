package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class DriveBase {
    // THESE Numbers might need updated
    private frontLeftMotorCadId = 0;
    private backLeftMotorCadId = 1;
    private frontRightMotorCadId = 2;
    private backRightMotorCadId = 3;

    private final SparkMax  m_leftFrontDrive = new SparkMax (frontLeftMotorCadId, MotorType.kBrushless);
    private final SparkMax  m_backLeftDrive = new SparkMax (backRightMotorCadId, MotorType.kBrushless);

    public DriveBase() {

    }

    public void move() {
    }

    public void goBackwards() {
    }

    public void goForwards() {
    }

    
}
