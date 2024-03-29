package com.wheezy.template;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class HelloFX extends Application
{

  @Override
  public void start(Stage primaryStage)
  {
    try
    {
      // Read file fxml and draw interface.
      Parent root = FXMLLoader.load(getClass().getResource("HelloFX.fxml"));

      primaryStage.setTitle("Hello World FX!");
      primaryStage.setScene(new Scene(root));
      primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("icon/AppIcon.png")));
      primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>()
      {
        @Override
        public void handle(WindowEvent t)
        {
          Platform.exit();
          System.exit(0);
        }
      });
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