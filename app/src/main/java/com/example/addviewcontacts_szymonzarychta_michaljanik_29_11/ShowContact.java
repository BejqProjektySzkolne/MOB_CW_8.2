package com.example.addviewcontacts_szymonzarychta_michaljanik_29_11;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;

import androidx.appcompat.app.AppCompatActivity;

public class ShowContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setType(ContactsContract.Contacts.CONTENT_TYPE);

        startActivity(intent);
        finish();
    }
}

