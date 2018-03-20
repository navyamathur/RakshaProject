/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muskan
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VKC
 */
import java.sql.*;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
 import java.sql.*;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import java.io.IOException;  
//import javax.speech.synthesis.Voice;
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document; 
import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;
import java.io.*;
import com.sun.speech.freetts.*;
import java.awt.event.MouseEvent;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
//int a;
 
public class WebViewSample1 extends Application {
  // public int a=0;
    private Scene scene;
    @Override public void start(Stage stage) {
        // create the scene
        stage.setTitle("Web View");
        scene = new Scene(new Browser(),750,500, Color.web("#666970"));
        stage.setScene(scene);
        scene.getStylesheets().add("webviewsample/BrowserToolbar.css");        
        stage.show();
    }
 
    public static void main(String[] args){
      //  public int a;
        launch(args);
        //int a=Main1.main(null);
        //System.out.println(a);
    }
}
class Browser1 extends Region {
    static final String VOICENAME1="kevin16";
     Connection cn;
PreparedStatement pst, pst1,pst2;
ResultSet rs;
 String url,sql;
 int i=0;
 
    
    final WebView browser = new WebView();
    final WebEngine webEngine = browser.getEngine();
     
    public Browser1() {
        //apply the styles
        getStyleClass().add("browser");
     //   System.out.println("before children1");
        // load the web page
        webEngine.load("https://www.facebook.com/");
        //add the web view to the scene
       // String url1="https://www.youtube.com/results?search_query=how+much+time+do+we+spend+on+our+phones+";
       // System.out.println("before children");
        getChildren().add(browser);
        //System.out.println("hello");
        try
    {
        //System.out.println("inside try");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            url="jdbc:sqlserver://localhost;instance=MUSKAN;databaseName=akinator;user=vidushi;password=123@fet";
            cn=DriverManager.getConnection(url);
             sql="Select time From URL2 where url='https://www.facebook.com/'";
             //System.out.println(sql);
        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
        //System.out.println("heyout");
         while(rs.next())
        {
          //  System.out.println("hey");
            //jTextField1.setEditable(false);
       //jTextField11.setText(rs.getString("character"));
       int ra=rs.getInt("time");
        
        System.out.println(ra);
        }
        rs.close();
        cn.close();
        
    }
    catch(Exception e)
    {
        System.out.println("hello"+e.getMessage());
    }
    Voice voice;
        VoiceManager vm=VoiceManager.getInstance();
        voice=vm.getVoice(VOICENAME1);
         voice.allocate();
         voice.speak("you have used faccebook for");
         int aa=Main1.main(null);
         String aaa=aa+"";
         voice.speak(aaa+"hours.Muskan this is very bad for your health.");
      //   voice.speak("hours");
       //  voice.speak("Muskan This is very bad for your health.Stop using it now");
        // voice.speak(rs.getString(""));
       // voice.speak(rs.getString("time"));
     
        
        
 
    } 
    private Node createSpacer() {
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        return spacer;
    }
 
    @Override protected void layoutChildren() {
        double w = getWidth();
        double h = getHeight();
        layoutInArea(browser,0,0,w,h,0, HPos.CENTER, VPos.CENTER);
    }
 
    @Override protected double computePrefWidth(double height) {
        return 750;
    }
 
    @Override protected double computePrefHeight(double width) {
        return 500;
    }
}

