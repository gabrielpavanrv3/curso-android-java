package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.activity.model.Usuario;

public class SegundaActivity extends AppCompatActivity {
    private TextView mTextNome;
    private TextView mTextIdade;
    private TextView mTextObjNome;
    private TextView mTextObjEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        mTextNome       = findViewById(R.id.textNome);
        mTextIdade      = findViewById(R.id.textIdade);
        mTextObjNome    = findViewById(R.id.textObjNome);
        mTextObjEmail   = findViewById(R.id.textObjEmail);

        Bundle dados    = getIntent().getExtras();
        String nome     = dados.getString("nome");
        int idade       = dados.getInt("idade");
        Usuario usuario = (Usuario) dados.getSerializable("objeto");

        mTextNome.setText(nome);
        mTextIdade.setText(String.valueOf(idade));
        mTextObjNome.setText(usuario.getNome());
        mTextObjEmail.setText(usuario.getEmail());
    }
}