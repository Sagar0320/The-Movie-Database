package movie.view;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import movie.Main;

public class FirstScreenControl extends AnchorPane
{
	
	@FXML
	private Button userBT;
	@FXML
	private Button adminBT;
	
	@FXML
	public void loadNewUserPage()
	{
		
		try {
		
			Stage primaryStage;
			
			primaryStage = (Stage)userBT.getScene().getWindow();
			
			FXMLLoader loader = new FXMLLoader();    //check file name here
			loader.setLocation(Main.class.getResource("view/UserMovieList2.fxml"));
			AnchorPane rootLayout = (AnchorPane) loader.load();
			
			 
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			} 
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}
	
	@FXML
	public void loadNewAdminPage()
	{
		//System.out.println("Button clicked");
		try {
		
			Stage primaryStage;
			
			primaryStage = (Stage)adminBT.getScene().getWindow();
			
			FXMLLoader loader = new FXMLLoader();    //check file name here
			loader.setLocation(Main.class.getResource("view/adminLogin.fxml"));
			AnchorPane rootLayout = (AnchorPane) loader.load();
			
			 // Show the scene containing the root layout.	
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			} 
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}
	
	
	
	
	
	
}