package domain;

public class Titular extends Teacher{
    public Titular(){
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