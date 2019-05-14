package com.example.asus.good;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    TextView o,o2;
    EditText i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        o= findViewById(R.id.out);
        i= findViewById(R.id.in);
        o2= findViewById(R.id.out2);
        Button btn= findViewById(R.id.button2);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        String str= i.getText().toString();
        double s = Double.parseDouble(str);
        String result=String.format("%.2f", (s*(9/5)+32));
        o2.setText("结果为"+result);
    }
}
