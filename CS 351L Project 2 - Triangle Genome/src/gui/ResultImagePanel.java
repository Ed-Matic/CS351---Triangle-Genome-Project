package gui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class ResultImagePanel
{
  public HBox panel = new HBox();
  ImageView imageDisplayer = new ImageView();
  
  public void generatePanel()
  {
    Image resultedImage = new Image("file:src/images/blank-screen.jpg");
    
    imageDisplayer.setImage(resultedImage);
    
    
    panel.getChildren().addAll(imageDisplayer);
  }
}
