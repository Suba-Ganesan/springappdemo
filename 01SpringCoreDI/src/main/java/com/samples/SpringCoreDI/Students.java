package com.samples.SpringCoreDI;

public class Students {
	private Scores scoreobj;

	public Scores getScoreobj() {
		return scoreobj;
	}

	public void setScoreobj(Scores scoreobj) {
		this.scoreobj = scoreobj;
	}

	@Override
	public String toString() {
		return "Students [scoreobj=" + scoreobj + "]";
	}
	    
}
