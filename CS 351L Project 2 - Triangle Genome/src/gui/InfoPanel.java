package gui;

import javafx.collections.FXCollections;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class InfoPanel
{
  public VBox panel = new VBox();
  
  public void generatePanel()
  {
    panel.setSpacing(20);
    
    ChoiceBox<String> selectImage = new ChoiceBox<String>(FXCollections.observableArrayList
        ("Mona Lisa", "Poppy Fields", "The Great Wave Of Kanagawa", "Colors Of Life"));
    
    
    TextArea text = new TextArea();
    
    panel.getChildren().addAll(selectImage);
  }
  
  public void setUpChoices()
  {
    
  }
}
