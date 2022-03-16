package com.example.sample_constraint_layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {

    //Deklarasi variabel engan tipe data EditText
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    //Deklarasi variabel dengan tipe data floating Action Button
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtEmail = findViewById(R.id.EdEmail);
        edtPassword = findViewById(R.id.edPass);
        edtrepass = findViewById(R.id.edrepas);

        fab = findViewById(R.id.febSimpan);

        //membuat method untuk event dari floating button
        fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (edtNama.getText().toString().isEmpty() ||
                    edtNama.getText().toString().isEmpty() ||
                    edtEmail.getText().toString().isEmpty() ||
                    edtPassword.getText().toString().isEmpty() ||
                    edtrepass.getText().toString().isEmpty())
            {
                //menampilkan pesan notifikasi jika seluruh EditText kosong atau tidak
                Snackbar.make(view, "wajib isi seluruh data ! ! !", Snackbar.LENGTH_LONG).show();
            }
            else
            {
                //membuat kondisi untuk mengecek apakah isi dari EditText password dan EditText repassword
                //sama atau tidak
                if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                {
                    //menampilakan pesan notifikasi jika pendaftaran berhasil
                    Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil. . .",
                        Toast.LENGTH_LONG).show();

                    //method untuk kembali ke activity main
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                }
                else
                {
                    //menampilakan pesan bahwa isi dari EditText password dan EditText repassword tidak sama
                    Snackbar.make(view,  "Password dan Repassword harus sama ! ! ! !",
                        Snackbar.LENGTH_LONG).show();
                }
            }
        }
        });
    }
}
