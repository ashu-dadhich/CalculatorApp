package com.example.ashu.calculator_app;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String num="";
    String temp="";
    String operator="";
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    public void numerals(View view){
        if(view.getId()==R.id.one){
            num+="1";
            ed=(EditText) findViewById(R.id.display);
            ed.setText(num);
        }
        if(view.getId()==R.id.two){
            num+="2";
            ed=(EditText) findViewById(R.id.display);
            ed.setText(num);
        }
    }
    public void basic_arithmetic(View view){
        if(view.getId()==R.id.sum){
            temp=num;
            num="";
            ed=(EditText) findViewById(R.id.display);
            ed.setText("+");
            operator="+";
        }
    }
    public void result(View view){
        if(view.getId()==R.id.equalsto){
            if(operator.equals("+")){
                int a=Integer.parseInt(temp);
                int b=Integer.parseInt(num);
                Log.d("bug",Integer.toString(a));
                //int result=a+b;
                ed=(EditText) findViewById(R.id.display);
                ed.setText(Integer.toString(a+b));
            }
        }
    }
}
