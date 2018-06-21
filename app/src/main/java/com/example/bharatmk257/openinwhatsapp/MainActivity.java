package com.example.bharatmk257.openinwhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void whatsapp (View view){
        EditText mobileEditText =(EditText) findViewById(R.id.mobileNo);
        String mobile = mobileEditText.getText().toString();

        String url = "https://api.whatsapp.com/send?phone=91"+mobile;
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}
