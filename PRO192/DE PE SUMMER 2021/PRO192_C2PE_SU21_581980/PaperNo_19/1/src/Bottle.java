/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHAM KHAC VINH
 */
public class Bottle {
    protected String maker;
    protected int volume;
	public Bottle() {
		super();
	}
	public Bottle(String maker, int volume) {
		super();
		this.maker = maker;
		this.volume = volume;
	}
	public String getMaker() {
		return maker.toLowerCase();
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
    
    
    
    
    
}
