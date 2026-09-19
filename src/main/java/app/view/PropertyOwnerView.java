package app.view;

import app.service.PropertyOwnerServiceImpl;
import app.service.helpers.SetOwnerDocType;
import app.service.helpers.SetOwnerType;

import java.util.Date;
import java.util.Scanner;

public class PropertyOwnerView {

    Scanner sc = new Scanner(System.in);

    private final PropertyOwnerServiceImpl propertyOwnerServiceImpl;


    PropertyOwnerView(PropertyOwnerServiceImpl propertyOwnerServiceImpl){
        this.propertyOwnerServiceImpl = propertyOwnerServiceImpl;
    }




    public void createPropertyOwner(){

        System.out.println("Ingrese el id del propietario");
        int id = sc.nextInt();
        System.out.println("Ingrese el tipo de documento del propietario");
        String docType = SetOwnerDocType.getDocType();
        System.out.println("Ingrese el nombre del propietario");
        String name = sc.next();
        System.out.println("Ingrese el apellido del propietario");
        String lastName = sc.next();
        System.out.println("Ingrese el telefono del propietario");
        String phone = sc.next();
        System.out.println("Ingrese el email del propietario");
        String email = sc.next();
        System.out.println("Ingrese la direccion del propietario");
        String address = sc.next();
        System.out.println("Ingrese la contraseña del propietario");
        String password = sc.next();
        System.out.println("Ingrese la fecha de nacimiento del propietario (formato: yyyy-MM-dd)");
        Date birthDate = getBirthDateFromInput();
        System.out.println("Ingrese el tipo de propietario: 1. Direct Owner, 2. Property Manager, 3. Real Estate Agency");
        String ownerType = SetOwnerType.getOwnerType();

        propertyOwnerServiceImpl.createPropertyOwner(id, docType, name, lastName, phone, email, address, password, birthDate, ownerType);

    }

    // Metodos Helper , luego se convertiran en metodos de la clase service para que sean llamados desde el controller

    public Date getBirthDateFromInput() {
        System.out.println("Ingrese la fecha de nacimiento del propietario (formato: yyyy-MM-dd): ");
        String birthDateString = sc.next();
        Date birthDate = null;
        try {
            birthDate = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(birthDateString);
        } catch (java.text.ParseException e) {
            System.out.println("Formato de fecha inválido. Por favor, ingrese la fecha en el formato correcto.");
        }
        return birthDate;
    }






}
