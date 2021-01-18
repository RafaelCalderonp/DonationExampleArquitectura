package com.example.donationexamplearquitectura;

public interface IViewPresenter {
    void updateTotalDonation(int totalAmount);
    void displayConfirmationMessage();
    void displayErrorMessage();
    void displayColorAlert(String colour);

}
