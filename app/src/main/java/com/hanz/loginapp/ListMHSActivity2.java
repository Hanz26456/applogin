package com.hanz.loginapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ListMHSActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView list;
    private ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);  // Jika Anda masih ingin menggunakan EdgeToEdge
        setContentView(R.layout.activity_list_mhsactivity3);

        // Inisialisasi ListView
        list = findViewById(R.id.List);

        // Inisialisasi adapter dengan array dari resources
        adapter = ArrayAdapter.createFromResource(this,
                R.array.Nama_Mahasiswa,
                android.R.layout.simple_list_item_1); // Gunakan layout yang sesuai untuk item list

        // Set adapter ke ListView
        list.setAdapter(adapter);

        // Set listener untuk item klik
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // Tangani event klik item di sini
        String selectedItem = parent.getItemAtPosition(position).toString();
        // Tampilkan pesan atau lakukan aksi lainnya
        Toast.makeText(this, "Anda memilih: " + selectedItem, Toast.LENGTH_SHORT).show();
    }
}
