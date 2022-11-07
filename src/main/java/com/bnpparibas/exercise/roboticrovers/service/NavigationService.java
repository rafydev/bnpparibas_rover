package com.bnpparibas.exercise.roboticrovers.service;

import com.bnpparibas.exercise.roboticrovers.domain.Rover;

public interface NavigationService {
	
	/**
	 * Move the rover from initial to a final position following a series of commands
	 * 
	 * @param rover rover to move
	 * @param commands commands to follow to move the rover
	 * @return the final position the robot
	 */
	Rover applyActions(Rover rover, String commands);

}
