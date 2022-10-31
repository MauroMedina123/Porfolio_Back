package com.ArgProg.PorfolioBack.repository;

import com.ArgProg.PorfolioBack.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Long>{
    
}
