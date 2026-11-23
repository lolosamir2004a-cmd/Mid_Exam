package com.example.alaaaql_2320226514_artspace;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.alaaaql_2320226514_artspace.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_INDEX = "current_index";
    public static  final String SEND_INTENT_MESSAGE_KEY="message";
    public static  final int REQUEST_OK=1;
    public int currentIndex = 0;
public static ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        if (savedInstanceState != null) {
        }

        mainBinding.btnNext.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);

    });
     mainBinding.imageArt1.setOnClickListener(view -> {
         String message = "Title: " +mainBinding.textArtname.getText().toString()
                 + "\nArtist & Year: " +mainBinding.textarterYear.getText().toString();
         Intent intent= new Intent(this, ArtworkDetails1Activity.class);
         intent.putExtra(SEND_INTENT_MESSAGE_KEY,message);
         startActivity(intent);
     });

}
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("mainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("mainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("mainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mainActivity", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("mainActivity", "onRestart");
    }



    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

    }
}