package com.fefeyo.keisan;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private BootstrapButton button1;
    private BootstrapButton button2;
    private BootstrapButton button3;

    private void assignViews() {
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        text4 = (TextView) findViewById(R.id.text4);
        button1 = (BootstrapButton) findViewById(R.id.button1);
        button2 = (BootstrapButton) findViewById(R.id.button2);
        button3 = (BootstrapButton) findViewById(R.id.button3);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button1:
                text1.setText((Integer.parseInt((text1.getText().toString()))+1)+"");
                text2.setText((Integer.toBinaryString(Integer.parseInt(text1.getText().toString())))+"");
                text3.setText((Integer.toOctalString(Integer.parseInt(text1.getText().toString())))+"");
                text4.setText((Integer.toHexString(Integer.parseInt(text1.getText().toString())))+"");
                break;
            case R.id.button2:
                text1.setText((Integer.parseInt((text1.getText().toString()))-1)+"");
                text2.setText((Integer.toBinaryString(Integer.parseInt(text1.getText().toString())))+"");
                text3.setText((Integer.toOctalString(Integer.parseInt(text1.getText().toString())))+"");
                text4.setText((Integer.toHexString(Integer.parseInt(text1.getText().toString())))+"");
                break;
            case R.id.button3:
                text1.setText(0+"");
                text2.setText(0+"");
                text3.setText(0+"");
                text4.setText(0+"");
                break;
        }
    }
}