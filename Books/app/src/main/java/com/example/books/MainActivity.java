package com.example.books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Book> books = new ArrayList<>();
         books.add(new Book("Six of crows","Leigh Bardugo","Young adult",4.8,R.drawable.sixofcrows));
        books.add(new Book("Crooked kingdom","Leigh Bardugo","Young adult",4.7,R.drawable.crooked));
        books.add(new Book("The assassin's blade ","Sarah J. Mass","Fantasy",4.2,R.drawable.blade));
        books.add(new Book("The cruel prince","Holly Black","Fantasy",3.8, R.drawable.cruel));

        RecyclerView booklist = findViewById(R.id.rv);
        booklist.setHasFixedSize(true);
        RecyclerView.LayoutManager lm= new LinearLayoutManager(this);
        booklist.setLayoutManager(lm);
        BookAdapter ba = new BookAdapter(books,MainActivity.this);
        booklist.setAdapter(ba);

    }
}