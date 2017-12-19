package movie.view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import movie.Main;

public class AdminHomeControl extends AnchorPane
{
	@FXML
	private Button addMovieBT;
	@FXML
	private Button updateDeleteMovieBT;

	@FXML
    private Button backBT;
	
	@FXML
	public void loadAddMoviePage()
	{
		//System.out.println("Button clicked");
		try {
		
			Stage primaryStage;
			
			primaryStage = (Stage)addMovieBT.getScene().getWindow();
			
			FXMLLoader loader = new FXMLLoader();    //check file name here
			loader.setLocation(Main.class.getResource("view/AddMoviePage1.fxml"));
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
	
	@FXML
	public void loadUpdateDeleteMoviePage()
	{
		//System.out.println("Button clicked");
		try {
		
			Stage primaryStage;
			
			primaryStage = (Stage)updateDeleteMovieBT.getScene().getWindow();
			
			FXMLLoader loader = new FXMLLoader();    //check file name here
			loader.setLocation(Main.class.getResource("view/UpdateDeleteMoviePage2.fxml"));
			UpdateDeleteMovieControl upmc = loader.getController();
			AnchorPane rootLayout = (AnchorPane) loader.load();
			//upmc.showMovies();
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
	
	
//	@FXML
//	public void loadDeleteMoviePage()
//	{
//		//System.out.println("Button clicked");
//		try {
//		
//			Stage primaryStage;
//			
//			primaryStage = (Stage)deleteMovieBT.getScene().getWindow();
//			
//			FXMLLoader loader = new FXMLLoader();    //check file name here
//			loader.setLocation(Main.class.getResource("view/DeleteMoviePage1.fxml"));
//			AnchorPane rootLayout = (AnchorPane) loader.load();
//			
//			 // Show the scene containing the root layout.	
//			Scene scene = new Scene(rootLayout);
//			primaryStage.setScene(scene);
//			primaryStage.show();
//			} 
//			catch(IOException e)
//			{
//				e.printStackTrace();
//			}
//	}
	
	@FXML
   	public void loadPrevPage()
   	{
   		//System.out.println("Button clicked");
   		try {
   		
   			Stage primaryStage;
   			
   			primaryStage = (Stage)backBT.getScene().getWindow();
   			
   			FXMLLoader loader = new FXMLLoader();    //check file name here
   			loader.setLocation(Main.class.getResource("view/AdminLogin.fxml"));
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