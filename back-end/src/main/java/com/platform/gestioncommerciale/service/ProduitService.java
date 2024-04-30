package com.platform.gestioncommerciale.service;

import com.platform.gestioncommerciale.model.Produit;
import com.platform.gestioncommerciale.repo.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
@Service
public class ProduitService {

    @Autowired

    private ProduitRepo produitRepo;

    public List<Produit> getAllProduits() {
        return produitRepo.findAll();
    }

    public Optional<Produit> getProduitById (Long id) {
        return produitRepo.findById(id);
    }

    public Produit addOrUpdateProduit(Produit produit) { return  produitRepo.save(produit);}

    public void deleteProduit(Long id) {
        produitRepo.deleteById(id);
    }


}
