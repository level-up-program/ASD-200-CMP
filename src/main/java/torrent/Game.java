package torrent;


public class Game {
    private GameMap gameMap = null;

    public void init(){
        gameMap = new GameMap();
    }

    public GameMap getGameMap(){
        return this.gameMap;
    }

    public Player getPlayer(){
        return null;
    }

    public GameState getState(){
        return null;
    }

    
}
