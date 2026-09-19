package app.repository;

import app.domain.Offer;
import app.service.outputport.OfferRepositoryInterface;

import java.util.List;

public class OfferRepositoryImpl implements OfferRepositoryInterface {


    @Override
    public Offer saveOffer(Offer offer) {
        return null;
    }

    @Override
    public Offer selectOfferById(int id) {
        return null;
    }

    @Override
    public List<Offer> selectAllOffer() {
        return List.of();
    }

    @Override
    public Offer updateOffer(Offer offer) {
        return null;
    }

    @Override
    public void deleteOfferById(int id) {

    }
}
