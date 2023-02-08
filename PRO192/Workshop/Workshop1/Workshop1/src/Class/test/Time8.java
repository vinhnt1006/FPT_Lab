/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.test;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Time8 {
    private int hour , minute , second;
    
    public Time8(int hour, int minute, int second ) {
        this.hour  = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
               
               
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%02d",hour, minute, second ) ; //To change body of generated methods, choose Tools | Templates.
    }
    public Time8 nextSecond() {
        second++;
        if(second >= 60){
            second = 0 ;
            minute++;
            if(minute >= 60){
                minute = 0;
                hour++;
                if ( hour >=24){
                    hour = 0;
                }
            }
        }        
        return this;
    }
    public Time8 previousSecond() {
        second--;
        if (second < 0 ){
            second = 59;
            minute-- ;
            if ( minute < 0) {
                minute = 59;
                hour--;
                if(hour < 0)
                    hour = 23;
            }
        }
        return this;
    }
    
    
    
    
}
