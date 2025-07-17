package frc.robot;

import frc.robot.Data.PortMap;
import frc.robot.Devices.NEOSparkMaxMotor;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.MecanumDriveKinematics;
import edu.wpi.first.math.kinematics.MecanumDriveWheelSpeeds;

public class DriveBase {
    // THESE Numbers might need updated
    private Integer frontLeftMotorCadId = 0;
    private Integer backLeftMotorCadId = 1;
    private Integer frontRightMotorCadId = 2;
    private Integer backRightMotorCadId = 3;

    private final SparkMax  m_leftFrontDrive = new SparkMax (frontLeftMotorCadId, MotorType.kBrushless);
    private final SparkMax  m_backLeftDrive = new SparkMax (backRightMotorCadId, MotorType.kBrushless);

    // distance of wheels from center in meters
    Translation2d m_frontLeftLocation = new Translation2d(0.381, 0.381); // these are not actually measured
    Translation2d m_frontRightLocation = new Translation2d(0.381, -0.381); // these are not actually measured
    Translation2d m_backLeftLocation = new Translation2d(-0.381, 0.381); // these are not actually measured
    Translation2d m_backRightLocation = new Translation2d(-0.381, -0.381); // these are not actually measured

    // Creating my kinematics object using the wheel locations.
    MecanumDriveKinematics m_kinematics = new MecanumDriveKinematics(
            m_frontLeftLocation, m_frontRightLocation, m_backLeftLocation, m_backRightLocation);

    public DriveBase() {

    }
    public void drive(){
        ChassisSpeeds speeds = new ChassisSpeeds(forward, strafe, rotation);
        // Convert to wheel speeds
        MecanumDriveWheelSpeeds wheelSpeeds = m_kinematics.toWheelSpeeds(speeds);
        // Get the individual wheel speeds
        frontLeft = wheelSpeeds.frontLeftMetersPerSecond;
        frontRight = wheelSpeeds.frontRightMetersPerSecond;

        frontLeftMotor.set(frontLeft*-1);
        frontRightMotor.set(frontRight);
    }

    public void goBackwards() {
    }

    public void goForwards() {
    }

    
}
