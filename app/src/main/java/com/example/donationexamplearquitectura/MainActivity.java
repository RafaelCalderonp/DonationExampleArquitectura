package com.example.donationexamplearquitectura;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.example.donationexamplearquitectura.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IViewPresenter{
    private ActivityMainBinding mBanding;
    private DonationPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBanding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBanding.getRoot());
        presenter= new DonationPresenter(this);
        mBanding.button.setOnClickListener(v -> makeDonation() );
    }
    private void makeDonation(){
        presenter.saveDonation(mBanding.etDonation.getText().toString());
        mBanding.etDonation.setText("");
        presenter.checkTotal();
    }

    @Override
    public void updateTotalDonation(int totalAmount) {
        String total = getString(R.string.total_donation, String.valueOf(totalAmount));
        mBanding.tvTotal.setText((total));
    }

    @Override
    public void displayConfirmationMessage() {
        Toast.makeText(this, "Donación realizada", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void displayErrorMessage() {
        Toast.makeText(this, "Algo ocurrio, error en la donación ",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void displayColorAlert(String colour) {
        mBanding.textView.setBackgroundColor(Color.parseColor(colour));
    }


}