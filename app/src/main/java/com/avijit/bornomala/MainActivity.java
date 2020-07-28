package com.avijit.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button sorobornoButton,benjonbornoButton,coloAkiButton,dekhiPoriButton,onushilonButton;
    private Intent intent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sorobornoButton = (Button)findViewById(R.id.sorobornoButton);
        benjonbornoButton = (Button)findViewById(R.id.benjonbornoButton);
        dekhiPoriButton = (Button)findViewById(R.id.dekhiPoriButton);
        coloAkiButton = (Button)findViewById(R.id.coloAkiButton);
        onushilonButton = (Button)findViewById(R.id.onushilonButton);

        sorobornoButton.setOnClickListener(this);
        benjonbornoButton.setOnClickListener(this);
        dekhiPoriButton.setOnClickListener(this);
        coloAkiButton.setOnClickListener(this);
        onushilonButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
      openSoroborno();
    }
    public void  openSoroborno()
    {
        intent=new Intent(MainActivity.this,Developer.class);
        startActivity(intent);
    }
}
