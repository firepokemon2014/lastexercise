/**
 * Anna Staib
 * CSC 144
 * December 14, 2021
 * Spoonful
 */
package edu.cornellcollege.lastexercise;


public class Spoonful {
    
    public static final int TEASPOONS_IN_A_TABLESPOON = 3;
    
    private int tablespoons;
    private int teaspoons;
    
    
    public Spoonful( int tablespoons, int teaspoons){
        this.tablespoons = tablespoons;
        this.teaspoons = teaspoons;
    }
    
     public Spoonful add(Spoonful other) {
        int totalTablespoons = this.tablespoons + other.tablespoons;
        int totalTeaspoons = this.teaspoons + other.teaspoons;
        
        int ta = totalTablespoons + totalTeaspoons / TEASPOONS_IN_A_TABLESPOON;
        int te = totalTeaspoons % TEASPOONS_IN_A_TABLESPOON;
        
        return new Spoonful(ta,te);
    }
    
     
     
    @Override
    public String toString(){
        return this.tablespoons + " tablespoons, " + this.teaspoons + " teaspoons";
    }
     
     
}
