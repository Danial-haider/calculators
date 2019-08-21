package com.nexttechnologies.finalpaper.nadra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity   {
Button no0,no1,no2,no3,no4,no5,no6,no7,no8,no9,plus,equal;
TextView answer;
int frstvalue,secndvalue,myans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer=(TextView)findViewById(R.id.answer);
        no0=(Button) findViewById(R.id.btn_0);
        no1=(Button) findViewById(R.id.btn_1);
        no2=(Button) findViewById(R.id.btn_2);
        no3=(Button) findViewById(R.id.btn_3);
        no4=(Button) findViewById(R.id.btn_4);
        no5=(Button) findViewById(R.id.btn_5);
        no6=(Button) findViewById(R.id.btn_6);
        no7=(Button) findViewById(R.id.btn_7);
        no8=(Button) findViewById(R.id.btn_8);
        no9=(Button) findViewById(R.id.btn_9);
        plus=(Button) findViewById(R.id.btn_plus);
        equal=(Button) findViewById(R.id.btn_equal);
//first number operator second number equal
no0.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        answer.setText("0");
 if(frstvalue<0){
secndvalue=0;
 }
 else {
     frstvalue=0;
 }
     }
});no1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        answer.setText("1");
        if(frstvalue<0){
            secndvalue=1;
        }
        else {
            frstvalue=1;
        }
    }
});no2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        answer.setText("2");
        if(frstvalue<2){
            secndvalue=2;
        }
        else {
            frstvalue=0;
        }
    }
});no3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        answer.setText("3");
        if(frstvalue<0){
            secndvalue=3;
        }
        else {
            frstvalue=3;
        }
    }
});no4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        answer.setText("4");
        if(frstvalue<0){
            secndvalue=4;
        }
        else {
            frstvalue=4;
        }
    }
});no5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        answer.setText("5");
        if(frstvalue<0){
            secndvalue=5;
        }
        else {
            frstvalue=5;
        }
    }
});no6.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        answer.setText("6");
        if(frstvalue<0){
            secndvalue=6;
        }
        else {
            frstvalue=6;
        }
    }
});no7.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        answer.setText("7");
        if(frstvalue<0){
            secndvalue=7;
        }
        else {
            frstvalue=7;
        }
    }
});no8.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        answer.setText("8");
        if(frstvalue<0){
            secndvalue=8;
        }
        else {
            frstvalue=8;
        }
    }
});no9.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        answer.setText("9");
        if(frstvalue<0){
            secndvalue=9;
        }
        else {
            frstvalue=9;
        }
    }
});plus.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {



    }
});equal.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int sun=frstvalue+secndvalue;
    answer.setText(String.valueOf(sun));
    }
});



    }

 }
