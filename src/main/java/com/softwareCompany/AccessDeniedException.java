package com.softwareCompany;

public class AccessDeniedException extends Exception {
    public AccessDeniedException(String message){
        super(message);
        System.out.println("Acceso Denegado desde la clase");
    }
}
