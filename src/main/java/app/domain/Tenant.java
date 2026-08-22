package app.domain;

import java.util.Date;

public class Tenant extends Person{

    private String maritalStatus;
    private String profession;

    public Tenant() {
        super();
    }

    public Tenant(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthDate, String maritalStatus, String profession) {
        super(id, docType, name, lastName, phone, email, address, password, birthDate);
        this.maritalStatus = maritalStatus;
        this.profession = profession;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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
