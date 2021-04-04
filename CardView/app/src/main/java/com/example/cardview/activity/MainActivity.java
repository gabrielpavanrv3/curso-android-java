package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.AdapterLista;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyler;
    private List<Postagem> mLista = new ArrayList<Postagem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyler = findViewById(R.id.recylerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayout.HORIZONTAL);
//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        mRecyler.setLayoutManager(layoutManager);

        this.criarPostagem();
        AdapterLista adapterLista = new AdapterLista(mLista);
        mRecyler.setAdapter(adapterLista);
    }

    public void criarPostagem(){
        Postagem postagem = new Postagem("Gabriel Pavan", "#TBT Viagem Legal!!!", R.drawable.imagem1);
        mLista.add(postagem);

        Postagem postagem1 = new Postagem("Fabiana Pavan", "Comida muito boa!!!", R.drawable.imagem2);
        mLista.add(postagem1);

        Postagem postagem2 = new Postagem("Laura Pavan", "Tem sinal de internet!!!", R.drawable.imagem3);
        mLista.add(postagem2);

        Postagem postagem3 = new Postagem("Paulo Pavan", "Curti Muito!!!", R.drawable.imagem4);
        mLista.add(postagem3);
    }
}