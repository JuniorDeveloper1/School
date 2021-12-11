package Fifa;

import Fifa.StatsManager.TotalSkills;

public class Results {

	/*
	 * Dribbeling
	 * Defence
	 * Passing
	 * Physical
	 * Shooting
	 */
	
	public static void results () {
		System.out.println("Dribbeling = " + TotalSkills.ballSkills() ); 
		
		System.out.println("Defence = " + TotalSkills.defence() );
		
		System.out.println("Passing = " + TotalSkills.passing());
		
		System.out.println("Physical = " + TotalSkills.physical());
		
		System.out.println("Shooting = " + TotalSkills.shooting());
		
		
		
	}

}
