package com.aorihuela.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{
    private String nombreProfesional;
    private String profesion;
    private List<String> experiencias;
    
    public Curriculo(String nombreProfesional, String profesion,  String contenido) {
        super(contenido);
        this.nombreProfesional = nombreProfesional;
        this.profesion = profesion;
        this.experiencias = new ArrayList<>();
    }

    public Curriculo addExperiencias(String exp){
        this.experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
            sb.append(this.nombreProfesional).append("\n")
                    .append("Resumen: ").append(this.contenido)
                    .append("\nProfesion: ").append(this.profesion)
                    .append("\nExperiencias: \n");
            for(String exp: this.experiencias){
                sb.append("* ").append(exp).append("\n");
            }
        return sb.toString();
    }
}
