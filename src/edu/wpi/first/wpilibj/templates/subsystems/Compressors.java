/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.RunCompressors;
/**
 *
 * @author sadmin
 */
public class Compressors extends Subsystem {
    
    //WARNING the compressors are relays due to the maximum of one compressor
    Relay compressor1 = new Relay(RobotMap.compressor1spike);
    Relay compressor2 = new Relay(RobotMap.compressor2spike);
    
    public void startCompressors() {
        compressor1.set(Relay.Value.kForward);
        compressor2.set(Relay.Value.kForward);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new RunCompressors());
    }
}
