package com.yasvand.firstspringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yasvand.firstspringboot.entity.LocalTour;


@Repository
public interface LocalTourRepository extends JpaRepository<LocalTour, Long>{

}
