package com.bnpparibas.exercise.roboticrovers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bnpparibas.exercise.roboticrovers.domains.Rover;
import com.bnpparibas.exercise.roboticrovers.services.CreationService;
import com.bnpparibas.exercise.roboticrovers.services.CreationServiceImpl;
import com.bnpparibas.exercise.roboticrovers.services.NavigationService;
import com.bnpparibas.exercise.roboticrovers.services.NavigationServiceImpl;

/**
 * 
 * Application to move rovers from an initial to a final position on a plateau using a series of commands.
 * @author rrafyq
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		//Check if the file of input data is provided
		if (args.length != 1) {
			System.out.println("The path of the input file is missing from the parameter.");
			System.exit(0);
		}

		// Services instantiation
		NavigationService navigationService = new NavigationServiceImpl();
		CreationService creationRobotService = new CreationServiceImpl();
		
		// Creating file instance to reference the input
		File file = new File(args[0]);
		
		//Read data from file
		try(Scanner scnr = new Scanner(file)) {
			
			// Read the plateau coordinates from the first line
			creationRobotService.getPlan(scnr.nextLine());

			// Read the rover positions and navigational actions from next lines.
			while (scnr.hasNextLine()) {
				
				// Create the rover from the definition
				Rover rover = creationRobotService.getRobot(scnr.nextLine());

				// Apply the navigation actions on the rover
				rover = navigationService.applyActions(rover, scnr.nextLine());

				// Print the final position of the rover
				rover.printFinalState();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error while reading file "+ e.getMessage());
			System.exit(0);
		}

	}
}
