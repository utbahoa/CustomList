package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        //create data
        ArrayList<Champ> arrayList = new ArrayList<>();

        arrayList.add(new Champ(R.drawable.ashe,"Ashe","Xạ thủ"));
        arrayList.add(new Champ(R.drawable.aatrox,"Aatrox","Đấu sĩ"));
        arrayList.add(new Champ(R.drawable.anine,"Anine","Pháp sư"));
        arrayList.add(new Champ(R.drawable.pyke,"Pyke","Sát thủ"));
        arrayList.add(new Champ(R.drawable.riven,"Riven","Đấu sĩ"));
        arrayList.add(new Champ(R.drawable.ashe,"Yasuo","Feeder"));

        ChampAdapter champAdapter = new ChampAdapter(this,R.layout.list_row,arrayList);

        listView.setAdapter(champAdapter);

    }
}