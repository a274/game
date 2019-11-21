package com.example.myapplication;

import android.widget.TextView;

public class Robot extends Unit implements Printable, Runable{
    private int energy = 200;

    public Robot(String name, int health, int energy) {
        super(name, health);
        this.energy = energy;
    }

    @Override
    public void printInfo(TextView textPlace) {
        super.printInfo(textPlace);
        textPlace.append(this.getName()+" имеет " + energy + " энергию. \n");
    }

    @Override
    public void letsGO(TextView textPlace) {
        super.letsGO(textPlace);
        energy--;
        textPlace.append("Энергия " + getName() + " уменьшилась до " + energy + ".\n");
    }
}
