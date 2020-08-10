package com.kostya_zinoviev.recyclerviewniceexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private AdapterRview adapter;
    private ArrayList<Person> persons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        persons = new ArrayList<>();
        persons.add(new Person(R.drawable.ic_love,"Костя","Зиновьев"));
        persons.add(new Person(R.drawable.ic_love,"Даня","Алтухов"));
        persons.add(new Person(R.drawable.ic_love,"Арина","Алтухова"));
        persons.add(new Person(R.drawable.ic_love,"Полина","Зиновьева"));
        persons.add(new Person(R.drawable.ic_love,"Костя","Зиновьев"));
        persons.add(new Person(R.drawable.ic_love,"Даня","Алтухов"));
        persons.add(new Person(R.drawable.ic_love,"Арина","Алтухова"));
        persons.add(new Person(R.drawable.ic_love,"Полина","Зиновьева"));
        persons.add(new Person(R.drawable.ic_love,"Костя","Зиновьев"));
        persons.add(new Person(R.drawable.ic_love,"Даня","Алтухов"));
        persons.add(new Person(R.drawable.ic_love,"Арина","Алтухова"));
        persons.add(new Person(R.drawable.ic_love,"Полина","Зиновьева"));
        persons.add(new Person(R.drawable.ic_love,"Костя","Зиновьев"));
        persons.add(new Person(R.drawable.ic_love,"Даня","Алтухов"));
        persons.add(new Person(R.drawable.ic_love,"Арина","Алтухова"));
        persons.add(new Person(R.drawable.ic_love,"Полина","Зиновьева"));
        rv = findViewById(R.id.rview);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterRview(persons);
        rv.setAdapter(adapter);
    }
}
