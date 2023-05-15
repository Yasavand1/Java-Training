package com.deeps;



import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class MenuRepo implements PanacheRepository<Menu>{

}
