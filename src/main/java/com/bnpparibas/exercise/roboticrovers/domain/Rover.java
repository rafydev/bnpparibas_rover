package com.bnpparibas.exercise.roboticrovers.domain;

import com.bnpparibas.exercise.roboticrovers.enums.DirectionEnum;

/**
 * Positions and direction of the rover
 * @author rrafyq
 *
 */
public class Rover {
	/**
	 * x coordinate
	 */
	private int positionX;
	/**
	 * y coordinate
	 */
	private int positionY;
	/**
	 * rover direction
	 */
	private DirectionEnum direction;
	
	/**
	 * print the final position and direction of the rover after applying all commands
	 */
	public void printFinalState() {
		System.out.println(this.getPositionX() + " " + this.getPositionY() + " " + this.getDirection());
	}
	
	public DirectionEnum getDirection() {
		return direction;
	}
	public void setDirection(DirectionEnum direction) {
		this.direction = direction;
	}
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	
	public void increaseX() {
		this.positionX++;
	}

	public void increaseY() {
		this.positionY++;
	}
	public void decreaseX() {
		this.positionX--;
	}
	public void decreaseY() {
		this.positionY--;
	}
	
	
	
}
