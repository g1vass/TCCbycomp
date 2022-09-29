package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.projetofinal.classesModelo.Usuario;

public class Cadastro extends AppCompatActivity {

    TextView txtentrar = findViewById(R.id.txtEntrar);
    Button btCadastro = findViewById(R.id.btCadastrar);
    EditText[] inputs = {findViewById(R.id.inputUser),findViewById(R.id.inputEmail),findViewById(R.id.inputSenha)};
    String[] infUsuario = new String[inputs.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        //colocar os textos dos inputs em infUsuario
        for(int i = 0; i < infUsuario.length; i++)
            infUsuario[i] = inputs[i].getText().toString();

        txtentrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( Cadastro.this, Login.class));

            }
        });

        btCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ir para a home
                startActivity(new Intent(Cadastro.this,Bycomp.class));
                //INSERIR INFORMAÇÕES NO MYSQL E NO BANCO LOCAL
                Usuario usuario = new Usuario(infUsuario[0],infUsuario[1],infUsuario[2]);

            }
        });
    }
}