package com.cts.loginapp.model;

public class Question {
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private boolean A;
	private boolean B;
	private boolean C;
	private boolean D;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (A ? 1231 : 1237);
		result = prime * result + (B ? 1231 : 1237);
		result = prime * result + (C ? 1231 : 1237);
		result = prime * result + (D ? 1231 : 1237);
		result = prime * result + ((option1 == null) ? 0 : option1.hashCode());
		result = prime * result + ((option2 == null) ? 0 : option2.hashCode());
		result = prime * result + ((option3 == null) ? 0 : option3.hashCode());
		result = prime * result + ((option4 == null) ? 0 : option4.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (A != other.A)
			return false;
		if (B != other.B)
			return false;
		if (C != other.C)
			return false;
		if (D != other.D)
			return false;
		if (option1 == null) {
			if (other.option1 != null)
				return false;
		} else if (!option1.equals(other.option1))
			return false;
		if (option2 == null) {
			if (other.option2 != null)
				return false;
		} else if (!option2.equals(other.option2))
			return false;
		if (option3 == null) {
			if (other.option3 != null)
				return false;
		} else if (!option3.equals(other.option3))
			return false;
		if (option4 == null) {
			if (other.option4 != null)
				return false;
		} else if (!option4.equals(other.option4))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "QuestionBean [question=" + question + ", option1=" + option1 + ", option2=" + option2 + ", option3="
				+ option3 + ", option4=" + option4 + ", A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + "]";
	}
	
	
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public boolean isA() {
		return A;
	}
	public void setA(boolean a) {
		A = a;
	}
	public boolean isB() {
		return B;
	}
	public void setB(boolean b) {
		B = b;
	}
	public boolean isC() {
		return C;
	}
	public void setC(boolean c) {
		C = c;
	}
	public boolean isD() {
		return D;
	}
	public void setD(boolean d) {
		D = d;
	}
	
}
