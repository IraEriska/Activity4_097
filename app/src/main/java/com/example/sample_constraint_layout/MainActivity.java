package com.example.sample_constraint_layout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel untuk batton
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama = "Iraeriska@gmail.com" , password = "1234";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //method untuk menampilkan menu.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //membuat kondisi jika yang dipilih adalah id mDaftar
        if (item.getItemId() == R.id.mnDaftar)
        {
            //method untuk memanggil activity "DaftarActivity"
            Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnlogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edemail = findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword = findViewById(R.id.edPassword);

        //Membuat fungsi onclik pada button btnlogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //menyimpan variabel toast dan membuat toast dengan menambahan variabel nama dan password
                Toast t = Toast.makeText(getApplicationContext(),
                         "Login Sukses", Toast.LENGTH_LONG);
                Toast y = Toast.makeText(getApplicationContext(),
                        "Password salah", Toast.LENGTH_LONG);
                Toast u = Toast.makeText(getApplicationContext(),
                        "Email Salah", Toast.LENGTH_LONG);
                Toast i = Toast.makeText(getApplicationContext(),
                        "Email dan Password Salah", Toast.LENGTH_LONG);

                t.show();
                y.show();
                u.show();
                i.show();




            }
        });

    }
}

