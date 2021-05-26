package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    TextView txt_name,txt_email,txt_pass,txt_contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        txt_name=findViewById(R.id.txt_name);
        txt_email=findViewById(R.id.txt_email);
        txt_pass=findViewById(R.id.txt_pass);
        txt_contact=findViewById(R.id.txt_contact);

        //data fetch
        Intent intent =getIntent();
        //data save in NAME object
        String NAME = intent.getStringExtra("name_key");
        txt_name.setText(NAME);

        String EMAIL = intent.getStringExtra("email_key");
        //EMAIL data set to txt_email
        txt_email.setText(EMAIL);

        String PASSWORD = intent.getStringExtra("pass_key");
        //EMAIL data set to txt_pass
        txt_pass.setText(PASSWORD);

        String CONTACT = intent.getStringExtra("contact_key");
        //EMAIL data set to txt_contact
        txt_contact.setText(CONTACT);



    }
}