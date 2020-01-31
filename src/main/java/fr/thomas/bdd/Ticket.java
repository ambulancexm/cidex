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

/**
 *
 * @author bulleux
 */
@Entity
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_ticket")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTicket;
    
    @Column(name = "quantite_ha")
    private int quantiteHa;

    public Ticket() {
    }

    public Ticket(int quantiteHa) {
        this.quantiteHa = quantiteHa;
    }

    public Ticket(Long idTicket, int quantiteHa) {
        this.idTicket = idTicket;
        this.quantiteHa = quantiteHa;
    }
    
    

    public Long getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Long idTicket) {
        this.idTicket = idTicket;
    }

    public int getQuantiteHa() {
        return quantiteHa;
    }

    public void setQuantiteHa(int quantiteHa) {
        this.quantiteHa = quantiteHa;
    }

    @Override
    public String toString() {
        return "Ticket{" + "idTicket=" + idTicket + ", quantiteHa=" + quantiteHa + '}';
    }

    

    
    
}
