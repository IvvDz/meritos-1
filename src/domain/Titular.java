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
        if(this.merits.size() > 0){
            valoration = valoration/this.merits.size();
        }
        else{
            valoration = 0;
        }
        return valoration;
    }
}