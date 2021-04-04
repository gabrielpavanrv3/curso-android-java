package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Filme;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Filme> mListaFilme;

    public Adapter(List<Filme> listaFilme) {
        this.mListaFilme = listaFilme;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adatper_view, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Filme filme = mListaFilme.get(position);
        holder.mTitulo.setText(filme.getTitulo());
        holder.mGenero.setText(filme.getGenero());
        holder.mAno.setText(filme.getAno());
    }

    @Override
    public int getItemCount() {
        return mListaFilme.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTitulo;
        TextView mGenero;
        TextView mAno;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitulo = itemView.findViewById(R.id.textTitulo);
            mGenero = itemView.findViewById(R.id.textGenero);
            mAno    = itemView.findViewById(R.id.textAno);
        }
    }

}
