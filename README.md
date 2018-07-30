# "Raksha" Domestic Pollution Control System

Project focused on Domestic Pollution which comes under the topic of Indoor Pollution. 
LPG gas leakage, CO released by Gas Geysers, Other harmful gases like butane, propane, etc. are also responsible for deaths at home.
The light intensity if not properly adjusted causes harm to human eyes.
Social Media Pollution is also going to be the most hazardous pollution type in the near future.

Used MQ6 and MQ7 sensors to detect different levels of Butane(LPG) gas and Carbon Monoxide gas respectively. The values fetched by the sensors are passed as input parameters to the Java program via Arduino. The computing algorithms coded in Java continuously monitors the values received from the arduino and checks whether it is above the set limit. If it exceeds the limit then an alert message will be sent to the authorized people. This message sending is done by a message server which can easily send bulk messages at a very low price. We have also created a web browser for social media pollution control is based on Java language, JavaFx.?

This is a prototype project.
Made a pytotype of a sensor system that is able to detect the poisonous gases and at the same time alert people about the miss happening that can be caused.

## Problem Statement

Originator: We are primarily focusing on Domestic Pollution. Domestic pollution is caused by various harmful gases being released by various devices as well as social media pollution and damage to eyes through too high and too low light intensity also comes under domestic pollution.?

As we all say "There are no roses without thorns" same way this domestic pollution started with the origination of LPG gas cylinders, Gas Geysers, Internet, Mobile Phones, Laptops, Desktops, etc.?

People are dying because of these gases being released by devices present at their houses.?

Social Media Pollution has not yet been recognized by the people that how much it is affecting us. Using social media has become one's undeniable addiction. It is psychologically affecting their lifestyles(Cyber Bullying) etc.?

Using laptops, mobile phones, watching television in too high or too low light intensity can cause complete blindness.?

## Getting Started

For detailed descriptions read the Presentation.pdf of the project. 

* Used MQ6 sensor for LPG (Butane)
* Used MQ7 sensor for CO
* Used Buzzer and LEDs for alert system
* Used LDR sensor to control the intesity of light
* Arduino is used as the processor 
* sensor.ino file has the pin decription and logic

* The details of the leak are transmitted to the JavaUrl/src/Main.java file
* Main.java file calles JavaUrl/src/JavaUrl.java file which sends the message alert to the person

* JavaUrl/src/co.wav, JavaUrl/src/lpg.wav and JavaUrl/src/light.wav has the audio recordings for immediate alerting the people nearby
* Audio files will be played acording to the type of the leaking gas

JavaFXApplication:When our parents scolded us for something though we dont listen to them but at one time we will think upon the point and agree to them.Same is the case with everyone today using internet, we are not aware how much we are active on internet which ultimately doesn't work in our favour.So here is a web browser developed which when opened will always tell us how much we have used social networking sites such as facebook,youtube today by converting text to speech. 

* JavaFXApplication/src/WebViewSample.java is used for running the web browser . It launches the browser and opens facebook and alerts the user regarding the usage of application such as facebook.

*JavaFXApplication/src/WebViewSample1.java is used for running the web browser . It launches the browser and opens youtube and alerts the user regarding the usage of application such as youtube.

*JavaFXApplication/src/WebViewSample2.java is used for running the web browser . It launches the browser and opens instagram and alerts the user regarding the usage of application such as instagram.

## Authors


* **Navya Mathur** 
* **Muskan Singla**
* **Twinkle Baradia**

## License

This project is licensed under the MIT License
