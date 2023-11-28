package domain;

public class Cathedratic extends Teacher{
    public Cathedratic(String name){
        super(name);
    }

    public float calculateValoration(){
        float valoration = 0;
        for(Merit merit : this.merits){
            valoration += (merit.getValoration()*merit.getValoration());
        }
        //do square root of arithmetic average
        if(this.merits.size() > 0){
            valoration = (float)Math.sqrt(valoration/this.merits.size());
        }
        else{
            valoration = 0;
        }
        return valoration;
    }
}