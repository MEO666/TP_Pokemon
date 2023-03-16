package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView txt = findViewById(R.id.descriptions);


        Uri imageUri = getIntent().getParcelableExtra("imageUri");
        ImageView imageView = findViewById(R.id.poke);
        imageView.setImageURI(imageUri);
        String desc = getIntent().getStringExtra("desc");
        if (desc != null) {
            txt.setText(desc);
        }


        Uri imageUri2 = getIntent().getParcelableExtra("imageUri2");
        ImageView imageView2 = findViewById(R.id.poke2);
        imageView2.setImageURI(imageUri2);

        Uri imageUri3 = getIntent().getParcelableExtra("imageUri3");
        ImageView imageView3 = findViewById(R.id.poke3);
        imageView3.setImageURI(imageUri3);




    }
}