package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.myapplication.ClickListener;
import com.example.myapplication.R;
import com.example.myapplication.adapter.Adapter;
import com.example.myapplication.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycler;
    private List<Filme> mLista = new ArrayList<Filme>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycler = findViewById(R.id.recycler);

        this.criarFilmes();
        Adapter adapter = new Adapter(mLista);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecycler.setLayoutManager(layoutManager);
        mRecycler.setHasFixedSize(true);
        mRecycler.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        mRecycler.setAdapter(adapter);

        mRecycler.addOnItemTouchListener(
                new ClickListener(
                        getApplicationContext(),
                        mRecycler,
                        new ClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Filme filme = mLista.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        filme.getTitulo() + " pressionado",
                                        Toast.LENGTH_SHORT
                                ).show();
                                System.out.println(filme.getTitulo() + " pressionado");
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Filme filme = mLista.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Clique longo em " + filme.getTitulo(),
                                        Toast.LENGTH_SHORT
                                ).show();
                                System.out.println("CLIQUE LONGO");
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );

    }

    public void criarFilmes(){
        Filme filme = new Filme("titulo", "genero", "ano");
        this.mLista.add(filme);
        Filme filme1 = new Filme("titulo1", "genero1", "ano1");
        this.mLista.add(filme1);
        Filme filme2 = new Filme("titulo2", "genero2", "ano2");
        this.mLista.add(filme2);
        Filme filme3 = new Filme("titulo3", "genero3", "ano3");
        this.mLista.add(filme3);
        Filme filme4 = new Filme("titulo4", "genero4", "ano4");
        this.mLista.add(filme4);
        Filme filme5 = new Filme("titulo5", "genero5", "ano5");
        this.mLista.add(filme);
        Filme filme6 = new Filme("titulo6", "genero6", "ano6");
        this.mLista.add(filme6);
        Filme filme7 = new Filme("titulo7", "genero7", "ano7");
        this.mLista.add(filme7);
        Filme filme8 = new Filme("titulo8", "genero8", "ano8");
        this.mLista.add(filme8);
        Filme filme9 = new Filme("titulo9", "genero9", "ano9");
        this.mLista.add(filme9);
        Filme filme10 = new Filme("titulo10", "genero10", "ano10");
        this.mLista.add(filme10);
    }
}