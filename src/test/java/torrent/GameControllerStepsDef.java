package torrent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GameControllerStepsDef {
    Game game;

    @Given("the game is not started")
    public void initialGameState() {
        game = new Game();
    }

    @When("we start the game")
    public void initializeGame() {
        game.init();
    }

    @Then("the game will have map")
    public void validateMap(){
        assertNotNull(game.getGameMap());
    }

    @And("the map will have 9 tiles")
    public void validateTiles(){
        assertEquals(game.getState().getTiles(), 9);
    }

    @And("the game will have a player")
    public void validatePlayer() {
        assertNotNull(game.getPlayer());
    }

    @And("the player will be on tile 1")
    public void validatePlayerLocation() {
        assertEquals(game.getState().getPlayerPosition(), 1);
    }


}
