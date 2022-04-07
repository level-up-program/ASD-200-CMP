package torrent;

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
        assertNotNull(game.getMap());
    }

    @And("the map will have 9 tiles")
    public void validateTiles(){
        assertEquals(game.getState().getTiles().length, 9);
    }

    @And("the game will have a player")
    public void validatePlayer() {
        assertNotNull(game.getPlayer());
    }

    @And("player will have 3 health")
    public void validatePlayerHealth(){
        assertEquals(game.getState().getPlayerHealth(), 3);
    }

    @And("the player will be on tile 1")
    public void validatePlayerLocation() {
        assertEquals(game.getState().getPlayerPosition(), 1);
    }

    @And("the player will have a sword")
    public void validatePlayerWeapon(){
        assertTrue(game.getPlayer().getInventory().contains(new Sword()));
    }

    @And("the player will have a shield")
    public void validatePlayerShield(){
        assertTrue(game.getPlayer().getInventory().contains(new Shield()));
    }

    @And("the player will have 0 food")
    public void validatePlayerFood(){
        assertEquals(game.getState().getFood(), 0);
    }

    @And("the player will have 0 treasure")
    public void validatePlayerTreasure() {
        assertEquals(game.getState().getTreasure(), 0);
    }

    @And("the game will have an enemy")
    public void validateEnemyExists(){
        assertNotNull(game.getEnemy());
    }

    @And("the enemy will be on tile 9")
    public void validateEnemyPosition(){
        assertEquals(game.getState().getEnemyPosition(), 9);
    }

    @And("the enemy will have 3 health")
    public void validateEnemyHealth(){
        assertEquals(game.getState().getEnemyHealth(), 3);
    }

    @And("the player has initiative")
    public void validateGameInitiative(){
        assertTrue(game.getState().getInitiative());
    }


}
