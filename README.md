# WIST
Women in STEM Camp

## Setup the Code
Copy the ButtonMap.java, Controller.java, and DriveBase.java into src\main\java\frc\robot of your project.

Install the needed dependencies by selecting the WPILib icon again and selected Manage Vendor Libraries > Install New Libraries > CTRE Phoenix 5.

In Robot.java of your project, add the followign two lines right below line 21.
` private DriveBase driveBase = new DriveBase();
  private Controller driverController = new Controller(0);
  `

  The rest of your changes should be added to teleopPeriodic (line 83), you can do things like getting if the A button is pressed and driving backwards only when that is true
  `// this line gets the XboxA button from the controller
    if (this.driverController.getButton(ButtonMap.XboxA)) {
      // this calls the code in the DriveBase Class to go backwards
      this.driveBase.goBackwards();
    }
    `

