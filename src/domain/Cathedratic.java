package domain;

public class Cathedratic extends Teacher{
    public Cathedratic(String name){
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