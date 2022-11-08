package com.bnpparibas.exercise.roboticrovers.services;

import com.bnpparibas.exercise.roboticrovers.domains.Plan;
import com.bnpparibas.exercise.roboticrovers.domains.Rover;

/**
 * Service for creating rover and plan from provided string 
 * @author rafyq
 *
 */
public interface CreationService {
	/**
	 * Create a rover from a string containing the initial positions and direction
	 * @param definition the initial position and direction 
	 * @return rover 
	 */
	Rover getRobot(String definition);
	
	/**
	 * Create the plan of the plateau from positions given in a string 
	 * @param definition position of the plateau
	 * @return
	 */
	Plan getPlan(String definition);
}
