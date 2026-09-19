package app.service.inputport;

import app.domain.PropertyOwner;

import java.util.Date;
import java.util.List;

public interface PropertyOwnerService {

    public PropertyOwner createPropertyOwner(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthDate, String ownerType);
    public PropertyOwner selectOwnerById(int id);
    public List<PropertyOwner> selectAllOwners();
    public PropertyOwner updatePropertyOwner(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthDate, String ownerType);
    public void deleteOwner(int id);
}
