package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    //Drivetrain motors
    public static final int frontLeft = 1;
    public static final int frontRight = 2;
    public static final int rearLeft = 3;
    public static final int rearRight = 4;
    
    //Joysticks
    public static final int leftstickport = 1;
    public static final int rightstickport = 2;
    
    //Solenoid
    public static final int barrelSolenoidPort = 1;
    public static final int tankSolenoidPort = 2;
    
    //Compressors
    public static final int compressor1spike = 1;
    public static final int compressor1switch = 2;
    public static final int compressor2spike = 3;
    public static final int compressor2switch = 4;
    
    //Motors
    public static final int pitchPort = 5;
    
    //Limit Switches
    public static final int limitSwitchTopPort = 1;
    public static final int limitSwitchBottomPort = 2;
}
