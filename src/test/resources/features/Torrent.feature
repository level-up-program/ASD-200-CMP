Feature: Test Game Controller
     Scenario: Test game start
        Given the game is not started
        When we start the game 
        Then the game will have map 
        And the map will have 9 tiles
        And the game will have a player
        And the player will be on tile 1
        
