const int AoutMQ6LPG=0; //Analog Out MQ6 LPG for Butane
const int DoutMQ6LPG=2; //Digital Out MQ6 LPG for Butane
const int AoutMQ7CO=2;   //Analog Out MQ7 for CO
const int DoutMQ7CO=4;   //Digital Out MQ7 for CO 
//const int ledPin=5;      //LED power
//const int ledsecond
const int buzz=6;        //Buzzer
const int sensorPin=A5;  //LDR 
const int fann=3;
const int led1=8;       //ledgreen
const int led2=7;       //ledred 

int butane, co;
int sensorValue=0;
String str,str1,str2,str3;

void setup()
{
    Serial.begin(9600);           //sets the baud rate
    pinMode(DoutMQ6LPG, INPUT);   //sets the pin as an input to the arduino
    pinMode(DoutMQ7CO, INPUT);
    pinMode(led1, OUTPUT);
    pinMode(led2, OUTPUT);
    pinMode(fann,OUTPUT);
    str=String();
    str1=String();
    str2=String();
    str3=String();
}

void loop()
{
  digitalWrite(led1,HIGH);
  digitalWrite(led2,HIGH);
  butane=analogRead(AoutMQ6LPG);
  co=analogRead(AoutMQ7CO);
  sensorValue=analogRead(sensorPin);
  digitalWrite(fann,LOW);
 // Serial.print("B");
 // Serial.println(butane);
  //Serial.print("C");
  //Serial.println(co);
  //Serial.print("L");
 // Serial.println(sensorValue);
 str1="B";
 str2="B";
 str3="B";
  //str="Butane" + butane + "Carbon" + co + "Light" + sensorValue;
  str=str1+butane+str2+co+str3+sensorValue;
  Serial.println('_'+str);
  delay(500);
  if(co>540)
  {
    digitalWrite(fann,HIGH);

    delay(500);
  }
  if(butane >200)
  {
     //digitalWrite(ledPin, HIGH);//if limit has been reached, LED turns on as status indicator
     tone(buzz,1000,100);
  }
  if(sensorValue > 800)
  {    
      //digitalWrite(ledPin, HIGH);//if limit has been reached, LED turns on as status indicator
      tone(buzz,1000,500);  
  }
  
  /*digitalWrite(fann,LOW);
  delay(3000);
 
  if(butane >180)
  {
      digitalWrite(ledPin, HIGH);//if limit has been reached, LED turns on as status indicator
      //Serial.println("High Amount of butane");
      tone(buzz,1000,100);
  }
  if(co >590)
  {
      digitalWrite(ledPin, HIGH);//if limit has been reached, LED turns on as status indicator
     // Serial.println("High amount of CO");
      digitalWrite(fann,HIGH);
      tone(buzz,1000,100);
  }
  if(sensorValue > 900)
  {
      digitalWrite(ledPin, HIGH);//if limit has been reached, LED turns on as status indicator
      tone(buzz,1000,100);  
  }
  else
  {
        digitalWrite(ledPin, LOW);//if threshold not reached, LED remains off
  }
  delay(2000);*/ 
}

