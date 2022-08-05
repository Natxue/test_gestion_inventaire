package com.example.gestionInventaire.materiel;

import com.example.gestionInventaire.materiel.exceptions.MaterielNotFoundException;
import com.example.gestionInventaire.materiel.modele.Materiel;
import com.example.gestionInventaire.materiel.repository.MaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MaterielService {
    private MaterielRepository repository;

    @Autowired
    public MaterielService (MaterielRepository materielRepository){
        this.repository = materielRepository;
    }

    public Materiel creerMateriel(Materiel materiel) {
        return this.repository.save(materiel);
    }


    public Materiel modifierMateriel(Materiel materiel) {
        if(repository.findMaterielById(materiel.getId()).isPresent()){
            return this.repository.save(materiel);
        }
        else throw new MaterielNotFoundException("Ce matériel n'existe pas");
    }

    public void supprimerMateriel(int id) {
        this.repository.deleteById(id);
    }
}
