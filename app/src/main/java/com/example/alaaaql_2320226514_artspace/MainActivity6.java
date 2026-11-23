package com.example.alaaaql_2320226514_artspace;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.alaaaql_2320226514_artspace.databinding.ActivityMain6Binding;
import com.example.alaaaql_2320226514_artspace.databinding.ActivityMainBinding;

public class MainActivity6 extends AppCompatActivity {

    public static ActivityMain6Binding art6Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        art6Binding = ActivityMain6Binding.inflate(getLayoutInflater());
        setContentView(art6Binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        art6Binding.btnPrevious.setEnabled(true);
        art6Binding.btnPrevious.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#754608")));

        // تعطيل Next في آخر لوحة
        art6Binding.btnNext.setEnabled(false);
        art6Binding.btnNext.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#BDBDBD")));

        art6Binding.btnPrevious.setOnClickListener(view -> finish());

        art6Binding.imageArt1.setOnClickListener(view -> {
            String message = "Title: " + art6Binding.textArtname.getText().toString()
                    + "\n" + art6Binding.textarterYear.getText().toString();
            Intent intent = new Intent(this, ArtworkDetails1Activity.class);
            intent.putExtra(MainActivity.SEND_INTENT_MESSAGE_KEY, message);
            startActivityForResult(intent, MainActivity.REQUEST_OK);
        });
    }
}