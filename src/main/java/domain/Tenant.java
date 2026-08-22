package domain;

public class Tenant extends Person{

    private String MaritalStatus;
    private String profession;

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
