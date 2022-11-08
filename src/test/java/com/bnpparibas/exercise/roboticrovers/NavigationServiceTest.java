package com.bnpparibas.exercise.roboticrovers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bnpparibas.exercise.roboticrovers.domains.Rover;
import com.bnpparibas.exercise.roboticrovers.enums.DirectionEnum;
import com.bnpparibas.exercise.roboticrovers.services.CreationService;
import com.bnpparibas.exercise.roboticrovers.services.CreationServiceImpl;
import com.bnpparibas.exercise.roboticrovers.services.NavigationService;
import com.bnpparibas.exercise.roboticrovers.services.NavigationServiceImpl;

/**
 * Unit test for navigation service.
 */
public class NavigationServiceTest {
	NavigationService navigationService = new NavigationServiceImpl();
	CreationService creationRobotService = new CreationServiceImpl();

	/**
	 * Test spin 90 degrees left
	 */
	@Test
	public void shouldSpin90Left() {
		Rover rover = createRobot(1,2,DirectionEnum.N);
		navigationService.applyActions(rover, "L");
		assertEquals(1, rover.getPositionX(), "The final position of the rover is not correct");
		assertEquals(2, rover.getPositionY(), "The final position of the rover is not correct");
		assertEquals(DirectionEnum.W, rover.getDirection() , "The final orientation of the rover is not correct");
	}

	/**
	 *  Test spin 90 degrees right
	 */
	@Test
	public void shouldSpin90Right() {
		Rover rover = createRobot(1,2,DirectionEnum.N);
		navigationService.applyActions(rover, "R");
		assertEquals(1, rover.getPositionX(), "The final position of the rover is not correct");
		assertEquals(2, rover.getPositionY(), "The final position of the rover is not correct");
		assertEquals(DirectionEnum.E,rover.getDirection(),  "The final orientation of the rover is not correct");
	}
	
	/**
	 * Test move forward direction north
	 */
	@Test
	public void shouldMoveForwardNorth() {
		Rover rover = createRobot(1,2,DirectionEnum.N);
		navigationService.applyActions(rover, "M");
		assertEquals(1, rover.getPositionX(), "The final position of the rover is not correct");
		assertEquals(3, rover.getPositionY(), "The final position of the rover is not correct");
		assertEquals(DirectionEnum.N, rover.getDirection(), "The final orientation of the rover is not correct");
	}
	
	/**
	 * Test move forward direction east
	 */
	@Test
	public void shouldMoveForwardEast() {
		Rover rover = createRobot(1,2,DirectionEnum.E);
		navigationService.applyActions(rover, "M");
		assertEquals(2, rover.getPositionX(), "The final position of the rover is not correct");
		assertEquals(2, rover.getPositionY(), "The final position of the rover is not correct");
		assertEquals(DirectionEnum.E, rover.getDirection(), "The final orientation of the rover is not correct");
	}
	
	/**
	 * Test move forward direction south
	 */
	@Test
	public void shouldMoveForwardSouth() {
		Rover rover = createRobot(1,2,DirectionEnum.S);
		navigationService.applyActions(rover, "M");
		assertEquals(1, rover.getPositionX(), "The final position of the rover is not correct");
		assertEquals(1, rover.getPositionY(), "The final position of the rover is not correct");
		assertEquals(DirectionEnum.S, rover.getDirection(), "The final orientation of the rover is not correct");
	}
	
	/**
	 * Test move forward direction ouest
	 */
	@Test
	public void shouldMoveForwardWest() {
		Rover rover = createRobot(1,2,DirectionEnum.W);
		navigationService.applyActions(rover, "M");
		assertEquals(0, rover.getPositionX(), "The final position of the rover is not correct");
		assertEquals(2, rover.getPositionY(), "The final position of the rover is not correct");
		assertEquals(DirectionEnum.W, rover.getDirection(), "The final orientation of the rover is not correct");
	}
	
	/**
	 * Create a rover
	 * @param x initial position x of the rover
	 * @param y initial position y of the rover
	 * @param direction initial direction of the rover
	 * @return the final state of the rover
	 */
	private Rover createRobot(int x, int y, DirectionEnum direction) {
		Rover rover = new Rover();
		rover.setPositionX(x);
		rover.setPositionY(y);
		rover.setDirection(direction);
		return rover;
	}
	

}
