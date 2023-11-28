package domain;

public class Project extends Merit{
    
    private int budget;

    public Project(String title,int budget){
        super(title);
        this.budget = budget;
        this.valoration = budget/100000;
    }

    public double getValoration(){
        return this.valoration;
    }
    
}