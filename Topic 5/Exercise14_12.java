import javafx.application.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.scene.shape.*;
import javafx.geometry.*; 
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.text.*;

public class Exercise14_12 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		
		primaryStage.setTitle("Bar graph");
		Pane pane = new Pane();
		pane.setPadding(new Insets(10, 10, 10, 10));
		
		Rectangle projects = new Rectangle(10, 140, 80, 40);
		projects.setFill(Color.RED);
		pane.getChildren().add(projects);
		pane.getChildren().add(new Text(10, 130, "Projects (20%)"));
		
		Rectangle quizzes = new Rectangle(100, 160, 100, 20);
		quizzes.setFill(Color.BLUE);
		pane.getChildren().add(quizzes);
		pane.getChildren().add(new Text(110, 150, "Quizzes (10%)"));
		
		Rectangle midterms = new Rectangle(210, 120, 100, 60);
		midterms.setFill(Color.GREEN);
		pane.getChildren().add(midterms);
		pane.getChildren().add(new Text(220, 110, "Midterms (30%)"));
		
		Rectangle finals = new Rectangle(320, 100, 100, 80);
		finals.setFill(Color.ORANGE);
		pane.getChildren().add(finals);
		pane.getChildren().add(new Text(330, 90, "Finals (40%)"));
		
		Scene scene = new Scene(pane, 450, 200);
		primaryStage.setTitle("Exercise 14.12");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args){
		launch(args);
	}

}
