package app.service.inputport;

import app.domain.Offer;
import app.domain.Property;

import java.util.List;

public interface OfferService {

    public Offer createOffer(Integer offerId, String dateInit, String dateEnd, Property property, String description, double value, String offerState);
    public Offer selectOfferById(int id);
    public List<Offer> selectAllOffers();
    public Offer updateOffer(Integer offerId, String dateInit, String dateEnd, Property property, String description, double value, String offerState);
    public void deleteOfferById(int id);

}
