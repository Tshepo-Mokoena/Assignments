package HSYD100_1_Jan_Jun2023_SA1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class ElectionApplication {
	
	public static void main(String[] args) {
		
		ElectionApplication el = new ElectionApplication();
		el.runElection();
		
	}	
	
	public void runElection() {
		
		ArrayList<Election> elections = new ArrayList<>();
				
		System.out.println("Number of Election Canditates");
		
		int number = keypad().nextInt();
		
		int counter = 1;
		
		BigDecimal total = new BigDecimal(0);		
		
		System.out.println("We have "+TranslateNumberToString.translateNumberToWord(number)+" canditates running for election");
		
		do {
			
			System.out.println("Enter Election Results for Canditate Number: ".concat(TranslateNumberToString.translateNumberToWord(counter)));
			
			Election election = new Election();
			
			System.out.println("Canditate Name");
			
			String name = keypad().next();
			
			election.setCandidate(name);
			
			System.out.println("Canditate Votes");
						
			int votes = keypad().nextInt();
			
			election.setNumVotes(votes);
			
			elections.add(election);
			
			total = total.add(new BigDecimal(votes));
			
			counter++;
			
		} while(counter <= number);
		
		System.out.println(total);		
		
		for(Election el: elections) {
			el.setPercent(total);
		}
		
		elections
				.stream()
				.forEach(election -> System.out.println(election));
		
	}
	
	public Scanner keypad() {		 
		return new Scanner(System.in);
	}
	
	public BigDecimal totalVotes(int votes) {
		BigDecimal total = new BigDecimal(0);
		total = total.add(new BigDecimal(votes)); 
		return total;
	}
	
}
