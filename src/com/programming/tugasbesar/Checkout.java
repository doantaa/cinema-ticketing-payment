package com.programming.tugasbesar;

import javax.swing.*;

public class Checkout extends JFrame{
    private JRadioButton QRISRadioButton;
    private JRadioButton debitCardCreditCardRadioButton;
    private JRadioButton mobileBankingRadioButton;
    private JButton payButton;
    private JPanel FilmDetails;
    private JPanel tiketDetailPanel;
    private JLabel filmTitleLabel;
    private JLabel filmRateLabel;
    private JLabel filmDateLabel;
    private JLabel filmTimeLabel;
    private JLabel ticketLabel;
    private JLabel seatNumberLabel;
    private JLabel subTotalLabel;
    private JLabel subTotalValueLabel;
    private JLabel taxLabel;
    private JLabel taxValueLabel;
    private JLabel totalLabel;
    private JLabel totalValue;
    private JLabel paymentMethodLabel;
    private JLabel checkoutTitle;
    private JPanel checkoutPanel;
    private JPanel paymentPanel;
    private JPanel priceLabelPanel;
    private JPanel pricePanel;

    public  Checkout(){
        //menentukan judul aplikasi
        super("Checkout");

        //menentukan apa yang terjadi jika tombol [x] ditekan
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //menentukan resolusi window/frame
        this.setSize( 530,550);

        //menentukan panel mana yang akan dijadikan konten
        this.setContentPane(checkoutPanel);

    }

    public static void main(String[] args) {
        JFrame checkoutFrame = new Checkout();
        checkoutFrame.setVisible(true);
    }

}
