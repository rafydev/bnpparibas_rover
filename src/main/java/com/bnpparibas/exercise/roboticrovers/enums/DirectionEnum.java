package com.bnpparibas.exercise.roboticrovers.enums;

/**
 * Enum with four possible directions
 * @author rafyq
 *
 */
public enum DirectionEnum {
	/** North */
	N(0),
	/** East */
	E(1),
	/** South */
	S(2),
	/** West */
	W(3);

	private final int order;

	DirectionEnum(int order) {
		this.order = order;
	}

	/**
	 * the order of the direction
	 * @return
	 */
	public int getOrder() {
		return order;
	}
	/**
	 * return all directions
	 * 
	 * @return
	 */
	public static DirectionEnum[] getDirections() {
		return DirectionEnum.values();
	}

}
