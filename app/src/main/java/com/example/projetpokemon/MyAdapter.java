package com.example.projetpokemon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[], data2[];
    int imag[];
    Context context;

    public MyAdapter(Context ct, String s1[], String s2[], int images[]){
        this.context = ct;   /*a quoi fait reference ce context je ne comprends pas*/
        this.data1 = s1;
        this.data2 = s2;
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
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImageView.setImageResource(imag[position]);
    }

    @Override
    public int getItemCount() {
        return imag.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {    /*pourquoi on met une classe dans une autre classe?*/

        TextView myText1, myText2;
        ImageView myImageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.mytext1);
            myText2 = itemView.findViewById(R.id.mytext2);
            myImageView = itemView.findViewById(R.id.myImageView);
        }
    }
}
