package domain;

public class Cathedratic extends Teacher{
    public Cathedratic(){
        super();
    }

    public float calculateValoration(){
        float valoration = 0;
        for(Merit merit : this.merits){
            valoration += merit.getValoration();
        }
        return valoration;
    }
}