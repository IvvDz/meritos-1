package domain;

public class Titular extends Teacher{
    public Titular(String name){
        super(name);
    }

    public float calculateValoration(){
        float valoration = 0;
        for(Merit merit : this.merits){
            valoration += merit.getValoration();
        }
        return valoration;
    }
}