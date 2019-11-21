package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView debugText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        debugText=(TextView)findViewById(R.id.debugText);
        Unit alexey = new Unit("Alexey Grigorevich", 200);
        alexey.printInfo(debugText);
        alexey.letsGO(debugText);

        Robot Shwarzenegger = new Robot("Arnold Shwarzenegger", 1000, 400);
        Shwarzenegger.printInfo(debugText);
        Shwarzenegger.letsGO(debugText);

        Wizard Dambldor = new Wizard("Dambldor", 20, 10000);
        Dambldor.printInfo(debugText);
        Dambldor.letsGO(debugText);

        NPC npc = new NPC(0, "ожидает");
        npc.printInfo(debugText);
        npc.letsGO(debugText);
    }
}
