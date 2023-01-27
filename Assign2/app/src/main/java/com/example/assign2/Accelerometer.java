package com.example.assign2;

public class Accelerometer {

    private float x,y,z;

    public Accelerometer(float x_, float y_, float z_){
        this.x = x_;
        this.y = y_;
        this.z = z_;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
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
}
