package com.example.books;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter {

    ArrayList<Book> mArray;
    Context context;

    public BookAdapter(ArrayList<Book> mArray, Context context) {
        this.mArray = mArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //connecting to movie_list_item xml
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).title.setText(mArray.get(position).getTitle()+"");
        ((ViewHolder) holder).author.setText(mArray.get(position).getAuthor()+"");
        ((ViewHolder) holder).genre.setText(mArray.get(position).getGenre()+"");
        ((ViewHolder) holder).rate.setText(mArray.get(position).getRate()+"");
        ((ViewHolder) holder).img.setImageResource(mArray.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return mArray.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img;
        public TextView title;
        public TextView author;
        public TextView rate ;
        public TextView genre ;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView; //مهم جدا
            img = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.titletxt);
            author = itemView.findViewById(R.id.authortxt);
            rate = itemView.findViewById(R.id.ratetxt);
            genre = itemView.findViewById(R.id.genretxt);
        }
    }
}
