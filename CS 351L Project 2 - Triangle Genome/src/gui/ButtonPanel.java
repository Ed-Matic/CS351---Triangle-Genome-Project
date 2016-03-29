package gui;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonPanel
{
  public HBox panel = new HBox();
  
  public void generatePanel()
  {
    panel.setSpacing(10);
    
  //Buttons for the bottom of the GUI
    Button pauseButton = new Button("Pause");
    pauseButton.setPrefSize(100, 20);
    
    Button nextButton = new Button("Next");
    nextButton.setPrefSize(100, 20);
    
    panel.getChildren().addAll(pauseButton,nextButton);
  }
}
