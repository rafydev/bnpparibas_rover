package com.bnpparibas.exercise.roboticrovers.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.bnpparibas.exercise.roboticrovers.enums.ActionEnum;

/**
 * Helper class to get a list of actions from a given string 
 * @author rrafyq
 *
 */
public class ActionsConverter {

	
	/**
	 * Convert the a string to a list of actions 
	 * @param actions
	 * @return
	 */
	public static List<ActionEnum> getActions(String actions) {
		
		List<String> actionsList = Arrays.asList(actions.split(""));
		List<ActionEnum> enumActionsList = actionsList.stream().map(ActionEnum::valueOf).collect(Collectors.toList());
		
		return enumActionsList;
	}
}
