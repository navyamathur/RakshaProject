//package JavaUrl;
import java.net.*;
import java.io.*;

public class JavaUrl {
     public static void main(String[] args)
  {
   // String outt=getURL("https://docs.oracle.com/javase/8/docs/api/java/net/package-summary.html");  
    String output  = getUrlContents("http://www.bulksms.sunrisewebsolution.com/api/sendhttp.php?authkey=133462AI3XpkhGteWf584be76b&mobiles=919530738344&message="+args[Integer.parseInt(args[3])]+"&sender=RAKSHA&route=4&country=India&flash=gh&unicode=fgh");
    System.out.println(output);
    System.out.println(args[Integer.parseInt(args[3])]);
  }
  private static String getUrlContents(String theUrl)
  {
    StringBuilder content = new StringBuilder();
    try
    {
      // create a url object
      URL url = new URL(theUrl);
      // create a urlconnection object
      URLConnection urlConnection = url.openConnection();
      // wrap the urlconnection in a bufferedreader
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
      String line;
      // read from the urlconnection via the bufferedreader
      while ((line = bufferedReader.readLine()) != null)
      {
        content.append(line + "\n");
      }
      bufferedReader.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    return content.toString();
  }
}
