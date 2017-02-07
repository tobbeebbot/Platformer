import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Tobbe on 2017-02-07.
 */
public class Map {
    private int tileSize;
    private int width;
    private int height;
    int[][] tiles;

    public Map(int width, int height, int tileSize){
        this.width = width;
        this.height = height;
        this.tileSize = tileSize;
        tiles = new int[width][height];

        tiles = new int[][] {
                {1, 0, 1, 0, 1},
                {1, 1, 1, 1, 1}
        };
    }

    public List<ImageView> views() {
        List<ImageView> views = new ArrayList<>();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (tiles[y][x] == 1) {
                    ImageView view = new  ImageView(new Image("grass.jpg"));
                    view.relocate(x * tileSize, y * tileSize);
                    view.setFitWidth(tileSize);
                    view.setFitHeight(tileSize);
                    views.add(view);
                }
                else {// Do nothing}
                }
            }

        }
        return views;
    }
}
