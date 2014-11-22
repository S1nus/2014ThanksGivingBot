/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.Timer;
/**
 *
 * @author sadmin
 */
public class AirCannon extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Solenoid barrelSolenoid = new Solenoid(RobotMap.barrelSolenoidPort);
    Solenoid tankSolenoid = new Solenoid(RobotMap.tankSolenoidPort);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void firingSequence() {
        tankSolenoid.set(true);
        Timer.delay(.5);
        tankSolenoid.set(false);
        Timer.delay(0.125);
        barrelSolenoid.set(true);
        Timer.delay(1.0);
        barrelSolenoid.set(false);
        Timer.delay(1.0);
    }
}
