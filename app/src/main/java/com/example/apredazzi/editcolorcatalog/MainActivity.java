package com.example.apredazzi.editcolorcatalog;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;
    ImageButton button5;
    ImageButton button6;
    ImageButton button7;
    ImageButton button8;
    ImageButton button9;
    ImageButton button10;

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpView();
        button1.setSelected(true);
    }

    public void onClick(View view) {
        setAllToFalse();
        view.setSelected(true);
        int sdk = Build.VERSION.SDK_INT;
        if (sdk < Build.VERSION_CODES.JELLY_BEAN) {
            textview.setBackgroundDrawable(view.getBackground());
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                textview.setBackground(view.getBackground());
            }
        }
    }

    private void setAllToFalse() {
        button1.setSelected(false);
        button2.setSelected(false);
        button3.setSelected(false);
        button4.setSelected(false);
        button5.setSelected(false);
        button6.setSelected(false);
        button7.setSelected(false);
        button8.setSelected(false);
        button9.setSelected(false);
        button10.setSelected(false);
    }

    private void setUpView() {
        button1 = (ImageButton) findViewById(R.id.ImageButton1);
        button2 = (ImageButton) findViewById(R.id.ImageButton2);
        button3 = (ImageButton) findViewById(R.id.ImageButton3);
        button4 = (ImageButton) findViewById(R.id.ImageButton4);
        button5 = (ImageButton) findViewById(R.id.ImageButton5);
        button6 = (ImageButton) findViewById(R.id.ImageButton6);
        button7 = (ImageButton) findViewById(R.id.ImageButton7);
        button8 = (ImageButton) findViewById(R.id.ImageButton8);
        button9 = (ImageButton) findViewById(R.id.ImageButton9);
        button10 = (ImageButton) findViewById(R.id.ImageButton10);
        textview = (TextView) findViewById(R.id.texto_view_catalogo);
    }


}
