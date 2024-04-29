import java.util.Scanner;


		public class Nokia{


	public static void main(String[] args){
	
		String menu = """
		It, Nokia 3310
		press
		1 -> phone book
		2 -> message
		3 -> chat
		4 -> call register
		5 -> Tones
		6 -> Settings
		7 -> call cost setting
		8 -> prepaid credit
		9 -> calculator
		10 -> Reminders
		11 -> clock
		12 -> Profile
		13 -> Sim service
		""";

		System.out.println(menu);
		Scanner keyboardInput = new Scanner(System.in);
		int customerInput = keyboardInput.nextInt();
		
		switch(customerInput){
		case 1 :
		System.out.println("Phone book");
		break;
		case 2 : 
		System.out.println("Message");
		break;
		case 3 :
	        System.out.println("chat");
		break;
		case 4 :  
		System.out.println("call register");
		break;
		case 5 : 
		System.out.println("Tones");
		break;
		case 6 : 
		System.out.println("show call costs");
		break;
		case 7 : System.out.println("prepaid credit");
		break;
		case 8 :
		System.out.println("calculator");
		break;
		case 9 :
		System.out.println("Reminders");
		break;
		case 10 : System.out.println("clock");
		break;
		case 11 :
	        System.out.println("Profile");
		break;
		case 12 : 
		System.out.println("Sim service");
		break;
		case 13 : 
		System.out.println("call cost setting");
		break;
		}



	

		String menu1 = """
		Hi, welcome
		press
		1 -> search
		2 -> service Nos
		3 -> Add name
		4 -> Erase
		5 -> Edit
		6 -> Assign tone
		7 -> Send b card
		8 -> option
		9 -> speed dial
		10 -> Voice tags
				
		""";
		System.out.println(menu1);
		Scanner keyboardInput1 = new Scanner(System.in);
		int customerInput1 = keyboardInput1.nextInt();
			
		switch(customerInput1){
		case 1 :
		System.out.println("search");
		break;
		case 2 :
	        System.out.println("service");
		break;
		case 3 :
	        System.out.println("Add name");
		break;
		case 4 :
	        System.out.println("Erase");
		break;
		case 5 :
	        System.out.println("Edit");
		break;
		case 6 : 
		System.out.println("Assign tone");
		break;
		case 7 :
		System.out.println("send b card");
		break;
		case 8 : 
	        System.out.println("option");
		break;
		case 9 :
		System.out.println("speed dial");
		break;
		case 10 :
		System.out.println("voice tags");
		break;
		}
	
		String option = """
		Hi, welcome
		press
		1 -> Type of view
		2 -> Memory status
		""";
    
		System.out.println(option);
		Scanner keyboardInput2 = new Scanner(System.in);
		int optionInput1 = keyboardInput2.nextInt();
			
		switch(optionInput1){
		case 1 :
		System.out.println("Type of view");
		break;
		case 2 :
	        System.out.println("Memory status");
		break;
			}

		

		
		String message = """
		Hi, Text me
		press
		1 -> write message
		2 -> inbox
		3 -> outbox
		4 -> picture message
		5 -> template
		6 -> smileys
		7 -> message settings
		""";

		System.out.println(message);
		Scanner keyboardInput3 = new Scanner(System.in);
		int messageInput = keyboardInput3.nextInt();
		
		switch(messageInput){
		case 1 :
		System.out.println("write message");
		break;
		case 2 : 
		System.out.println("inbox");
		break;
		case 3 :
	        System.out.println("outbox");
		break;
		case 4 :  
		System.out.println("picture message");
		break;
		case 5 : 
		System.out.println("Template");
		break;
		case 6 : 
		System.out.println("smileys");
		break;
		case 7 : System.out.println("message setting");
		break;
		}



		String message1 = """
		Hi, welcome
		press
		1 -> Message centre number
		2 -> Message sent as
		3 -> Message validity
		""";
		
		System.out.println(message1);
		Scanner keyboardInput4 = new Scanner(System.in);
		int messageInput1 = keyboardInput4.nextInt();
		
		switch(messageInput1){
		case 1 :
		System.out.println("Message centre number");
		break;
		case 2 : 
		System.out.println("Message sent as");
		break;
		case 3 :
	        System.out.println("Message validity");
		break;
		}
		




		String message2 = """
		Hi, welcome
		press
		1 -> Delivery report
		2 -> Reply via same center
		3 -> Character support
		""";
		
		System.out.println(message2);
		Scanner keyboardInput5 = new Scanner(System.in);
		int messageInput2 = keyboardInput5.nextInt();
		
		switch(messageInput2){
		case 1 :
		System.out.println("Delivery reports");
		break;
		case 2 : 
		System.out.println("Reply via same center");
		break;
		case 3 :
	        System.out.println("Character support");
		break;
		}

		


		String chat = """
		Hi, Mr chibuzo
		let's chat
		
		""";

		System.out.println(chat);
		Scanner keyboardInput6 = new Scanner(System.in);
		int chatInput = keyboardInput6.nextInt();
		

		

		String callRegister = """
		Hi, Phone
		press
		1 -> Missed calls
		2 -> Received calls
		3 -> Dialled numbers
		4 -> Erase recent call list
		5 -> Show call duration
		6 -> Show call costs
		7 -> Call cost setting
		8 -> Prepaid
		""";

		System.out.println(callRegister);
		Scanner keyboardInput7 = new Scanner(System.in);
		int callRegisterInput = keyboardInput7.nextInt();
		
		switch(callRegisterInput){
		case 1 :
		System.out.println("Missed calls");
		break;
		case 2 : 
		System.out.println("Received calls");
		break;
		case 3 :
	        System.out.println("Dialled numbers");
		break;
		case 4 :  
		System.out.println("Erase recent call lists");
		break;
		case 5 : 
		System.out.println("Show call duration");
		break;
		case 6 : 
		System.out.println("Show call costs");
		break;
		case 7 : 
		System.out.println("Call cost setting");
		break;
		case 8 : 
		System.out.println("Prepaid");
		break;
		}




		String showCallDuration = """
		Hi, welcome
		press
		1 -> Last call duration
		2 -> All calls duration
		3 -> Received calls duration
		4 -> Dialled calls duration
		5 -> Clear timers
		""";

		

		System.out.println(showCallDuration);
		Scanner keyboardInput8 = new Scanner(System.in);
		int showcallDurationInput = keyboardInput8.nextInt();
		
		switch(showcallDurationInput){
		case 1 :
		System.out.println("Last call duration");
		break;
		case 2 : 
		System.out.println("All calls duration");
		break;
		case 3 :
	        System.out.println("Received calls duration");
		break;
		case 4 :  
		System.out.println("Dialled calls duration");
		break;
		case 5 : 
		System.out.println("Clear timers");
		break;
		}
		
		


		String showCallCosts1 = """
		Hi, welcome
		press
		1 -> Last call cost
		2 -> All cals cost
		3 -> Clear counter
		""";

		System.out.println(showCallCosts1);
		Scanner keyboardInput9 = new Scanner(System.in);
		int showCallCostsInput1 = keyboardInput9.nextInt();
		
		switch(showCallCostsInput1){
		case 1 : 
		System.out.println("Last call cost");
		break;
		case 2 : 
		System.out.println("All calls cost");
		break;
		case 3 : 
		System.out.println("Clear counter");
		break;
		}		



		String callCostSetting1 = """
		Hi, welcome
		press
		1 -> Call cost limit
		2 -> Show costs in
		""";

		System.out.println(callCostSetting1);
		Scanner keyboardInput10 = new Scanner(System.in);
		int callCostSettingInput1 = keyboardInput10.nextInt();
		
		switch(callCostSettingInput1){
		case 1 : 
		System.out.println("Call cost limit");
		break;
		case 2 : 
		System.out.println("Show costs in");
		break;
		}
		




		String Tones = """
		Hi, Nokia tones
		press
		1 -> Ringing tones
		2 -> Ringing volume
		3 -> Incoming call alert
		4 -> Composer
		5 -> Message alert tones
		6 -> Vibrating alert
		7 -> Warming and game tones
		8 -> Keypad tones
		9 -> Screen saver
		""";

		System.out.println(Tones);
		Scanner keyboardInput11 = new Scanner(System.in);
		int tonesInput = keyboardInput11.nextInt();
		
		switch(tonesInput){
		case 1 :
		System.out.println("Ringing tone");
		break;
		case 2 : 
		System.out.println("Ringing volume");
		break;
		case 3 :
	        System.out.println("Incoming call alert");
		break;
		case 4 :  
		System.out.println("composer");
		break;
		case 5 : 
		System.out.println("Message alert tones");
		break;
		case 6 : 
		System.out.println("Keypad tones");
		break;
		case 7 : 
		System.out.println("Warning and game tones");
		break;
		case 8 : 
		System.out.println("Vibrating alert");
		break;
		case 9 : 
		System.out.println("Screen saver");
		break;
		}




		

		String Settings = """
		Hi, call settings
		press
		1 -> Automatic redial
		2 -> Speed dialling
		3 -> Call waiting option
		4 -> Own number sending
		5 -> Phone lines in use
		6 -> Automatic answer
		""";

		System.out.println(Settings);
		Scanner keyboardInput12 = new Scanner(System.in);
		int settingsInput = keyboardInput12.nextInt();
		
		switch(settingsInput){
		case 1 :
		System.out.println("Automatic redial");
		break;
		case 2 : 
		System.out.println("Speed dialing");
		break;
		case 3 :
	        System.out.println("Call waiting option");
		break;
		case 4 :  
		System.out.println("Own number sending");
		break;
		case 5 : 
		System.out.println("Phone line in use");
		break;
		case 6 : 
		System.out.println("Automatic answer");
		break;
		     }





		String settings1 = """
		Hi, phone Setting
		press
		1 -> Language
		2 -> Cell info display
		3 -> Welcome note
		4 -> Network selection
		5 -> Light
		6 -> Confirm Sim service action
		""";

		System.out.println(settings1);
		Scanner keyboardInput13 = new Scanner(System.in);
		int settingsInput1 = keyboardInput13.nextInt();
		
		switch(settingsInput1){
		case 1 :
		System.out.println("Language");
		break;
		case 2 : 
		System.out.println("Cell info display");
		break;
		case 3 :
	        System.out.println("Welcome note");
		break;
		case 4 :  
		System.out.println("Network selection");
		break;
		case 5 : 
		System.out.println("Lights");
		break;
		case 6 : 
		System.out.println("Comfirm sim service action");
		break;
			}


		



		String settings2 = """
		Hi, Security settings
		press
		1 -> Pin code request
		2 -> Call barring service
		3 -> Fixed dialling
		4 -> Closed user group
		5 -> Phone security
		6 -> Change access codes
		""";

		System.out.println(settings2);
		Scanner keyboardInput14 = new Scanner(System.in);
		int settingsInput2 = keyboardInput14.nextInt();
		
		switch(settingsInput2){
		case 1 :
		System.out.println("Language");
		break;
		case 2 : 
		System.out.println("Cell info display");
		break;
		case 3 :
	        System.out.println("Welcome note");
		break;
		case 4 :  
		System.out.println("Network selection");
		break;
		case 5 : 
		System.out.println("Lights");
		break;
		case 6 : 
		System.out.println("Comfirm sim service action");
		break;
			}



		String settings3 = """
		Hi, Restore factory settings
		press
		1 -> Info service
		2 -> Voice mailbox number
		3 -> Service command editor
		""";

		System.out.println(settings3);
		Scanner keyboardInput15 = new Scanner(System.in);
		int settingsInput3 = keyboardInput15.nextInt();
		
		switch(settingsInput3){
		case 1 :
		System.out.println("Info service");
		break;
		case 2 : 
		System.out.println("Voice mailbox number");
		break;
		case 3 :
	        System.out.println("Service command editor");
		break;
		}


		String callDivert = """
		Hi, welcome
		press
		1 -> Divert calls
		""";

		System.out.println(callDivert);
		Scanner keyboardInput16 = new Scanner(System.in);
		int callDivertInput = keyboardInput16.nextInt();
		
		switch(callDivertInput){
		case 1 :
		System.out.println("Dirvert calls");
		break;
		}




		String Game = """
		Hi, welcome
		press
		1 -> snake
		2 -> Sudoko

		""";
		System.out.println(Game);
		Scanner keyboardInput17 = new Scanner(System.in);
		int gameInput = keyboardInput17.nextInt();

		switch(gameInput){
		case 1 :
		System.out.println("Snake game");
		break;
		case 2 :
		System.out.println("Sudoko");
		break;
		}




		String Calculator = """
		Hi, welcome
		press
		1 -> Scienctific calculator
		""";
		System.out.println(Calculator);
		Scanner keyboardInput18 = new Scanner(System.in);
		int calculatorInput = keyboardInput18.nextInt();
		

		switch(calculatorInput){
		case 1 :
		System.out.println("scienctific calculator");
		break;
		}



		


		String reminder = """
		Hi, welcome
		press
		1 -> Reminder
		""";
		System.out.println(reminder);
		Scanner keyboardInput19 = new Scanner(System.in);
		int reminderInput = keyboardInput19.nextInt();
		
		switch(reminderInput){
		case 1 :
		System.out.println("reminder");
		break;
		}


		String Clock = """
		Hi, welcome
		press
		1 -> Alarm clock
		2 -> Clock setting
		3 -> Date setting
		4 -> Stopwatch
		5 -> Countdown timer
		6 -> Auto updates of date and time
		""";

		System.out.println(Clock);
		Scanner keyboardInput20 = new Scanner(System.in);
		int clockInput = keyboardInput20.nextInt();
		
		switch(clockInput){
		case 1 :
		System.out.println("Alarm clock");
		break;
		case 2 : 
		System.out.println("Clock settings");
		break;
		case 3 :
	        System.out.println("Date setting");
		break;
		case 4 :  
		System.out.println("Stopwatch");
		break;
		case 5 : 
		System.out.println("Coundown timer");
		break;
		case 6 : 
		System.out.println("Auto update of date and time");
		break;
			}
		



		String Profile = """
		Hi, welcome
		press
		1 -> profiles
		""";

		System.out.println(Profile);
		Scanner keyboardInput21 = new Scanner(System.in);
		int profilesInput = keyboardInput21.nextInt();
		
		switch(profilesInput){
		case 1 :
		System.out.println("profiles");
		break;
		}



		String simServices = """
		Hi, welcome
		press
		1 -> simServices
		""";

		System.out.println(simServices);
		Scanner keyboardInput22 = new Scanner(System.in);
		int simServicesInput = keyboardInput22.nextInt();
		
		switch(simServicesInput){
		case 1 :
		System.out.println("simServices");
		break;
		}






}





}

