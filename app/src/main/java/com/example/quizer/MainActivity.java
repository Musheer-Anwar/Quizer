package com.example.quizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public String getName(){
        EditText text= (EditText) findViewById(R.id.name);
        String name = text.getText().toString();
        return name;
    }
    public int total(){
        int marks =0;
        RadioGroup radioGroup;
        radioGroup = (RadioGroup) findViewById(R.id.rg1);
        int correct = radioGroup.getCheckedRadioButtonId();
        if(correct == R.id.a1) {
            marks += 1;
            count += 1;
        }
        radioGroup = (RadioGroup) findViewById(R.id.rg1);
        int correct1 = radioGroup.getCheckedRadioButtonId();
        if(correct1 == R.id.d2) {
            marks += 1;
            count += 1;
        }
        radioGroup = (RadioGroup) findViewById(R.id.rg1);
        int correct2 = radioGroup.getCheckedRadioButtonId();
        if(correct2 == R.id.c3) {
            marks += 1;
            count += 1;
        }
        radioGroup = (RadioGroup) findViewById(R.id.rg1);
        int correct3 = radioGroup.getCheckedRadioButtonId();
        if(correct3 == R.id.a1) {
            marks += 1;
            count += 1;
        }
        CheckBox cb1 = (CheckBox) findViewById(R.id.a5);
        CheckBox cb2 = (CheckBox) findViewById(R.id.b5);
        CheckBox cb3 = (CheckBox) findViewById(R.id.c5);
        CheckBox cb4 = (CheckBox) findViewById(R.id.d5);
        if(cb2.isChecked()){
            return marks;
        }
        else if(cb1.isChecked() && cb3.isChecked() && cb4.isChecked()){
            marks +=1;
            count +=1;
        }
        return marks;
    }
    public void display(View view){
        int fmarks = total();
        TextView show =(TextView) findViewById(R.id.score);
        String print = "Name:"+ getName();
        print += "\nMarks: "+ fmarks;
        print += "\nNo. of correct Answer: "+ count;
        print +="\nNo. of wrong Answer: "+ (5-count);
        show.setText(print);
        Toast.makeText(MainActivity.this,print,Toast.LENGTH_SHORT).show();


     }
}