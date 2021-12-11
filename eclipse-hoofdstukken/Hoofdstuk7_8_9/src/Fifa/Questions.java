package Fifa;

import java.util.Scanner;

import Fifa.StatsManager.BallSkills;
import Fifa.StatsManager.Defence;
import Fifa.StatsManager.Passing;
import Fifa.StatsManager.Physical;
import Fifa.StatsManager.Shooting;

public class Questions {

	
	public static void stats() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Beantwoord volgede vragen in decimalen. Niet onder de komma \n\n");
		//BallSkills
		System.out.println("Ballcontrol: ");
		int ballcont = scanner.nextInt();
		BallSkills.setBallcontrol(ballcont);
		
		System.out.println("Dribbeling: ");
		int dribbeling = scanner.nextInt();
		BallSkills.setDribbeling(dribbeling);
		
		//Physical
		System.out.println("Acceleration: ");
		int acceleration = scanner.nextInt();
		Physical.setAcceleration(acceleration);
		
		System.out.println("Stamina: ");
		int stamina = scanner.nextInt();
		Physical.setStamina(stamina);
		
		System.out.println("Strenght :");
		int strenght = scanner.nextInt();
		Physical.setStrenght(strenght);
		
		//Defence
		System.out.println("Marking: ");
		int marking = scanner.nextInt();
		Defence.setMarking(marking);
		
		System.out.println("Slide Tackle: ");
		int slideTackle = scanner.nextInt();
		Defence.setSlideTackle(slideTackle);
		
		System.out.println("Stand Tackle: ");
		int standTackle = scanner.nextInt();
		Defence.setStandTackle(standTackle);
		
		//Shooting
		System.out.println("Heading: ");
		int heading = scanner.nextInt();
		Shooting.setHeading(heading);
		
		System.out.println("Shotpower: ");
		int shotPower = scanner.nextInt();
		Shooting.setShotPower(shotPower);
		
		System.out.println("Finishing: ");
		int finishing = scanner.nextInt();
		Shooting.setFinishing(finishing);
		
		//Passing
		System.out.println("Passing: ");
		int passing = scanner.nextInt();
		Passing.setPassing(passing);
		
		System.out.println("Short Pass: ");
		int shortPass = scanner.nextInt();
		Passing.setShortPass(shortPass);

		System.out.println("Long pass: ");
		int longPass = scanner.nextInt();
		Passing.setLongPass(longPass);
	}

}
