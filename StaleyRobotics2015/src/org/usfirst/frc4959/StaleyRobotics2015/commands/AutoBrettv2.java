package org.usfirst.frc4959.StaleyRobotics2015.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Author - Brett Rowald
 */

public class AutoBrettv2 extends CommandGroup {
    
    public  AutoBrettv2() {
    	addSequential(new Delay());
    }
}
