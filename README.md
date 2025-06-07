# WIST
Women in STEM Camp

## Setup the Code
### Copying Three Files
Copy the ButtonMap.java, Controller.java, and DriveBase.java into src\main\java\frc\robot of your project. You can do this either by cloning this github repo and copying it over OR creating a new file titled those file names and then copying and pasting the contents into the file.

## Setting up Robot.java
In Robot.java of your project, add the followign two lines right below line 21.
```
private DriveBase driveBase = new DriveBase();
private Controller driverController = new Controller(0);
```

  The rest of your changes should be added to teleopPeriodic (line 83), you can do things like getting if the A button is pressed and driving backwards only when that is true
```
// this line gets the XboxA button from the controller
if (this.driverController.getButton(ButtonMap.XboxA)) {
// this calls the code in the DriveBase Class to go backwards
this.driveBase.goBackwards();
}
```

## Test The Code
### Run a Build
WPILib button > Build Robot Code
If this is green/shows successful, congrats, it built locally!
If this errors, use the errors to figure out what is going on.

### Deploy to the Robot
Ensure you have connected to the robot's wifi.
WPILib button > Deploy Robot Code

