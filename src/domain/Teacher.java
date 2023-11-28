package domain;

import java.util.ArrayList;

public abstract class Teacher{

	protected ArrayList<Merit> merits;
	protected float valoration;	
	public Teacher(){
		this.merits = new ArrayList<Merit>();
		this.valoration = 0;
	}

	public abstract float calculateValoration();

	public Teacher addMerit(Merit merit){
		this.merits.add(merit);
		return this;
	}
}
