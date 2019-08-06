package com.myacademy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class formater_mdp extends AppCompatActivity {

    Button btn_valider2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_mdp);

        btn_valider2 = (Button) findViewById(R.id.btn_valider2);

        btn_valider2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), nouveau_mdp.class);
                startActivity(intent);

            }
        });
    }
}

