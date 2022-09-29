package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView Criarconta = findViewById(R.id.Criarconta);
    Button btLogar = findViewById(R.id.btLogar);
    EditText[] inputs = {findViewById(R.id.inputUserL),findViewById(R.id.inputSenhaL)};
    String[] infUsuario = new String[inputs.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //colocar os textos dos inputs em infUsuario
        for(int i = 0; i < infUsuario.length; i++)
            infUsuario[i] = inputs[i].getText().toString();

        //ir oara tela de cadastro
        Criarconta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( Login.this,Cadastro.class));
            }
        });

        // botao logar


        //entrar na tela do aplicativo

        btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ir para a home
                startActivity(new Intent(Login.this,Bycomp.class));
                //INSERIR INFORMAÇÕES NO MYSQL E NO BANCO LOCAL

            }
        });


    }
}