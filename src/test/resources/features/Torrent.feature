Feature: Test Game Controller
	Scenario: Test game start
        Given the game is not started
        When we start the game 
        Then the game will have map 
        and the map will have 9 tiles
        and the game will have a player
        and the player will have 3 health
        and the player will be on tile 1
        and the player will have a sword
        and the player will have a shield
        and the player will have 0 food
        and the player will have 0 treasure
        and the game will have an enemy
        and the enemy will be on tile 9
        and the enemy will have 3 health
        and the player has initiative

