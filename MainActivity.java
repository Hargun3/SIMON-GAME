package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        int rand = random.nextInt(3);
        String fourcolors[] ={"Green", "Yellow", "Blue", "Red"};
        String randomcolor = fourcolors[rand];
       play = (Button) findViewById(R.id.play);
       play.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               opengreen();
           }
       });




    }
    public void opengreen(){

    }
}
