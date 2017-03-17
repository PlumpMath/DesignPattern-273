package Prototype;

//This exercise will demo the use of a default object template to create new objects that are clones of it

//You have a class called TCPPacket that has the following fields
//URL ( string )
//Port ( int )
//Secured ( bool )
//Data ( string )
//It also has a print function that prints this information

//You have a client class TCPSender that can create TCPPackets
//TCPSender has a function called createTCPPacket that returns a pointer to a new TCPPacket object 

//Create a method called setDefaultPacket in TCPSender that will set the default prototype of all new TCP objects created

//Create a TCPPacket object that will be the default packet, and set it as the default for TCPSender
//Create some new identical TCPPackets using the TCPSender

public 	class Example { // client
	public static void main(String[] args) throws CloneNotSupportedException {
		TCPPacket defaultPacket = new TCPPacket();
		defaultPacket.setURL("localhost");
		defaultPacket.setPort(80);
		defaultPacket.setSecured(false);
		defaultPacket.setData("XXX");

		TCPSender tcpSender = new TCPSender();
		tcpSender.setDefaultPacket(defaultPacket);
		TCPPacket packet = tcpSender.createTCPPacket();
		packet.print();
		TCPPacket packet2 = tcpSender.createTCPPacket();
		packet2.print();
	}
}