package torrent;

import java.util.List;
import java.util.ArrayList;

public class GameMap {
    private List<Tile> tiles = null;

    public void init() {
        tiles = new ArrayList<Tile>();
    }

    public List<Tile> getTiles() {
        return this.tiles;
    }
}
