/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NK
 */
public class Laptop {

    USB port;
    PIN pin;
    String name;

    public Laptop() {
        port = new USB();
        pin = new PIN();
        name = "Dell";
    }

    public Laptop(int type, boolean isLarge, int hour, String make, String name) {
        this.port = new USB(type, isLarge);
        this.pin = new PIN(hour, make);
        this.name = name;
    }

    class USB {

        int type;
        boolean isLarge;

        USB() {
            type = 2;
            isLarge = true;
        }

        public USB(int type, boolean isLarge) {
            this.type = type;
            this.isLarge = isLarge;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public boolean isIsLarge() {
            return isLarge;
        }

        public void setIsLarge(boolean isLarge) {
            this.isLarge = isLarge;
        }

    }

    class PIN {

        int hour;
        String make;

        PIN() {
            hour = 10;
            make = "China";
        }

        PIN(int hour, String make) {
            this.hour = hour;
            this.make = make;
        }

        public int getHour() {
            return hour;
        }

        public void setHour(int hour) {
            this.hour = hour;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

    }

    @Override
    public String toString() {
        String s = "Port: " + port.getType() + ", " + port.isIsLarge();
        s = s + "PIN: " + pin.getHour() + ", " + pin.getMake();
        s = s + "name: " + name;
        return s;
    }

}
