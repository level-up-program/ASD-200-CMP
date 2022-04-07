Feature: Test Game Controller
	Scenario: Test game start
        Given the game is in a <game> state
        and the map is in the <map> state
        and the tiles are in the <tiles> state
        and the player is in the <player> state
        and the player-pos is in the <player-pos> state
        and the msg is in the <msg> state
        and the health is in the <health> state
        and the food is in the <food> state
        and the treasure is in the <treasure> state
        and the enemy is in the <enemy> state
        and the enemy-pos in in the <enemy-pos> state
        and the initiative is in the <initiative> state
        When we run the init method
        Then the game result will be <game-result>
        and the map result will be <map-result>
        and the tiles result will be <tiles-result>
        and the player result will be <player-result>
        and the player position result will be <-pos-result>
        and the msg result will be <msg-result>
        and the health result will be <health-result>
        and the food result will be <food-result>
        and the treasure result will be <treasure-result>
        and the enemy result will be <enemy-result>
        and the enemy pos result will be <enemy-pos-result>
        and the initiative result will be <initiative-result>
    
    Examples:
    | game    | map | tiles | player | player-pos | msg | health | food | treasure | enemy | enemy-pos | initiative | game-result | map-result | tiles-result | player-result | player-pos-result | msg-result | health-result | food-result | treasure-result | enemy-result | enemy-pos-result | initiative-result |
    | waiting | dne | dne   |  dne   | dne        | dne | dne    | dne  | dne      | dne   | dne       | dne        | started     | 1          | 9            | Fred          | 1                 | success    | 3             | 0           | 0               | 1            | 9                | player            | 
