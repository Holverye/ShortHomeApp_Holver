package app.view;

import app.service.PropertyOwnerService;

import java.util.Scanner;

public class PropertyView {

    Scanner sc = new Scanner(System.in);

    private final PropertyOwnerService propertyOwnerService;

    PropertyView(PropertyOwnerService propertyOwnerService){
        this.propertyOwnerService = propertyOwnerService;
    }


    public void createProperty(){

        System.out.println("Ingrese el id de la propiedad: ");




    }

    public void selectPropertyById(int id){

    }

    public void selectAllProperties(){

    }

    public void updateProperty(){

    }

    public void deleteProperty(int id){

    }
}
