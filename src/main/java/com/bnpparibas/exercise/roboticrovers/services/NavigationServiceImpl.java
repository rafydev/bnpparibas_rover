package com.bnpparibas.exercise.roboticrovers.services;

import java.util.List;

import com.bnpparibas.exercise.roboticrovers.domains.Rover;
import com.bnpparibas.exercise.roboticrovers.enums.ActionEnum;
import com.bnpparibas.exercise.roboticrovers.enums.DirectionEnum;
import com.bnpparibas.exercise.roboticrovers.utils.ActionsConverter;

public class NavigationServiceImpl implements NavigationService {


	/**
	 * {{ {@inheritDoc}
	 */
	@Override
	public Rover applyActions(Rover rover, String commands) {
		//TODO No rule to follow is specified if the commands is not corrects
		List<ActionEnum> actions = ActionsConverter.getActions(commands);
		for (ActionEnum actionsEnum : actions) {
			switch (actionsEnum) {
			case M:
				moveForward(rover);
				break;
			case R:
				turnRight(rover);
				break;
			case L:
				turnLeft(rover);
				break;
			default:
				break;
			}
		}
		return rover;

	}

	/**
	 * Move forward the rover one grid in a specific direction
	 * @param rover rover to move
	 */
	private void moveForward(Rover rover) {
		//TODO No rule to implement is specified to prevent the rover from leaving the plan
		switch (rover.getDirection()) {
		case N:
			rover.increaseY();
			break;
		case E:
			rover.increaseX();
			break;
		case S:
			rover.decreaseY();
			break;
		case W:
			rover.decreaseX();
			break;
		default:
			break;
		}
	}

	/**
	 * Spin the rover 90 degrees right
	 * @param rover rover to spin
	 */
	private void turnRight(Rover rover) {
		DirectionEnum[] orderdDirections = DirectionEnum.getDirections();
		rover.setDirection(orderdDirections[(rover.getDirection().getOrder() + 1) % 4]);
	}

	/**
	 * Spin the rover 90 degrees left
	 * @param rover rover to spin
	 */
	private void turnLeft(Rover rover) {
		DirectionEnum[] orderdDirections = DirectionEnum.getDirections();
		rover.setDirection(orderdDirections[(rover.getDirection().getOrder() + 3) % 4]);
	}

}
