package com.example.nicholas.recyclerandcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String [] name,desc;
    int[] image= {R.drawable.brazil,R.drawable.index,R.drawable.germany,R.drawable.kenya,R.drawable.britain,R.drawable.jamaica};
    ArrayList<Country> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=getResources().getStringArray(R.array.country);
        desc=getResources().getStringArray(R.array.description);

        int count = 0;

        for(String name:name){
            Country country = new Country(name,desc[count],image[count]);
            count++;
            arrayList.add(country);
        }
        recyclerView = (RecyclerView) findViewById(R.id.recy);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        adapter = new CountryAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);

    }
}
