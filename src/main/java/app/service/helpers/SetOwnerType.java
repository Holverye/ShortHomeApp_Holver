package app.service.helpers;

import app.domain.enums.OwnerTypeEnum;

public class SetOwnerType {

    public static String getOwnerType(){

        int option = 0;
        String value = "";
        switch (option){
            case 1:
                value = OwnerTypeEnum.DIRECT_OWNER.getValue();
                break;
            case 2:
                value = OwnerTypeEnum.PROPERTY_MANAGER.getValue();
                break;
            case 3:
                value = OwnerTypeEnum.REAL_ESTATE_AGENCY.getValue();
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
        return value;
    }
}
