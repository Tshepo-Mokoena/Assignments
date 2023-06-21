package HSYD100_1_Jan_Jun2023_SA1;

import java.util.ArrayList;
import java.util.Scanner;

public class ElectionApplication {
	
	private static Scanner input = new Scanner(System.in);
	
	private static ArrayList<Election> elections = new ArrayList<>();
	
	private static int totalVotes = 0;
	
	public static void main(String[] args) {
		
		int candidates = 0;
		
		System.out.println("Enter Number of Election Candidates:");
		
		candidates = input.nextInt();
		
		requestElection(candidates);
		
		totalVotes();
		
		print();
		
	}
	
	private static void requestElection(int length) {
		
		 new Election();
		
		System.out.println("Enter Election Data:");
		
		String name;
		
		for(int i = 0; i < length; i++) {
			
			Election election = new Election();
			
			System.out.println("Add "+ i +" Election:");
			
			System.out.println("");
			
			System.out.println("Add Candidate Name:");
			
			election.setCandidate(input.nextLine());
			
			System.out.println("Add Candidate Votes:");
			
			election.setNumVotes(input.nextInt());
			
			elections.add(election);
			
		}
	}
	
	private static void totalVotes(ArrayList<Election> elections) {		
		for(Election election : elections) 
			totalVotes = totalVotes + election.getNumVotes();				
	}
	
	private static void print() {
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
	
	private String[] numberToWords(int num) {
		
		String[] number = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		
		String[] tenths = {"Ten", "Eleven", "Twelve", "Thirdteen", "Fourteen", "Fifteen", "Sixteen", "Seven", "Nine"};
		
		return null;
	}

}
