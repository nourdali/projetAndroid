package com.example.appservices.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.Window;

import com.example.appservices.Adapter.CourseAdapter;
import com.example.appservices.Domain.CourseDomain;
import com.example.appservices.R;
import com.example.appservices.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        initRecyclerView();

        Window window = MainActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.white));
    }

    private void initRecyclerView() {
        ArrayList<CourseDomain> itemsArraylist = new ArrayList<>();

        itemsArraylist.add(new CourseDomain("Quick learn c# langage","Hiba ", 130, 4.8, "pic1"));
        itemsArraylist.add(new CourseDomain("Quick learn Angular langage","nour ", 450, 4.6, "pic2"));
        itemsArraylist.add(new CourseDomain("Quick learn Java langage","younes", 700, 4.3, "pic3"));

        binding.popularView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        binding.popularView.setAdapter(new CourseAdapter(itemsArraylist));

    }
}