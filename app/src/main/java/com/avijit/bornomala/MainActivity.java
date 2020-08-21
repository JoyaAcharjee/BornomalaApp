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
        switch (v.getId()){
            case R.id.sorobornoButton : openSoroborno();break;
            case R.id.benjonbornoButton : openBenjonborno();break;
            case R.id.dekhiPoriButton : openDekhiPori();break;
            case R.id.coloAkiButton : openColoAki();break;
            case R.id.onushilonButton : openOnushilon();break;



            // Evabe case diye id gulo match korate hobe.
        }

    }
    public void  openSoroborno()
    {
        intent=new Intent(MainActivity.this,Developer.class);
        startActivity(intent);
    }
    public void  openBenjonborno()
    {
        intent=new Intent(MainActivity.this,Bengonborno.class);
        startActivity(intent);
    }
    public void  openDekhiPori()
    {
        intent=new Intent(MainActivity.this,Developer.class);
        startActivity(intent);
    }
    public void  openColoAki()
    {
        intent=new Intent(MainActivity.this,Developer.class);
        startActivity(intent);
    }
    public void  openOnushilon()
    {
        intent=new Intent(MainActivity.this,Developer.class);
        startActivity(intent);
    }

}
