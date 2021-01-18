package com.example.donationexamplearquitectura;

public class Controller {
    private DonationModel model;

    public Controller() {
        this.model = new DonationModel();
    }

    public boolean saveDonation(String amount) {
       return (model.saveDonation(amount));
       }

    public int totalDonation(){
        return model.getDonationAmount();
    }

}


