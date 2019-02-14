package Magic8Ball;

/*
 * Magic 8 Ball
 * Code by: Joseph LoRusso
 * 2/7/2019
 */

import java.util.*;

public class Magic8Ball {

	public static void main(String[] args) {
		String[] phrases = {
				"Yes",
				"Yeah",
				"No",
				"Wha- no",
				"Yeah, no",
				"I guess so",
				"Maybe",
				"Probably",
				"You know what they say...",
				"The dark lord says I have to say no.",
				"The dark lord says yeah, so I guess so.",
				"Ask Google",
				"Why not?",
				"What do you think?",
				"You will find out in time",
				"I don't really care",
				"I mean, if it works it works",
				"Thats a loaded question",
				"I don't think I am ready to answer that",
				"I hope so"
		};
		
		boolean inGame=true;
		
		System.out.println("Welcome to the Magic 8 Ball!  Ask the 8 ball a question and you will receive an answer.");
		while(inGame) {
			System.out.println("Shake the magic 8 ball? [Y/N]");
			
			Scanner scan = new Scanner(System.in);  // Reading from System.in
			String cmd = scan.next();
			
			if(cmd.equals("y") || cmd.equals("Y")) {
				System.out.println("\n"+phrases[(int)(Math.random()*phrases.length)]+"\n");
			}else {
				System.out.println("You decide it's better to not see your fate.");
				inGame=false;
			}
		}//end while loop
	}//end main

}
