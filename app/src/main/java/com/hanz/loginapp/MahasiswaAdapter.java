package com.hanz.loginapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private List<Mahasiswa> mahasiswaList;  // Ubah tipe ke Mahasiswa

    public MahasiswaAdapter(List<Mahasiswa> mahasiswaList) {  // Ubah tipe ke Mahasiswa
        this.mahasiswaList = mahasiswaList;
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mahasiswakontak, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        Mahasiswa mahasiswa = mahasiswaList.get(position);  // Ambil objek Mahasiswa
        holder.nama.setText(mahasiswa.getNama());           // Gunakan metode instance
        holder.noTelp.setText(mahasiswa.getNoTelp());
        holder.email.setText(mahasiswa.getEmail());
        holder.foto.setImageResource(mahasiswa.getFoto());
    }

    @Override
    public int getItemCount() {
        return mahasiswaList.size();
    }

    static class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        TextView nama, noTelp, email;
        ImageView foto;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.tvNama);
            noTelp = itemView.findViewById(R.id.tvNoTelp);
            email = itemView.findViewById(R.id.tvEmail);
            foto = itemView.findViewById(R.id.imgFoto);
        }
    }
}
