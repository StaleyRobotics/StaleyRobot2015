// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4959.StaleyRobotics2015;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    public static SpeedController leftTalon;
    public static SpeedController rightTalon;
    public static SpeedController backTalon;
    public static SpeedController frontTalon;
    public static RobotDrive drivetrainRobotDrive;
    public static AnalogPotentiometer elevatorPotentiometer;
    public static SpeedController elevatorelevatorTalon;

    public static void init() {
    	/*
    	 * Battery side is front
    	 * 1 is left
    	 * 2 is right
    	 * 3 is back
    	 * 4 is front
    	 * 
    	 * MOVE RIGHT - left and right off, front inverted, back normal
    	 * MOVE LEFT - left and right off, front normal, left inverted
    	 * MOVE FOWARD - left inverted, right normal, front and back off
    	 * MOVE BACKWARD - left normal, right inverted, front and back off
    	 */
 
    	leftTalon = new Talon(1);
    	rightTalon = new Talon(2);
    	backTalon = new Talon(3);
    	frontTalon = new Talon(4);
    	
    	drivetrainRobotDrive = new RobotDrive(leftTalon, backTalon, frontTalon, rightTalon);
    	
    	drivetrainRobotDrive.setInvertedMotor( MotorType.kFrontLeft, true);
    	drivetrainRobotDrive.setInvertedMotor( MotorType.kRearLeft, false);
    	drivetrainRobotDrive.setInvertedMotor( MotorType.kFrontRight, true);
    	drivetrainRobotDrive.setInvertedMotor( MotorType.kRearRight, false);
    	
    	drivetrainRobotDrive.setSafetyEnabled(true);
    	drivetrainRobotDrive.setExpiration(0.1);
    	drivetrainRobotDrive.setSensitivity(0.5);
    	drivetrainRobotDrive.setMaxOutput(0.3);
    }
}
