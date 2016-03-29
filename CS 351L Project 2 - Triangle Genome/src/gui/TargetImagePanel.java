package gui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class TargetImagePanel
{
  public HBox panel = new HBox();
  public ImageView imageDisplayer = new ImageView();
  
  public void generatePanel()
  {
    Image[] selectedImage = new Image[]
        { 
          new Image("file:src/images/mona-lisa-cropted-512x413.png"),
          new Image("file:src/images/poppyfields-512x384.png"),
          new Image("file:src/images/the_great_wave_off_kanagawa-512x352.png"),
          new Image("file:src/images/colors-of-life.jpeg")
        };
    
    
    imageDisplayer.setImage(selectedImage[0]);
    //imageDisplayer.setFitWidth(200);
    
    panel.getChildren().addAll(imageDisplayer);
  }
  
  public void functionSetUP()
  {
    
  }
  
  
}
