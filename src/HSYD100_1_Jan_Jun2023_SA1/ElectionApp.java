package HSYD100_1_Jan_Jun2023_SA1;

import java.util.ArrayList;
import java.util.Scanner;

public class ElectionApp {

	public static void main(String[] args) {
		ElectionApplication();
	}
	
	public static void ElectionApplication() {
		
		ArrayList<Election> elections = new ArrayList<>();
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number of Election Candidates:");
		
		int candidates = input.nextInt();
		
		for ( int i = 0; i < candidates; i++ ) {
			
			Election election = new Election();
			
			System.out.println("Add Election:");
			
			boolean candidateName = false;
			
			while(!candidateName) {
				System.out.println("Add Candidate Name:");				
				
				election.setCandidate(input.nextLine());
				
				if(election.getCandidate() != null)
					candidateName = true;
				
				
			}
			
			
			
			
			elections.add(election);
			
			
		}
		
		//int totalVotes = totalVotes(elections);
		
		//print(elections, totalVotes);
		
	}
	
	private static int totalVotes(ArrayList<Election> elections) {
		int totalVotes = 0;
		for(Election election : elections)
			totalVotes = totalVotes + election.getNumVotes();
		return totalVotes;		
	}
	
	private static void print(ArrayList<Election> elections, int totalVotes) {
		System.out.println("");
		System.out.println("************************************");
		System.out.println("***************ELECTIONS************");
		System.out.println("************************************");
		System.out.println("* Name      *     Votes   *    % of Total Votes*");
		for(Election election : elections) {
			double electionPercent = election.getNumVotes()/totalVotes;
			System.out.println("* "+ election.getCandidate()+"  *  "+ election.getNumVotes() +"   * "+ electionPercent +"*");
			electionPercent = 0;
		}
		System.out.println("");
	}

}
