package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Bulbasaur = findViewById(R.id.Bulbasaur);
        ImageView charman = findViewById(R.id.Charmander);

    Bulbasaur.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.bulbasaur);
            intent.putExtra("imageUri", imageUri);
            String desc = "Height : 2' 04 / Weight : 15.2 / Category : Seed";
            intent.putExtra("desc",desc);
            startActivity(intent);

        }
    });

    charman.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.charmandar);
            intent.putExtra("imageUri2", imageUri);
            String desc = "Height : 2' 00 / Weight : 18.7 / Category : Lizard";
            intent.putExtra("desc",desc);
            startActivity(intent);
        }
    });

    ImageView edit3 = findViewById(R.id.tortle);
    edit3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.wartortle);
            intent.putExtra("imageUri3", imageUri);
            String desc = "Height : 3' 03 / Weight : 49.6 / Category : Turtle";
            intent.putExtra("desc",desc);
            startActivity(intent);
        }
    });

        /*TextView edit1 = findViewById(R.id.textView_Bulbasaur);
        TextView edit2 = findViewById(R.id.textView_cham);*/


        /*Bulbasaur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText("Height : 2'04 / Weight : 15.2 / Category : Seed");
            }
        });
        charman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit2.setText("Height : 2'00 / Weight : 18.7 / Category : Lizard");
            }
        });*/

        /*charman.setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View view, MotionEvent motionEvent) {

                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_HOVER_ENTER:
                        edit2.setText("Height : 2'00 / Weight : 18.7 / Category : Lizard");
                        edit2.setVisibility(View.VISIBLE);
                        break;
                    case MotionEvent.ACTION_HOVER_EXIT:
                        edit2.setVisibility(View.GONE);
                        break;
                }
                return false;
            }
        });*/



    }
}