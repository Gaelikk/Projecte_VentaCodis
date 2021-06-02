package model.Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {

    private EntityManager em;
    private EntityManagerFactory emf;

    public Connection() {
        emf = Persistence.createEntityManagerFactory("app");
        //em = emf.createEntityManager();

    }

    public EntityManager getConnection() {
        return this.emf.createEntityManager();
    }
}
