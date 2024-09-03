package com.hanz.loginapp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etFullName, etUsername, etEmail, etPassword, etConfirmPassword, etPhoneNumber, etAddress;
    private DatePicker datePicker;
    private Spinner spinnerGender;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        etFullName = findViewById(R.id.editTextText);
        etUsername = findViewById(R.id.editTextText1);
        datePicker = findViewById(R.id.datepicker);
        etEmail = findViewById(R.id.editTextText2);
        etPassword = findViewById(R.id.editTextTextPassword);
        etConfirmPassword = findViewById(R.id.editTextTextPassword2);
        spinnerGender = findViewById(R.id.spinner);
        etPhoneNumber = findViewById(R.id.editTextPhone3);
        etAddress = findViewById(R.id.editTextText3);
        btnRegister = findViewById(R.id.button);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void registerUser() {
        // Retrieve input data
        String fullName = etFullName.getText().toString().trim();
        String username = etUsername.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        String confirmPassword = etConfirmPassword.getText().toString().trim();
        String phoneNumber = etPhoneNumber.getText().toString().trim();
        String address = etAddress.getText().toString().trim();
        String gender = spinnerGender.getSelectedItem().toString();

        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth() + 1; // Month starts from 0
        int year = datePicker.getYear();
        String birthDate = day + "/" + month + "/" + year;

        // Basic validation
        if (TextUtils.isEmpty(fullName) || TextUtils.isEmpty(username) || TextUtils.isEmpty(email)
                || TextUtils.isEmpty(password) || TextUtils.isEmpty(confirmPassword)
                || TextUtils.isEmpty(phoneNumber) || TextUtils.isEmpty(address)) {
            Toast.makeText(this, "Harap Isi Semua Kolom", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!password.equals(confirmPassword)) {
            Toast.makeText(this, "Password Tidak Sama", Toast.LENGTH_SHORT).show();
            return;
        }

        // Proceed with registration (e.g., save data or send to server)
        Toast.makeText(this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show();
        // You can now save the data to your database or send it to a server
    }
}
