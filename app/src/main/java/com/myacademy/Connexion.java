package com.myacademy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Connexion extends AppCompatActivity {
    Button btn_valider;
    TextView tv_recup_mot_passe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        btn_valider = (Button) findViewById(R.id.btn_valider);
        tv_recup_mot_passe = (TextView) findViewById(R.id.tv_recup_mot_passe);
//A commenter en cas d'erreur
       tv_recup_mot_passe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),formater_mdp.class);
                startActivity(intent);
            }
        });
    }
}
