package com.example.addviewcontacts_szymonzarychta_michaljanik_29_11;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnAddContact;
    Button btnShowContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddContact = findViewById(R.id.btnAddContact);
        btnShowContacts = findViewById(R.id.btnShowContacts);

        btnAddContact.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddContact.class);
            startActivity(intent);
        });

        btnShowContacts.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ShowContact.class);
            startActivity(intent);
        });
    }
}
