package domain;

public class Article extends Merit{
	
	private double impact;

	public Article(String title,double impact){
		super(title);
		this.impact = impact;
		this.valoration = this.impact;
	}

	public double getValoration(){
		return this.valoration;
	}
	
}

