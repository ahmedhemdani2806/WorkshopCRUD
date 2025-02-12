package test;

import entite.Personne;
import service.PersonneService;
import utile.Datasource;

public class Main {
    public static void main(String[] args) {
        Personne p = new Personne("test", "3A14");
        PersonneService ps = new PersonneService();
        ps.insert(p);
       // ps.delete(p); 
        //ps.getAll().forEach(System.out::println);
       // int idRecherche = 2; // Remplacez par l'ID d'une personne existante
       // Personne personneUpdate = ps.readById(idRecherche);
       // ps.update(personneUpdate);
       // personneUpdate.setNom("Updated");
        //personneUpdate.setPrenom("Person");
        //ps.update(personneUpdate);
       // Personne p2 = new Personne("fasa5", "fasa5");
        //ps.insert(p2);
        //Personne personneDelete = ps.readById(4);
        //ps.update(personneDelete);
        //ps.delete(personneDelete);
    }
}