package com.example.myapplication;

import android.widget.TextView;

public class NPC implements Printable, Runable{
    private int id = 0;
    private String state = "Ожидает";

    public NPC(int id, String state) {
        this.id = id;
        this.state = state;
    }

    @Override
    public void printInfo(TextView textView) {
        textView.append("NPC № " + id + " " + state + ".\n");
    }

    @Override
    public void letsGO(TextView textView) {
        textView.append("NPC номер " + id + "  начал хаотически перемещаться. \n");
    }
}
