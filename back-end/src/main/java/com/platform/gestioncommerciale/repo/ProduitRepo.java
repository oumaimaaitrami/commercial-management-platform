package com.platform.gestioncommerciale.repo;

import com.platform.gestioncommerciale.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepo extends JpaRepository<Produit,Long> {
}
