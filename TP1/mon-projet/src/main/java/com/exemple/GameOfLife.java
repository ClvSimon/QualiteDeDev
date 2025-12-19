package com.exemple;

public class GameOfLife {
    int[][] grid;
    int x;
    int y;

    public GameOfLife(int x, int y) {
        this.x = x;
        this.y = y;
        grid = new int[y][x];
    }

    /**
     * Met une cellule vivante à la position (x, y)
     */
    public void CreerCellule(int x, int y) {
        if (x >= 0 && x < this.x && y >= 0 && y < this.y) {
            grid[y][x] = 1;
        }
    }

    /**
     * Vérifie si une cellule est vivante
     */
    public boolean CelluleVivante(int x, int y) {
        if (x >= 0 && x < this.x && y >= 0 && y < this.y) {
            return grid[y][x] == 1;
        }
        return false;
    }


    /**
     * Compte le nombre de voisins vivants autour de la cellule (x, y)
     */
    public int NombreVoisins(int x, int y) {
        int count = 0;
        for (int i = y - 1; i <= y + 1; i++) {
            for (int j = x - 1; j <= x + 1; j++) {
                // Ignore la cellule elle-même
                if (i == y && j == x) continue;
                // Vérifie les limites de la grille
                if (i >= 0 && i < this.y && j >= 0 && j < this.x) {
                    count += grid[i][j];
                }
            }
        }
        return count;
    }


    /**
     * Calcule la prochaine génération en appliquant les règles de survie et de mort par solitude
     */
    public void Evolution() {
        int[][] newGrid = new int[y][x];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                int voisins = NombreVoisins(j, i);

                if (grid[i][j] == 1) { // cellule vivante
                    // Survie : 2 ou 3 voisins vivants
                    if (voisins == 2 || voisins == 3) {
                        newGrid[i][j] = 1;
                    }
                    // Mort par solitude : moins de 2 voisins
                    // Mort par surpopulation : plus de 3 voisins
                    // Ici, on ne met rien, donc la cellule devient 0
                }
                // Les cellules mortes restent 0 pour l'instant
            }
        }

        grid = newGrid;
    }



}
