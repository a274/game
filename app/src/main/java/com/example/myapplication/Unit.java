package com.example.myapplication;

import android.widget.TextView;

public class Unit implements Printable, Runable{
    public final String getName() {
        return name;
    }

    private String name = "Nill";
    private int health =100;

    public Unit(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void printInfo(TextView textPlace) {
        textPlace.append("Меня зовут " + name + ", и я имею " + health + " hp. \n");
    }
    public void letsGO(TextView textPlace) {
        textPlace.append(name + " начал бежать. \n");
    }
}
