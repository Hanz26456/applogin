package com.hanz.loginapp;

public class Mahasiswa {
    private String nama;
    private String noTelp;
    private String email;
    private int foto;

    public Mahasiswa(String nama, String noTelp, String email, int foto) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.email = email;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getEmail() {
        return email;
    }

    public int getFoto() {
        return foto;
    }
}
