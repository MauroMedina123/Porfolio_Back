package com.ArgProg.PorfolioBack.repository;

import com.ArgProg.PorfolioBack.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepo extends JpaRepository<ExperienciaLaboral, Long>{
    
}
