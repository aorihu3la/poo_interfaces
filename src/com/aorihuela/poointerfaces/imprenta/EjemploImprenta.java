package com.aorihuela.poointerfaces.imprenta;

import com.aorihuela.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Alvaro O", "Ingeniero",
                "Resumen hoja de vida");
        cv.addExperiencias("Java");
        cv.addExperiencias("C+");
        cv.addExperiencias("PHP");
        cv.addExperiencias("Angular");

        Libro libro = new Libro("Progrmacion operativa", "Alvaro", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron observador"))
                .addPagina(new Pagina("Patron MVC"))
                .addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron del mal"));

        Informe informe = new Informe("Al Orihuela", "Claudia Alarcon",
                "Siendo las 21:30 se despierta a la gata");

        imprimir(cv);
        imprimir(informe);
//        imprimir(libro); // Manda error por que imprimir se usa para objetos descendientes de Hoja
        imprimir(libro);
    }

//    public static void imprimir(Hoja imprimible){
//        System.out.println(imprimible.imprimir() );
//    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir() );
    }
}
