package torrent;


public class Game {
    private GameMap gameMap = null;
    private GameState gameState = null;

    public void init(){
        gameMap = new GameMap();
        gameState = new GameState();
        gameMap.init();
    }

    public GameMap getGameMap(){
        return this.gameMap;
    }

    public Player getPlayer(){
        return null;
    }

    public GameState getState(){

        this.gameState.setTiles(this.gameMap.getTiles().size());

        return this.gameState;
    }

    
}
