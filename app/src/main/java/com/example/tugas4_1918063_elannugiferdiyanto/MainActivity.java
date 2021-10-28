package com.example.tugas4_1918063_elannugiferdiyanto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleview);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Ferdy", "1118002", "2011", R.drawable.ffa));
        mahasiswaArrayList.add(new Mahasiswa("Angga", "1118031", "2011", R.drawable.foto2));
        mahasiswaArrayList.add(new Mahasiswa("Diki", "11180021", "2011", R.drawable.foto3));
        mahasiswaArrayList.add(new Mahasiswa("Sasa", "1118041", "2011", R.drawable.foto4));
        mahasiswaArrayList.add(new Mahasiswa("Yoga", "1118052", "2011", R.drawable.foto5));
        mahasiswaArrayList.add(new Mahasiswa("Eka", "1118061", "2011", R.drawable.foto6));
        mahasiswaArrayList.add(new Mahasiswa("Nugi", "1118071", "2011", R.drawable.foto7));
    }
}
