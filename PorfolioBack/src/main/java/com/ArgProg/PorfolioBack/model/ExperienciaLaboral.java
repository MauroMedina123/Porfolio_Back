package com.ArgProg.PorfolioBack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class ExperienciaLaboral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String tituloExp;
    private int fechaExp;
    private String descExp;
    private String logoExp;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long idExp, String tituloExp, int fechaExp, String descExp, String logoExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descExp = descExp;
        this.logoExp = logoExp;
    }
    
    
}
