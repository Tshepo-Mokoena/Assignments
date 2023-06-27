package HSYD100_1_Jan_Jun2023_SA1;

import java.math.BigDecimal;

public class Election {
	
	private String candidate;
	
	private int numVotes;
	
	private BigDecimal percent;
	
	public Election(){}
		
	public Election(String candidate, int numVotes) {
		this.candidate = candidate;
		this.numVotes = numVotes;
	}

	public String getCandidate() {
		return candidate;
	}

	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}

	public int getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes;
	}

	public void setPercent(BigDecimal total) {
		BigDecimal p = new BigDecimal(this.numVotes);
		p = p.divide(total);
		this.percent = p;
	}
	
	public BigDecimal getPercent() {
		return this.percent;
	}

	@Override
	public String toString() {
		return "Election [candidate=" + candidate + ", numVotes=" + numVotes + ", percent=" + percent + "]";
	}

}
