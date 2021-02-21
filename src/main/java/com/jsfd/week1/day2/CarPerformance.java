package com.jsfd.week1.day2;

public class CarPerformance implements Engine {
    int cc;
    int hp;
    int torque;

    @Override
    public void getEngine(int cc, int hp, int torque) {
        this.cc=cc;
        this.hp=hp;
        this.torque=torque;

    } 
    
}
