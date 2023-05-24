package com.hdfc.data.poc.data.migration.postgres.repository;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Configurable
@Repository
public class GenericPostgresRepository {

    static EntityManager entityManager;

    @PersistenceContext(unitName = "postgresEntityManagerFactory")
    public void injectEntityManger(EntityManager entityManager){
        GenericPostgresRepository.entityManager =entityManager;
    }

    public static <T> List<T> fetchData(String tableName){
        StringBuilder sb = new StringBuilder(" from ");
        return getEntityManager().createQuery(sb.append(tableName).toString()).getResultList();
    }

    public static EntityManager getEntityManager(){
        EntityManager em = new GenericPostgresRepository().entityManager;
        return em;
    }
}
