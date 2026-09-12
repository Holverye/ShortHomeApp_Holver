package app.domain.enums;

public enum OwnerTypeEnum {

    DIRECT_OWNER("Direct Owner"),
    PROPERTY_MANAGER("Property Manager"),
    REAL_ESTATE_AGENCY("Real Estate Agency");

    private final String value;


    OwnerTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
