package app.domain;

public class PropertyOwner extends Person {

    private String ownerType;


    public String getOwnerType() {
        return ownerType;
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
