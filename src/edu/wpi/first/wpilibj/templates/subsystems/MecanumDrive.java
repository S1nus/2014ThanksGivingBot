/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.Drive;
/**
 *
 * @author sadmin
 */
public class MecanumDrive extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive drive = new RobotDrive(RobotMap.frontLeft, RobotMap.rearLeft, 
                                      RobotMap.frontRight, RobotMap.rearRight);
    
    public void mecanumDrive(Joystick stick1, Joystick stick2) {
        drive.mecanumDrive_Cartesian(stick1.getX(), stick2.getX(), stick1.getY(), 0);
    }
    
    public void stop() {

    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new Drive());
    }
}