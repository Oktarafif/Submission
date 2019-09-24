package com.example.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail1 extends AppCompatActivity {

   public TextView Nama,Detail;
   public ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);

        Nama = findViewById(R.id.Nama);
        Detail = findViewById(R.id.Detail);
        image = findViewById(R.id.image);

        Food extra = getIntent().getParcelableExtra("objek");
        Nama.setText(extra.getName());
        Detail.setText(extra.getDetail());
        image.setImageResource(extra.getPhoto());

    }
}
