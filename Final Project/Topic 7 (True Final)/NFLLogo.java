import javafx.application.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.stage.*;

public class NFLLogo extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		Rectangle rec1 = new Rectangle(40, 95, 10, 50);
		Rectangle rec2 = new Rectangle(60, 95, 10, 50);
		Rectangle rec3 = new Rectangle(80, 95, 10, 50);
		Rectangle rec4 = new Rectangle(100, 95, 10, 50);
		Rectangle rec5 = new Rectangle(120, 95, 10, 50);
		Rectangle rec6 = new Rectangle(140, 95, 10, 50);
		Rectangle rec7 = new Rectangle(28, 115, 140, 10);
		Ellipse ellipse1 = new Ellipse(98, 125, 100, 50);
		Rectangle recMain = new Rectangle(35, 105, 125, 30);
		
		Text logoName = new Text(36, 125, "NFLDraft 2038");
		logoName.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		
		rec1.setFill(Color.WHITE);
		rec1.setStroke(Color.BLACK);
		rec2.setFill(Color.WHITE);
		rec2.setStroke(Color.BLACK);
		rec3.setFill(Color.WHITE);
		rec3.setStroke(Color.BLACK);
		rec4.setFill(Color.WHITE);
		rec4.setStroke(Color.BLACK);
		rec5.setFill(Color.WHITE);
		rec5.setStroke(Color.BLACK);
		rec6.setFill(Color.WHITE);
		rec6.setStroke(Color.BLACK);
		rec7.setFill(Color.WHITE);
		rec7.setStroke(Color.BLACK);
		ellipse1.setFill(Color.BROWN);
		ellipse1.setStroke(Color.BLACK);
		recMain.setFill(Color.GOLD);
		recMain.setStroke(Color.BLACK);
		
		pane.getChildren().addAll(ellipse1, rec1, rec2, rec3, rec4, rec5, rec6, rec7, recMain, logoName);
		
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("NFL draft logo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main (String[] args) {
		launch(args);
	}
	
}