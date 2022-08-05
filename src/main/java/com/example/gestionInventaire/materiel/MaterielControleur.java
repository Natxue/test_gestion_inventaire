package com.example.gestionInventaire.materiel;

import com.example.gestionInventaire.materiel.modele.Materiel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "gestion/materiel")
public class MaterielControleur {
    private MaterielService service;

    @Autowired
    public MaterielControleur (MaterielService materielService){
        this.service = materielService;
    }

    @PostMapping("/create")
    public ResponseEntity<Materiel> creation(@RequestBody Materiel m){
        Materiel newMat = service.creerMateriel(m);
        return new ResponseEntity<>(newMat, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Materiel> modification(@RequestBody Materiel m){
        Materiel updMat = service.modifierMateriel(m);
        return new ResponseEntity<>(updMat, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> suppression(@PathVariable("id") int id){
        service.supprimerMateriel(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
