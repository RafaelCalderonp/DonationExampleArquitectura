package com.example.donationexamplearquitectura;

public class DonationPresenter {

    private IViewPresenter view;
    private DonationModel model;

    public DonationPresenter(IViewPresenter view) {
        this.view = view;
        this.model = new DonationModel();
    }

    public void saveDonation(String donation){
        if(model.saveDonation(donation)){
            view.displayConfirmationMessage();
            view.updateTotalDonation(model.getDonationAmount());
        }else {
            view.displayErrorMessage();
        }
    }
    public void checkTotal() {
        view.displayColorAlert(model.checkAmountDonation());
    }

}
