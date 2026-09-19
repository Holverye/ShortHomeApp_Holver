package app.service;

import app.domain.Offer;
import app.domain.Property;
import app.service.inputport.OfferService;

import java.util.List;

public class OfferServiceImpl implements OfferService {

    @Override
    public Offer createOffer(Integer offerId, String dateInit, String dateEnd, Property property, String description, double value, String offerState) {
        return null;
    }

    @Override
    public Offer selectOfferById(int id) {
        return null;
    }

    @Override
    public List<Offer> selectAllOffers() {
        return List.of();
    }

    @Override
    public Offer updateOffer(Integer offerId, String dateInit, String dateEnd, Property property, String description, double value, String offerState) {
        return null;
    }

    @Override
    public void deleteOfferById(int id) {

    }
}
