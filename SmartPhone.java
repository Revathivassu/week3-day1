package week3.day1;

public class SmartPhone extends AndriodPhone {
	public void connectWhatsApp() {
		System.out.println("Connect WhatsApp");
	}
	public void takeVideo() {
		System.out.println("take video of party");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone  mySmartPhone = new SmartPhone();
	    mySmartPhone.makeCall();
	    mySmartPhone.sendMsgs();
	    mySmartPhone.saveContact();
	    mySmartPhone.takeVideo();
	    mySmartPhone.connectWhatsApp();

		
	}

}
