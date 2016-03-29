package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class MainGUI extends Application
{ 
  public ButtonPanel buttonPanel = new ButtonPanel();
  public InfoPanel infoPanel = new InfoPanel();
  public TargetImagePanel targetImagePanel = new TargetImagePanel();
  public ResultImagePanel resultImagePanel = new ResultImagePanel();
  
  //method to generate the different 
  //panels in the frame
  public void buildPanels()
  {
    buttonPanel.generatePanel();
    infoPanel.generatePanel();
    targetImagePanel.generatePanel();
    resultImagePanel.generatePanel();
  }
  
  
  
  
  @Override
  public void start(Stage primaryStage)
  {
    BorderPane root = new BorderPane();
    Scene scene = new Scene(root, 1200, 700);
    
    buildPanels();
    
    //Setting the Panels in the Pane
    //in the right order
    root.setLeft(targetImagePanel.panel);
    root.setCenter(resultImagePanel.panel);
    root.setRight(infoPanel.panel);
    root.setBottom(buttonPanel.panel);
    
    try
    {
      primaryStage.setScene(scene);
      primaryStage.setTitle("Triangle Genome Project By: Ederin & Brian");
      primaryStage.show();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    
    
  }

  public static void main(String[] args)
  {
    launch(args);
  }
}
