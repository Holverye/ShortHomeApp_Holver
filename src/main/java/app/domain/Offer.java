package app.domain;

public class Offer {

    private Integer offerId;
    private String dateInit;
    private String dateEnd;
    private Property property;
    private String description;
    private double value;
    private String offerState;


    public Offer() {
    }


    public Offer(Integer offerId, String dateInit, String dateEnd, Property property, String description, double value, String offerState) {
        this.offerId = offerId;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.property = property;
        this.description = description;
        this.value = value;
        this.offerState = offerState;
    }


    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public String getDateInit() {
        return dateInit;
    }

    public void setDateInit(String dateInit) {
        this.dateInit = dateInit;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getOfferState() {
        return offerState;
    }

    public void setOfferState(String offerState) {
        this.offerState = offerState;
    }
}
