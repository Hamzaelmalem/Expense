package com.example.contrrolyourmoney;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.view.WindowManager;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    private View homeIcon, searchIcon, listIcon, settingIcon;
    private TextView homeText, searchText, listText, settingText;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        homeIcon = findViewById(R.id.home);
        searchIcon = findViewById(R.id.search);
        listIcon = findViewById(R.id.list);
        settingIcon = findViewById(R.id.setting);
        homeText = findViewById(R.id.homeText);
        searchText = findViewById(R.id.searchText);
        listText = findViewById(R.id.listText);
        settingText = findViewById(R.id.settingText);
        homeText.setTextColor(Color.parseColor("#FFFFFFFF"));
        homeIcon.setBackgroundResource(R.drawable.home_activated);
    }


    public void setButtonAction(View viewEnabled, View viewDisabled1, View viewDisabled2, View viewDisabled3,  int backEnabled, int backDisabled1, int backDisabled2, int backDisabled3, TextView textEnabled, TextView textDisabled1, TextView textDisabled2, TextView textDisabled3){
        viewEnabled.setBackgroundResource(backEnabled);
        textEnabled.setTextColor(Color.parseColor("#FFFFFFFF"));

        viewDisabled1.setBackgroundResource(backDisabled1);
        viewDisabled2.setBackgroundResource(backDisabled2);
        viewDisabled3.setBackgroundResource(backDisabled3);
        textDisabled1.setTextColor(Color.parseColor("#80FFFFFF"));
        textDisabled2.setTextColor(Color.parseColor("#80FFFFFF"));
        textDisabled3.setTextColor(Color.parseColor("#80FFFFFF"));
    }
    public void setFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }
}