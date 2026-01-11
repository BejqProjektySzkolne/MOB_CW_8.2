package com.example.addviewcontacts_szymonzarychta_michaljanik_29_11;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;

import androidx.appcompat.app.AppCompatActivity;

public class AddContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(Intent.ACTION_INSERT);
        intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);

        intent.putExtra(ContactsContract.Intents.Insert.NAME, "Jan Kowalski");
        intent.putExtra(ContactsContract.Intents.Insert.PHONE, "123456789");
        intent.putExtra(ContactsContract.Intents.Insert.EMAIL, "jan.kowalski@email.com");

        startActivity(intent);
        finish();
    }
}
