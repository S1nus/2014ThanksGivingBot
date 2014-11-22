
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.Fire;
import edu.wpi.first.wpilibj.templates.commands.PitchDown;
import edu.wpi.first.wpilibj.templates.commands.PitchUp;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public static Joystick leftstick = new Joystick(RobotMap.leftstickport);
    public static Joystick rightstick = new Joystick(RobotMap.rightstickport);
    JoystickButton trigger = new JoystickButton(leftstick, 8);
    JoystickButton buttonUp = new JoystickButton(leftstick, 11);
    JoystickButton buttonDown = new JoystickButton(leftstick, 10);
    public OI() {
        trigger.whenPressed(new Fire());
        buttonUp.whileHeld(new PitchUp());
        buttonDown.whileHeld(new PitchDown());
    }
}

