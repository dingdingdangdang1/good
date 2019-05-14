package com.example.asus.good;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class basketball extends AppCompatActivity {
    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);
        score= findViewById(R.id.scoreA);
    }
    public void show(int v) {

        String str= score.getText().toString();
        int s = Integer.parseInt(str);


        score.setText( );
    }
}
