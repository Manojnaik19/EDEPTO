package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.test.databinding.ActivityResBinding;

public class res extends AppCompatActivity {

ActivityResBinding binding;
HomeFragment homeFragment=new HomeFragment();
FavoriteFragment favoriteFragment=new FavoriteFragment();
CalculateFragment calculateFragment=new CalculateFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityResBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.home) {
                replaceFragment(new HomeFragment());
            } else if (item.getItemId() == R.id.favorite) {
                replaceFragment(new FavoriteFragment());
            } else if (item.getItemId() == R.id.calculate) {
                replaceFragment(new CalculateFragment());
            }
            return true;
        });

    }



    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}


