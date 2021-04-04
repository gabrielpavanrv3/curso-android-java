package com.example.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.util.List;

public class AdapterLista extends RecyclerView.Adapter<AdapterLista.MyViewHolder> {

    private List<Postagem> mLista;

    public AdapterLista(List<Postagem> mLista) {
        this.mLista = mLista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_lista, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem postagem = mLista.get(position);
        holder.mNome.setText(postagem.getNome());
        holder.mConteudo.setText(postagem.getConteudo());
        holder.mConteudoFoto.setImageResource(postagem.getConteudoFoto());
    }


    @Override
    public int getItemCount() {
        return mLista.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView mNome;
        private TextView mConteudo;
        private ImageView mConteudoFoto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mNome         = itemView.findViewById(R.id.textViewNome);
            mConteudo     = itemView.findViewById(R.id.textViewConteudo);
            mConteudoFoto = itemView.findViewById(R.id.imageViewConteudo);
        }
    }
}
