package com.example.appservices.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.appservices.R;
import com.example.appservices.databinding.ActivityIntoBinding;

public class IntoActivity extends AppCompatActivity {
    ActivityIntoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityIntoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(IntoActivity.this, MainActivity.class));
            }

        });

        Window window = IntoActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(IntoActivity.this, R.color.purple));
    }

}