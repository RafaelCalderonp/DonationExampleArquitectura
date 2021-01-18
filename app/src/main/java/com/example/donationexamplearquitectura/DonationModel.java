package com.example.donationexamplearquitectura;

import android.util.Log;

public class DonationModel {
    private int donationAmount;

    public DonationModel() {
        this.donationAmount = 0;
    }

    public boolean saveDonation (String donation) {
        int amount = validateString(donation);
        if (amount <= 0) {
            return false;
        } else {
            this.donationAmount += amount;
            return true;
        }
    }

    public int validateString(String value){
        try {
            int donation = Integer.parseInt(value);
            return donation;
        } catch (NumberFormatException error){
            Log.e("Error", error.toString());
            return -1;
        }
    }
    public String checkAmountDonation(){
        if(donationAmount < 200){
            return "#D61212";
        }else{
            if (donationAmount >= 200 && donationAmount < 500){
            return "#56E30A";
        }else {
                return "#FF3700B3";
            }

        }
    }
    public int getDonationAmount() {
        return donationAmount;
    }
}
