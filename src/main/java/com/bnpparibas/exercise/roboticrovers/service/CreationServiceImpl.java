package com.bnpparibas.exercise.roboticrovers.service;

import com.bnpparibas.exercise.roboticrovers.domain.Plan;
import com.bnpparibas.exercise.roboticrovers.domain.Rover;
import com.bnpparibas.exercise.roboticrovers.enums.DirectionEnum;

/**
 * {{@inheritDoc}
 * @author rafyq
 *
 */
public class CreationServiceImpl implements CreationService {

	/**
	 * {{@inheritDoc}
	 */
	public Rover getRobot(String definition) {
		//TODO No rule to follow is specified if the definition is not correct
		Rover rover = new Rover();
		rover.setPositionX(Integer.parseInt(definition.split(" ")[0]));
		rover.setPositionY(Integer.parseInt(definition.split(" ")[1]));
		rover.setDirection(DirectionEnum.valueOf(definition.split(" ")[2]));
		return rover;

	}

	/**
	 * {{@inheritDoc}
	 */
	public Plan getPlan(String coordinates) {
		//TODO No rule to follow is specified if the definition is not correct
		Plan plan = new Plan();
		plan.setMaxPositionX(Integer.parseInt(coordinates.split(" ")[0]));
		plan.setMaxPositionY(Integer.parseInt(coordinates.split(" ")[1]));
		return plan;
	}

}
