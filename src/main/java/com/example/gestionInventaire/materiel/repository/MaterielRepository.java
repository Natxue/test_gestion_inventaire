package com.example.gestionInventaire.materiel.repository;

import com.example.gestionInventaire.materiel.modele.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MaterielRepository extends JpaRepository<Materiel, Integer> {

    public Optional<Materiel> findMaterielById(int id);

}
