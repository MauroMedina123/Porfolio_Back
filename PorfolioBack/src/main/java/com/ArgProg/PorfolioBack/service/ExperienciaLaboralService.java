package com.ArgProg.PorfolioBack.service;

import com.ArgProg.PorfolioBack.model.ExperienciaLaboral;
import com.ArgProg.PorfolioBack.repository.ExperienciaLaboralRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaLaboralService {
    
    private final ExperienciaLaboralRepo experienciaLaboralRepo;
    
    @Autowired
    public ExperienciaLaboralService(ExperienciaLaboralRepo experienciaLaboralRepo){
        this.experienciaLaboralRepo = experienciaLaboralRepo;
    }
    
    public ExperienciaLaboral addExperiencia(ExperienciaLaboral experienciaLaboral){
        return experienciaLaboralRepo.save(experienciaLaboral);
    }
    
    public List<ExperienciaLaboral> buscarExperiencias(){
        return experienciaLaboralRepo.findAll();
    }
    
    public ExperienciaLaboral editarExperiencia(ExperienciaLaboral experienciaLaboral){
        return experienciaLaboralRepo.save(experienciaLaboral);
    }
    
    public void borrarExperiencia(Long id){
        experienciaLaboralRepo.deleteById(id);
    }
    
}
