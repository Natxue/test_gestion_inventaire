package com.example.gestionInventaire.categorie.repository;

import com.example.gestionInventaire.categorie.modele.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
}
