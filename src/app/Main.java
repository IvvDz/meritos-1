package app;
import domain.*;
public class Main{
    public static void main(String[] args) {
        //El primer parámetro del constructor es el título y, el
        //segundo, el índice de impacto.
        Article article1 = new Article("El gran invento",1.367);
        Article article2 = new Article("Lo nunca visto",2.765);
        Article article3 = new Article("Pasen y vean",1.987);
        Article article4 = new Article("El no va más del " +"qué se yo", 2.134);
        //El primer parámetro del constructor es el título y, el
        //segundo, la financiación con la que ha contado el//project.
        Project project1 = new Project("El puente de " +"Villar del Río",1000000);
        Project project2 = new Project("El acueducto de " +"Villar del Campo",2000000);
        Project project3 = new Project("El sistema de " +"información de " +"Villar del Río",1200000);
        Titular t1 = new Titular();
        //Se añaden al profesor los artículos que ha publicado.
        t1.addMerit(article1);
        t1.addMerit(article2);
        //Se añade al profesor el project en que ha
        //participado.
        t1.addMerit(project1);
        //Se procede con el catedrático de forma análoga a como
        //se ha procedido con el profesor titular.
        Cathedratic ct1 = new Cathedratic();
        ct1.addMerit(article3);
        ct1.addMerit(article4);
        ct1.addMerit(project2);
        ct1.addMerit(project3);
        //Se muestra la valoración tanto del profesor titular
        //como del catedrático
        System.out.println("La valoración de profesor titular "+ "t1 es " +t1.calculateValoration());
        System.out.println("La valoración del catedrático ct1es "+ ct1.calculateValoration());
    }
}