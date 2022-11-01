package com.ArgProg.PorfolioBack.repository;

import com.ArgProg.PorfolioBack.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepo extends JpaRepository<Skills, Long>{
    
}
