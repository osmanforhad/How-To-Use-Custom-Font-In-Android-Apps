package com.osmanforhad.customfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Create 2 variable for two operation
    TextView t1, t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Select the xml text view using id
        t1 = (TextView) findViewById(R.id.mytext1);
        t2 = (TextView) findViewById(R.id.mytext2);

        //Use  Custom Font for Specific Text by creating object
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "font/mitra.ttf");
        t1.setText("মিত্রা ফন্ট ব্যবহার করে কাস্টম ফন্ট এর ব্যবহার!");
        t1.setTypeface(tf1);
        //Use  Custom Font for Specific Text by creating object
        Typeface tf2 = Typeface.createFromAsset(getAssets(),"font/BenSenHandwriting.ttf");
        t2.setText("বিনসেন হ্যান্ড রাইটিং ফন্ট ব্যবহার করে কাস্টম ফন্ট এর ব্যবহার!");
        t2.setTypeface(tf2);
    }
}
