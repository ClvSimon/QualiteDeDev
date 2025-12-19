package com.exemple;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testCreerCellule() {
        GameOfLife game = new GameOfLife(5, 4);

        // Mettre une cellule vivante en (2,3)
        game.CreerCellule(2, 3);

        // Vérifie que la cellule est vivante
        assertTrue(game.CelluleVivante(2, 3), "La cellule en (2,3) doit être vivante");

        // Vérifie que d'autres cellules sont mortes
        assertFalse(game.CelluleVivante(0, 0), "La cellule en (0,0) doit être morte");
        assertFalse(game.CelluleVivante(4, 3), "La cellule en (4,3) doit être morte");
    }

    @Test
    void testRegleSurvie() {
        GameOfLife game = new GameOfLife(3, 3);

        // Placer une cellule vivante avec 2 voisins vivants
        game.CreerCellule(0, 0);
        game.CreerCellule(0, 1);
        game.CreerCellule(1, 0);

        // Applique la règle de survie
        game.Evolution();

        // La cellule (0,0) doit survivre
        assertTrue(game.CelluleVivante(0, 0), "La cellule (0,0) doit survivre avec 2 voisins");

        // Vérifie que les autres cellules vivantes restent vivantes si elles ont 2 ou 3 voisins
        assertTrue(game.CelluleVivante(0, 1), "La cellule (0,1) doit survivre");
        assertTrue(game.CelluleVivante(1, 0), "La cellule (1,0) doit survivre");
    }

    @Test
    void testMortParSolitude() {
        GameOfLife game = new GameOfLife(3, 3);

        // Placer une cellule vivante seule
        game.CreerCellule(1, 1);

        // Applique l'évolution
        game.Evolution();

        // La cellule isolée doit mourir
        assertFalse(game.CelluleVivante(1, 1), "La cellule (1,1) doit mourir par solitude");

        // Cas avec une cellule vivante et un seul voisin
        game.CreerCellule(0, 0);
        game.CreerCellule(0, 1);

        game.Evolution();

        // Les cellules doivent mourir car elles ont moins de 2 voisins
        assertFalse(game.CelluleVivante(0, 0), "La cellule (0,0) doit mourir par solitude");
        assertFalse(game.CelluleVivante(0,1), "La cellule (0,1) doit mourir par solitude");
    }

}
