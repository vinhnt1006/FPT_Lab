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
public class Ball9 {
    private float x, y;
    private int radius;
    private float xDelta, yDelta;

    public Ball9(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    
    public void move() {
        x+= xDelta;
        y+= yDelta;
    }
    public void reflectHorizontal() {
        xDelta = - xDelta;
        
    }
    public void reflectVertical() {
        yDelta = - yDelta;
    }

    @Override
    public String toString() {
        return String.format("Ball [(%.1f,%.1f) , speed = (%.1f,%.1f)]",x,y,xDelta,yDelta); //To change body of generated methods, choose Tools | Templates.
    }
    
}
