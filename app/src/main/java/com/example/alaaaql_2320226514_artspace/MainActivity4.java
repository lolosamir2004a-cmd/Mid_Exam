package com.example.alaaaql_2320226514_artspace;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.alaaaql_2320226514_artspace.databinding.ActivityMain4Binding;
import com.example.alaaaql_2320226514_artspace.databinding.ActivityMainBinding;

public class MainActivity4 extends AppCompatActivity {

    public static ActivityMain4Binding art2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        art2Binding = ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(art2Binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        art2Binding.btnPrevious.setEnabled(true);
        art2Binding.btnNext.setEnabled(true);

        art2Binding.btnPrevious.setOnClickListener(view -> finish());

        art2Binding.btnNext.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity5.class);
            startActivity(intent);
        });

        art2Binding.imageArt1.setOnClickListener(view -> {
            String message = "Title: " + art2Binding.textArtname.getText().toString()
                    + "\n" + art2Binding.textarterYear.getText().toString();
            Intent intent = new Intent(this, ArtworkDetails1Activity.class);
            intent.putExtra(MainActivity.SEND_INTENT_MESSAGE_KEY, message);
            startActivityForResult(intent, MainActivity.REQUEST_OK);
        });
    }
}