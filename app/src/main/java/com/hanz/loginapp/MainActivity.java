package com.hanz.loginapp;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import java.util.Calendar;

import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etFullName, etUsername, etEmail, etPassword, etConfirmPassword, etPhoneNumber, etAddress, txtTgl;
    private Spinner spinnerGender;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        etFullName = findViewById(R.id.editTextText);
        etUsername = findViewById(R.id.editTextText1);
        etEmail = findViewById(R.id.editTextText2);
        etPassword = findViewById(R.id.editTextTextPassword);
        etConfirmPassword = findViewById(R.id.editTextTextPassword2);
        spinnerGender = findViewById(R.id.spinner);
        etPhoneNumber = findViewById(R.id.editTextPhone3);
        etAddress = findViewById(R.id.editTextText3);
        txtTgl = findViewById(R.id.txt_tgl);  // Ensure you have this EditText in your XML layout
        btnRegister = findViewById(R.id.button);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });

        // You may want to trigger DatePickerDialog when a user clicks on txtTgl
        txtTgl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });
    }

    private void showDatePickerDialog() {
        // Get the current date
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Create DatePickerDialog with spinner theme
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                MainActivity.this,
                android.R.style.Theme_Holo_Light_Dialog, // Use spinner theme
                (view, selectedYear, selectedMonth, selectedDay) -> {
                    // Set the selected date to the EditText
                    String date = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
                    txtTgl.setText(date);
                },
                year, month, day
        );

        // Show DatePickerDialog
        datePickerDialog.show();
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
        Toast.makeText(this, "Selamat Datang " + fullName + ", dengan email: " + email + ",Tanggal Lahir"+ txtTgl, Toast.LENGTH_SHORT).show();
// You can now save the data to your database or send it to a server
    }
}