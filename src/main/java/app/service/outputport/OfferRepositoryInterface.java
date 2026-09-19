package app.service.outputport;

import app.domain.Offer;

import java.util.List;

public interface OfferRepositoryInterface {


    public Offer saveOffer(Offer offer);
    public Offer selectOfferById(int id);
    public List<Offer> selectAllOffer();
    public Offer updateOffer(Offer offer);
    public void deleteOfferById(int id);




}
