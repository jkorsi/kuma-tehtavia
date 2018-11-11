/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemodel;

/**
 *
 * @author Juho Suni
 */
public class GameEngine {

    private Pokemon pokemon;

    public GameEngine() {
        setPokemonState(new Charmander());
    }

    public final void setPokemonState(Pokemon pokemon) {
        this.pokemon = pokemon;
        pokemon.setEngine(this);
    }

    public String getPokemonState() {
        return pokemon.toString();
    }

    public void attack() {
        pokemon.attack();
    }

    public void move() {
        pokemon.move();
    }

    public void jump() {
        pokemon.jump();
    }

}
