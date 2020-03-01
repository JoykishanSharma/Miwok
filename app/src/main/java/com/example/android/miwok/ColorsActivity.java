package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colors = new ArrayList<>();

        colors.add(new Word("red","weṭeṭṭi"));
        colors.add(new Word("green","chokokki"));
        colors.add(new Word("brown","ṭakaakki"));
        colors.add(new Word("gray","ṭopoppi"));
        colors.add(new Word("black","kululli"));
        colors.add(new Word("white","kelelli"));
        colors.add(new Word("dusty yellow","ṭopiisә"));
        colors.add(new Word("mustard yellow","chiwiiṭә"));


        ListView listView = findViewById(R.id.list);

        WordAdapter adapter = new WordAdapter(this, colors);

        listView.setAdapter(adapter);
    }
}
