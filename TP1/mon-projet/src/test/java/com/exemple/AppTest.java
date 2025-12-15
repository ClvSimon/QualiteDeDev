package com.exemple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * Unit test for GameOfLife.
 */
public class AppTest {

    @Test
    void testGridInitialization() {
        int width = 5;
        int height = 4;
        GameOfLife game = new GameOfLife(width, height);

        // Vérifie que la grille est bien créée
        assertNotNull(game.grid, "La grille ne doit pas être null");

        // Vérifie la hauteur de la grille
        assertEquals(height, game.grid.length, "La hauteur de la grille est incorrecte");

        // Vérifie la largeur de la grille
        assertEquals(width, game.grid[0].length, "La largeur de la grille est incorrecte");
    }
}
