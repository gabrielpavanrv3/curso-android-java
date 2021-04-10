package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.activity.model.Usuario;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private Button mButtonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonEnviar = findViewById(R.id.buttonEnviar);
        mButtonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
                intent.putExtra("nome", "Gabriel Pavan");
                intent.putExtra("idade", 22);

                //Objeto é convertido para bytes
                Usuario usuario = new Usuario("Gabriel","gabrielpavanrv3@gmail.com");
                intent.putExtra("objeto", usuario);

                startActivity(intent);
            }
        });

        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        System.out.println("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show();
        System.out.println("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show();
        System.out.println("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show();
        System.out.println("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show();
        System.out.println("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show();
        System.out.println("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
        System.out.println("onDestroy");
    }
}