/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NK
 */
public class SpecCala extends Cala{
    
    private int color;
    
    public SpecCala() {
        super();
        color = 0;
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    
    
    public void setData(){
        String x = super.getOwner();
        String ans = "";
        for(int i = 0; i < x.length(); i++){
            if(i == 1) ans = ans + "XX";
            else ans = ans + x.charAt(i);
        }
        setOwner(ans);
    }
    
    public int getValue(){
        if(color % 2 == 1) return this.getPrice() + 3;
        else return this.getPrice() + 7;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }
    
    
}
