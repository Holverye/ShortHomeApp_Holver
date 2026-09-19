package app.view;

import app.service.inputport.OfferService;

import java.util.Scanner;

public class OfferView {

    Scanner sc = new Scanner(System.in);

    private final OfferService offerService;

    public OfferView(OfferService offerService){
        this.offerService = offerService;
    }

    public void createOffer(){

        System.out.println("Ingrese el id de la oferta");
        Integer offerId = sc.nextInt();
        sc.nextLine();

        //offerService.createOffer(offerId,);

    }



}
