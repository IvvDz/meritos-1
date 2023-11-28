package domain;

public class Titular extends Teacher{
    public Titular(String name){
        super(name);
    }

    public float calculateValoration(){
        float valoration = 0;
        for(Merit merit : this.merits){
            //add merit 
            valoration += merit.getValoration();
        }
        //do arithmetic average
        valoration = valoration/this.merits.size();
        return valoration;
    }
}