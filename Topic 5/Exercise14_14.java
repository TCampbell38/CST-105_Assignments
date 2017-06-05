import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;


public class Exercise14_14 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Rectanguloid");
		Pane pane = new Pane();
		
		Rectangle r1 = new Rectangle(10, 10, 100, 100);
		pane.getChildren().add(r1);
		r1.setFill(Color.TRANSPARENT);
		r1.setStroke(Color.BLACK);
		
		
		Rectangle r2 = new Rectangle(40, 40, 100, 100);
		pane.getChildren().add(r2);
		r2.setFill(Color.TRANSPARENT);
		r2.setStroke(Color.BLACK);
		
		//Top left of R1 to top left of R2
		Line l1 = new Line(10, 10, 40, 40);
		pane.getChildren().add(l1);
		
		//Bottom right of R1 to bottom right of R2
		Line l2 = new Line(110, 110, 140, 140);
		pane.getChildren().add(l2);
		
		//Top right of R1 to top right of R2
		Line l3 = new Line(110, 10, 140, 40);
		pane.getChildren().add(l3);
		
		//Bottom left of R1 to bottom left of R2
		Line l4 = new Line(10, 110, 40, 140);
		pane.getChildren().add(l4);
		
		Scene scene = new Scene(pane, 450, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
