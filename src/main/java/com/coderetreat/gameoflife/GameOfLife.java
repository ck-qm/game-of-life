package com.coderetreat.gameoflife;

/**
 * Conway's Game of Life
 * 
 * The Game of Life is a cellular automaton devised by mathematician John Conway.
 * It consists of a grid of cells which evolve through discrete time steps
 * according to the following rules:
 * 
 * 1. Any live cell with fewer than two live neighbors dies (underpopulation)
 * 2. Any live cell with two or three live neighbors lives on to the next generation
 * 3. Any live cell with more than three live neighbors dies (overpopulation)
 * 4. Any dead cell with exactly three live neighbors becomes a live cell (reproduction)
 */
public class GameOfLife {

    public static void main(String[] args) {
        System.out.println("Game of Life - Code Retreat");
        System.out.println("Start implementing using Test-Driven Development!");
    }
}
