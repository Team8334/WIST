package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Controller extends XboxController {

    private XboxController xboxController;
    private static Controller instance = null;

    boolean bReleased;

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller(0);
        }
        return instance;
    }

    public Controller(int portNumber) {
        super(portNumber);
        this.xboxController = this;
    }

    public double getStick(ButtonMap stickAxis)
    {
        if (this.xboxController != null)
        {
            try
            {
                switch (stickAxis)
                {
                    case XboxLEFTSTICKX:
                        return xboxController.getRawAxis(0);
                    case XboxLEFTSTICKY:
                        return xboxController.getRawAxis(1);
                    case XboxRIGHTSTICKX:
                        return xboxController.getRawAxis(4);
                    case XboxRIGHTSTICKY:
                        return xboxController.getRawAxis(5);
                    case XboxRIGHTTrigger:
                        return xboxController.getRawAxis(3);
                    case XboxLEFTTrigger:
                        return xboxController.getRawAxis(2);
                    default:
                        return 0;
                }
            }
            catch (Exception AxisNotFound)
            {
                SmartDashboard.putString("ControllerError", "AxisNotFound");
                return 0;
            }
        }
        else
        {
            return 0;
        }
    }

    public boolean getButton(ButtonMap button)
    {
        if (this.xboxController != null)
        {
            try
            {
                switch (button)
                {
                    case XboxA:
                        return xboxController.getAButton();
                    case XboxB:
                        return xboxController.getBButton();
                    case XboxX:
                        return xboxController.getXButton();
                    case XboxY:
                        return xboxController.getYButton();
                    case XboxBACK:
                        return xboxController.getBackButton();
                    case XboxSTART:
                        return xboxController.getStartButton();
                    case XboxLEFTBumper:
                        return xboxController.getLeftBumperPressed();
                    case XboxRIGHTBumper:
                        return xboxController.getRightBumperPressed();
                    case XboxLEFTSTICKBUTTON:
                        return xboxController.getLeftStickButton();
                    case XboxRIGHTSTICKBUTTON:
                        return xboxController.getRightStickButton();
                    default:
                        return false;
                }
            }
            catch (Exception ButtonNotFound)
            {
                SmartDashboard.putString("ControllerError", "ButtonNotFound");
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean debounceB()
    {
        if (getButton(ButtonMap.XboxB) && bReleased)
        {
            bReleased = false;
            return true;
        }
        else
        {
            bReleased = !getButton(ButtonMap.XboxB);
            return false;
        }
    }
}
