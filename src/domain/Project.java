package domain;

public class Project extends Merit{
    
    private int budget;

    public Project(String title,int budget){
        super(title);
        this.budget = budget;
        this.setValoration(budget);
    }

    public void setValoration(double valoration){
        this.valoration = budget/100000;
    }

    public float getValoration(){
        return this.valoration;
    }
    
}