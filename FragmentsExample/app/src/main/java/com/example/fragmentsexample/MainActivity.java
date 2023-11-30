package com.example.fragmentsexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.sax.RootElement;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.fragments.FirstFragment;
import com.example.fragments.SecondFragment;
import com.example.fragmentsexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle bundle = new Bundle();
        bundle.putString("name", "Shor");
        bundle.putInt("id", 100);




        binding.btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                FirstFragment firstFragment = new FirstFragment();
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.linearlayoutFragment, firstFragment);
//                transaction.commit();



                loadFragment(new FirstFragment(), 1);
            }
        });

        binding.btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                SecondFragment secondFragment = new SecondFragment();
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.linearlayoutFragment, secondFragment);
//                transaction.commit();
                loadFragment(new SecondFragment(),2);
            }
        });

    }

    public void loadFragment(Fragment fragment1, int flag){
        FragmentManager fragment = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.linearlayoutFragment, fragment1);
        fragmentTransaction.commit();
    }
}