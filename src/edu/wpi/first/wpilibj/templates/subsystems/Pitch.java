/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author sadmin
 */
public class Pitch extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Jaguar pitchMotor = new Jaguar(RobotMap.pitchPort);
    DigitalInput limitSwitchTop = new DigitalInput(RobotMap.limitSwitchTopPort);
    DigitalInput limitSwitchBottom = new DigitalInput(RobotMap.limitSwitchBottomPort);

    public void goUp() {
        if (!limitSwitchTop.get()) {
            pitchMotor.set(0.25);
        }
    }

    public void goDown() {
        if (!limitSwitchBottom.get()) {
            pitchMotor.set(-.25);
        }
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
