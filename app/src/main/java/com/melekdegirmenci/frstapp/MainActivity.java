package com.melekdegirmenci.frstapp;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void changeImage(View view){
        ImageView imageView=findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.mm);
    }
}