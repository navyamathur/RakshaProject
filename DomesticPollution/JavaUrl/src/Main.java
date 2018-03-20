//import gnu.io.SerialPort;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import javax.comm.CommPortIdentifier;
import javax.comm.SerialPort;
//import processing.app.Preferences;
//import processing.app.Preferences;
 
public class Main {
    static String msg[]={"HighButane","HighCO","HighLight"," "};
    static InputStream input;
    static OutputStream output;
    public static void main(String[] args) throws Exception{
        //Preferences.init();
        //System.out.println("Using port: " + Preferences.get("serial.port"));
        //CommPortIdentifier portId = CommPortIdentifier.getPortIdentifier(
        //Preferences.get("serial.port"));
        //Systemm.main(null);
        //Present.main(null);
        
        CommPortIdentifier portId = CommPortIdentifier.getPortIdentifier("COM6");
        SerialPort port = (SerialPort)portId.open("serial talk", 4000);
        input = port.getInputStream();
        //output = port.getOutputStream();
        //port.setSerialPortParams(Preferences.getInteger("serial.debug_rate"),
                                    // SerialPort.DATABITS_8,
                                    // SerialPort.STOPBITS_1,
                                    // SerialPort.PARITY_NONE);
        port.setSerialPortParams(9600,
                SerialPort.DATABITS_8,
                SerialPort.STOPBITS_1,
                SerialPort.PARITY_NONE);
        String s="";
       String str[];
       String strval[];
       //while(true)
       {//  while(true)
        {
            while(input.available()>0) {
                //JavaUrl.main(null);
               //System.out.print((char)(input.read()));
               s=s+(char)(input.read());
               
              
            }
            System.out.println(s);
            str=s.split("_");
           // System.out.println(str[3]);
            strval=str[3].split("B");
           // System.out.println(strval[0]);
            System.out.println(strval[1]);
            System.out.println(strval[2]);
            System.out.println(strval[3]);
            
            //s="";            
//if(i==0&&s.length()==20)
            {
                //System.out.println(s);
                /*s=s.trim();
                s = s.replaceAll("[^0-9]+", " ");
                System.out.println(s);
                //JavaUrl.main(null);
                List list=Arrays.asList(s.trim().split(" "));
                Object arr=list.get(0);
                Object arr1=list.get(1);
                Object arr2=list.get(2);
        
                String ar=arr.toString();
                String ar1=arr.toString();
                String ar2=arr.toString();
       
                int arr4=Integer.parseInt(ar);
                int arr5=Integer.parseInt(ar1);
                int arr6=Integer.parseInt(ar2);
       */
                if(Integer.parseInt(strval[1].trim())>190)
                {
                    msg[3]="0";
                    JavaUrl.main(msg);
                    System.out.print("High Butane detected");
                    //Snippet2.main(null);
                }
                
                if(Integer.parseInt(strval[2].trim())>550)
                {
                     msg[3]="1";
                    JavaUrl.main(msg);
                    System.out.print("High CO detected");
                    //Snippet.main(null);
                }
                if(Integer.parseInt(strval[3].trim())>760)
                {
                    msg[3]="2";
                    JavaUrl.main(msg);
                    System.out.print("High Light detected");  
                    Snippet3.main(null);
                }
                
          //      System.out.println(arr4);
                //System.out.println(arr5);
                //System.out.println(arr6);
                
            }
            //s="";
       }
            port.close();
            //i=1;
        }
    }
}