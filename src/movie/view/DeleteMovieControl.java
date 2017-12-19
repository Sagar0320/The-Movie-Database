package movie.view;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import movie.Main;
import movie.model.MovieModel;
import movie.model.SqliteConnection;


public class DeleteMovieControl extends AnchorPane implements Initializable
{
	
	Connection connection;
	
	@FXML
    private Button backBT;
	@FXML
	private ChoiceBox deleteMovieCB;	
	@FXML
 	private Label isConnected;
  	
  	public MovieModel mm = new MovieModel();
 	
  	
  	public DeleteMovieControl()
 	{
 		connection = SqliteConnection.Connector();
		if(connection == null) System.exit(1);
 	}
 	
 	public void initialize(URL location, ResourceBundle resources)
 	{
 		if(mm.isDbConnected())
 		{
 			isConnected.setText("Connected");
 		}else
 		{
 			isConnected.setText("Not Connected");
 		}
 		
 	}
	
	
	@FXML
   	public void loadPrevPage()
   	{
   		//System.out.println("Button clicked");
   		try {
   		
   			Stage primaryStage;
   			
   			primaryStage = (Stage)backBT.getScene().getWindow();
   			
   			FXMLLoader loader = new FXMLLoader();    //check file name here
   			loader.setLocation(Main.class.getResource("view/AdminHome.fxml"));
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