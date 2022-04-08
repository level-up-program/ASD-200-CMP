package torrent;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
    private Game game = null;
    @BeforeEach
    public void setUp(){
        game = new Game();
    }

    @Test
    public void createMapTest(){
        //Given that we have a game object
        //When we initialize the game
        game.init();
        //Then the map object will not be null
        assertNotNull(game.getGameMap());
    }

    @Test
    public void testGameStateHasNineTiles()
    {
      //Given that we have a game object
        //When we initialize the game
        game.init();
        //And we get the game state
        GameState gameState = game.getState();
        //Then We have 9 tiles
        assertEquals(9, gameState.getTiles());
    }
}
