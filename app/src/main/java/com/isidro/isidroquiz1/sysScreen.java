package com.isidro.isidroquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sysScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sys_screen);
    }
    public void mainScreen(View view){
        Intent intent = new Intent(this, mainScreen.class);
        startActivity(intent);
    }
    public void compScreen(View view){
        Intent intent = new Intent(this, compScreen.class);
        startActivity(intent);
    }
    public void techScreen(View view){
        Intent intent = new Intent(this, techScreen.class);
        startActivity(intent);
    }
}
