package frc.robot;

public enum ButtonMap
{
    // Xbox Controllers Button Map. IMPORTANT: values change depending on
    // controller!
    XboxA(1),
    XboxB(2),
    XboxX(3),
    XboxY(4),
    XboxLEFTBumper(5),
    XboxRIGHTBumper(6),
    XboxBACK(7),
    XboxSTART(8),
    XboxLEFTSTICKX(-5),
    XboxLEFTSTICKY(-6),
    XboxRIGHTSTICKX(-7),
    XboxRIGHTSTICKY(-8),
    XboxLEFTSTICKBUTTON(9),
    XboxRIGHTSTICKBUTTON(10),
    XboxRIGHTTrigger(3),
    XboxLEFTTrigger(2);

    public int value;

    private ButtonMap(int buttonValue)
    {
        this.value = buttonValue;
    }
}
