package com.exemple;

public class GameOfLife {
    int[][] grid;
    int x;
    int y;

    /**
     * Constructeur qui initialise la grille du jeu avec les dimensions x et y
     * @param x largeur de la grille
     * @param y hauteur de la grille
     */
    public GameOfLife(int x, int y) {
        this.x = x;           // on stocke la largeur
        this.y = y;           // on stocke la hauteur
        grid = new int[y][x]; // instanciation du tableau
    }
}
