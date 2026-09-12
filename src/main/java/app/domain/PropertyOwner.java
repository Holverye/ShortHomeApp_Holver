package app.domain;

import java.util.Date;

public class PropertyOwner extends Person {

    private String ownerType;


    public String getOwnerType() {
        return ownerType;
    }

    public PropertyOwner(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthDate, String ownerType) {
        super(id, docType, name, lastName, phone, email, address, password, birthDate);
        this.ownerType = ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    @Override
    public void create() {
        super.create();
    }


    @Override
    public void selectById(int id) {
        super.selectById(id);
    }


    @Override
    public void selectAll() {
        super.selectAll();
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void delete(int id) {
        super.delete(id);
    }
}
