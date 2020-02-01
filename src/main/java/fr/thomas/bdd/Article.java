/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.thomas.bdd;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * 
 * @author bulleux
 */
@Entity

public class Article implements Serializable{
    
    @Id
    @Column(name = "id_article")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idArticle;
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "code_barre")
    private String codeBarre;
    
    @Column(name = "quantite")
    private int quantite;

    public Article() {
    }

    public Article(String nom, String codeBarre, int quantite) {
        this.nom = nom;
        this.codeBarre = codeBarre;
        this.quantite = quantite;
    }

    public Article(long id_article, String nom, String codeBarre, int quantite) {
        this.idArticle = id_article;
        this.nom = nom;
        this.codeBarre = codeBarre;
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Article{" + "id_article=" 
                + idArticle + ", nom=" 
                + nom + ", codeBarre="
                + codeBarre + ", quantite=" 
                + quantite + '}';
    }
    
    

    public long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(long idArticle) {
        this.idArticle = idArticle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeBarre() {
        return codeBarre;
    }

    public void setCodeBarre(String codeBarre) {
        this.codeBarre = codeBarre;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    
}
