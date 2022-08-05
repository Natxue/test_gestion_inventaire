package com.example.gestionInventaire.categorie;

import com.example.gestionInventaire.categorie.modele.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "gestion/categorie")
public class CategorieControleur {
    private CategorieService service;

    @Autowired
    public CategorieControleur(CategorieService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<Categorie> ajout(@RequestBody Categorie c){
        Categorie newCategorie = service.ajouterCategorie(c);
        return new ResponseEntity<>(newCategorie, HttpStatus.CREATED);
    }
}
