/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.thomas.main;

import fr.thomas.bdd.Article;
import fr.thomas.bdd.Ticket;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import sun.rmi.runtime.Log;

/**
 *
 * @author bulleux
 */
public class main {

    public static final String PU = "pu";

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU);
        EntityManager em = emf.createEntityManager();
        
//        Article article = new Article("testArticle2", "1234567890", 4);
//        Article article1 = new Article("testArticle", "1234567", 4);
//        Ticket ticket = new Ticket(8);
//        System.out.println("test_article" + article.toString());
//        
//        
//        em.getTransaction().begin();
//        em.persist(article);
//        em.persist(article1);
//        em.persist(ticket);
//        
//        em.getTransaction().commit();
        
        
        emf.close();

    }
}
