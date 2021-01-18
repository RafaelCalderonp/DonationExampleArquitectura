package com.example.donationexamplearquitectura;

public class DonationModel {
    private int donationAmount;

    public int getDonationAmount() {
        return donationAmount;
    }

    public DonationModel() {
        this.donationAmount = 0;
    }

    public boolean saveDonation (String donation) {
        Integer amount = Integer.valueOf(donation);
        if (amount <= 0) {
            return false;
        } else {
            this.donationAmount += amount;
            return true;
        }
    }
}
