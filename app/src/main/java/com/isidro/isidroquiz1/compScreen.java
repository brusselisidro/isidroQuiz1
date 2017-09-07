package com.isidro.isidroquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class compScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_screen);
    }
    public void mainScreen(View view){
        Intent intent = new Intent(this, mainScreen.class);
        startActivity(intent);
    }
    public void techScreen(View view){
        Intent intent = new Intent(this, techScreen.class);
        startActivity(intent);
    }
    public void sysScreen(View view){
        Intent intent = new Intent(this, sysScreen.class);
        startActivity(intent);
    }
}
