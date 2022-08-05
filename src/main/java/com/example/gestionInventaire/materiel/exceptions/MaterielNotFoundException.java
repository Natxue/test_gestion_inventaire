package com.example.gestionInventaire.materiel.exceptions;

public class MaterielNotFoundException extends RuntimeException {

    public MaterielNotFoundException(String message) {
        super(message);
    }
}
