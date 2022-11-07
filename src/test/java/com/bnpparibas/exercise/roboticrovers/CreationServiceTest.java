package com.bnpparibas.exercise.roboticrovers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnpparibas.exercise.roboticrovers.domain.Plan;
import com.bnpparibas.exercise.roboticrovers.domain.Rover;
import com.bnpparibas.exercise.roboticrovers.enums.DirectionEnum;
import com.bnpparibas.exercise.roboticrovers.service.CreationService;
import com.bnpparibas.exercise.roboticrovers.service.CreationServiceImpl;
import com.bnpparibas.exercise.roboticrovers.service.NavigationService;
import com.bnpparibas.exercise.roboticrovers.service.NavigationServiceImpl;

/**
 * Unit test for creation service.
 */
public class CreationServiceTest {
	NavigationService navigationService = new NavigationServiceImpl();
	CreationService creationRobotService = new CreationServiceImpl();

	/**
	 * Test creation of plan from string
	 */
	@Test
	public void shouldCreatePlanFromString() {
		Plan plan = creationRobotService.getPlan("1 2");
		assertEquals(1, plan.getMaxPositionX(),  "The created plan is not valid");
		assertEquals(2, plan.getMaxPositionY(),  "The created plan is not valid");
	}
	

	/**
	 * Test creation of rover from string
	 */
	@Test
	public void shouldCreateRobotFromString() {
		Rover rover = creationRobotService.getRobot("1 2 W");
		assertEquals(1, rover.getPositionX(),  "The created rover is not valid");
		assertEquals(2, rover.getPositionY(),  "The created rover is not valid");
		assertEquals(DirectionEnum.W, rover.getDirection(),  "The created rover is not valid");
	}
}
