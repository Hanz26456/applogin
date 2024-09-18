package com.hanz.loginapp;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class kontakmahasiswa extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private List<Mahasiswa> mahasiswaList;  // Ubah tipe ke Mahasiswa

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);  // Jika fitur ini digunakan
        setContentView(R.layout.mahasiswakontak);  // Layout utama

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mahasiswaList = new ArrayList<>();

        // Tambahkan data mahasiswa
        mahasiswaList.add(new Mahasiswa("MUHAMMAD NOR KHOLIT", "081234567890", "kholit@gmail.com", R.drawable.ic_person));
        mahasiswaList.add(new Mahasiswa("AKBAR MAULIDI RISKIAWAN", "081234567891", "akbar@gmail.com", R.drawable.ic_person));
        mahasiswaList.add(new Mahasiswa("AHMAD ALFAHREZI", "081234567892", "ahmad@gmail.com", R.drawable.ic_person));
        mahasiswaList.add(new Mahasiswa("BUSTANUL ARIFIN", "081234567893", "bustanul@gmail.com", R.drawable.ic_person));
        mahasiswaList.add(new Mahasiswa("ILLHAM NUR ISNAINI BASKARA JAYA", "081234567894", "illham@gmail.com", R.drawable.ic_person));
        mahasiswaList.add(new Mahasiswa("SEPTIAN GALOH PRASETYO", "081234567895", "septian@gmail.com", R.drawable.ic_person));
        mahasiswaList.add(new Mahasiswa("FEBRI DWI KHOIRINA AZIS", "081234567896", "febri@gmail.com", R.drawable.ic_person));
        mahasiswaList.add(new Mahasiswa("ALEX ROHMATULLAH", "081234567897", "alex@gmail.com", R.drawable.ic_person));
        mahasiswaList.add(new Mahasiswa("REO ARYA YUDHA", "081234567898", "reo@gmail.com", R.drawable.ic_person));
        mahasiswaList.add(new Mahasiswa("MUHAMMAD SONU AFRIZA ZAKARIA", "081234567899", "sonu@gmail.com", R.drawable.ic_person));
        // Tambahkan lebih banyak data jika diperlukan

        // Set adapter
        adapter = new MahasiswaAdapter(mahasiswaList);
        recyclerView.setAdapter(adapter);

        // Handle inset untuk tampilan tepi layar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
