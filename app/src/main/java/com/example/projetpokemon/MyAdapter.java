package com.example.projetpokemon;

import android.content.Context;
import android.content.pm.ShortcutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List <String> data1 = new ArrayList<>();
    List <String> data2 = new ArrayList<>();
    List <Integer> title = new ArrayList<>();
    List <Integer> imag= new ArrayList<>() ;
    Context context;

    public MyAdapter(Context ct,List <String> s1,List <String> s2,List<Integer> title, List <Integer> images){
        this.context = ct;       /*a quoi fait reference ce context je ne comprends pas*/
        this.data1 = s1;
        this.data2 = s2;
        this.title= title;
        this.imag = images;





    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent, false); /* qu'est ce qu'un layoutinflater*/
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) { /*j'aimerai des eclaircissements sur la position*/
        holder.myText1.setText(data1.get(position));
        holder.myText2.setText(data2.get(position));
        holder.imageViewTitle.setImageResource(title.get(position));
        holder.myImageView.setImageResource(imag.get(position));
    }

    @Override
    public int getItemCount() {
        return imag.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {    /*pourquoi on met une classe dans une autre classe?*/

        TextView myText1;
        TextView myText2;
        ImageView imageViewTitle;
        ImageView myImageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            myText1 = itemView.findViewById(R.id.mytext1);
            myText2 = itemView.findViewById(R.id.mytext2);
            imageViewTitle = itemView.findViewById(R.id.imageViewTitle);
            myImageView = itemView.findViewById(R.id.myImageView);
        }
    }







}

