package com.example.gestionInventaire.categorie;

import com.example.gestionInventaire.categorie.modele.Categorie;
import com.example.gestionInventaire.categorie.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {
    private CategorieRepository repository;

    @Autowired
    public CategorieService(CategorieRepository repository) {
        this.repository = repository;
    }

    public Categorie ajouterCategorie(Categorie c) {
        return repository.save(c);
    }
}
