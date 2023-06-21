package HSYD100_1_Jan_Jun2023_SA1;

public class Election {
	
	private String candidate;
	
	private int numVotes;
	
	public Election(){}
	
	public Election(String candidate, int numVotes){
		this.candidate = candidate;
		this.numVotes = numVotes;
	}
	
	public void setCandidate(String candidate) {
		this.candidate = candidate; 
	}
	
	public String getCandidate() {
		return this.candidate; 
	}
	
	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes; 
	}
	
	public int getNumVotes() {
		return this.numVotes; 
	}

	public String toString() {
		return "Election [candidate=" + candidate + ", numVotes=" + numVotes + "]";
	}

}
