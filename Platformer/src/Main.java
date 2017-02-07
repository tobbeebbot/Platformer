/**
 * Created by Tobbe on 2017-02-07.
 */

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Platformer");

        ImageView view = new ImageView(new Image("grass.jpg"));
        view.setFitHeight(10);
        view.setFitWidth(10);
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {

                if (view.getX() < 400) view.setX(view.getX() + 1);

                fpsCounter.calculate(now);
            }
        };
        Map map = new Map(5, 2, 30);

        Pane root = new Pane();

        root.getChildren().addAll(map.views());
        root.getChildren().add(view);

        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
        timer.start();
    }
}

