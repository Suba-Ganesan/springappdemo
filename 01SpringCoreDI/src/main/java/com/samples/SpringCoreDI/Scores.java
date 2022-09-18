package com.samples.SpringCoreDI;

public class Scores {
	private int math;
	private int chemistry;
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	@Override
	public String toString() {
		return "Scores [math=" + math + ", chemistry=" + chemistry + "]";
	}
	
	
}
