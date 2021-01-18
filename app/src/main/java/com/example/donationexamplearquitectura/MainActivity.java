package com.example.donationexamplearquitectura;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.donationexamplearquitectura.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBanding;
    private Controller controller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBanding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBanding.getRoot());
        controller = new Controller();
        mBanding.button.setOnClickListener(v -> makeDonation() );
    }
    private void makeDonation(){

        boolean donation = controller.saveDonation(mBanding.etDonation.getText().toString());
        if (donation){
            int totalDonation = controller.totalDonation();
            String total = getString(R.string.total_donation, String.valueOf(totalDonation));
            mBanding.tvTotal.setText((total));
            mBanding.etDonation.setText("");
        }else{
            showMessage("Donación no realizada");
        }
    }

    private void showMessage (String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}