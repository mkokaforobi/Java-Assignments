import java.util.Scanner;

public class NokiaFirstIteration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("NOKIA 5510\n");
		System.out.println("Main Menu");

			String menu = """
			1. Phone Book
			2. Messages
			3. Chat
			4. Call Register
			5. Tones
			6. Settings
			7. Call Divert
			8. Music
			9. Games
			10. Calculator
			11. Reminders
			12. Clock
			13. Profiles
			14. Services
			15. SIM Services """;

				System.out.println(menu);
				System.out.print("\nEnter your choice: ");
				int choice = input.nextInt();
		
		switch (choice) {

    		case 1->{
			System.out.println("\nPhone Book");
			menu = """
				1. Search
				2. Service Nos
				3. Add name
				4. Erase
				5. Edit
				6. Copy
				7. Assign tone
				8. Send b'card
				9. Options
				10. Speed dials
				11. Voice tags """;
		
			System.out.println("\n"+menu);
                	System.out.print("\nEnter your choice: ");

                	choice = input.nextInt();

			switch (choice){
				case 1->{System.out.println("Search");}
				case 2->{System.out.println("Service Nos");}
				case 3->{System.out.println("Add name");}
				case 4->{System.out.println("Erase");}
				case 5->{System.out.println("Edit");}
				case 6->{System.out.println("Copy");}
				case 7->{System.out.println("Assign tone");}
				case 8->{System.out.println("Send b'card");}
				case 9->{
					System.out.println("\nOptions");
					menu = """
						1. Memory in use
						2. Type of view
						3. Memory status""";
		
					System.out.println("\n"+menu);
                			System.out.print("\nEnter your choice: ");
                			choice = input.nextInt();

						switch (choice) {

    							case 1->{System.out.println("Memory in use");}
							case 2->{System.out.println("Type of view");}
							case 3->{System.out.println("Memory status");}
						}

				}
				case 10->{System.out.println("Speed dials");}
				case 11->{System.out.println("Voice tags");}
				
			}

		}
		case 2->{
			System.out.println("Messages");
				menu = """
			1. Write messages
			2. Inbox
			3. Outbox
			4. Picture messages
			5. Templates
			6. Smileys
			7. Message settings
			8. Info Service
			9. Voice mailbox number
			10. Service command editor """;

				System.out.println(menu);
				System.out.print("\nEnter your choice: ");
				choice = input.nextInt();
			
			switch (choice){
				case 1->{System.out.println("Write messages");}
				case 2->{System.out.println("Inbox");}
				case 3->{System.out.println("Outbox");}
				case 4->{System.out.println("Picture messages");}
				case 5->{System.out.println("Templates");}
				case 6->{System.out.println("Smileys");}
				case 7->{
					System.out.println("Message settings");
						menu = """
						1. Set
						2. Common """;
			}
					System.out.println(menu);
					System.out.print("\nEnter your choice: ");
					choice = input.nextInt();
			
					switch (choice){
						case 1->{
							System.out.println("Set");
							menu = """
								1. Message centre number
								2. Messages sent as
								3. Messages validity """;
					
					System.out.println(menu);
					System.out.print("\nEnter your choice: ");
					choice = input.nextInt();
			
						switch (choice){
							case 1->{System.out.println("Message centre number");}
							case 2->{System.out.println("Messages sent as");}
							case 3->{System.out.println("Messages validity");}


						}
					

						case 2->{
							System.out.println("Common");
							menu = """
								1. Delivery reports
								2. Reply via same centre
								3. Character support """;
						
						System.out.println(menu);
						System.out.print("\nEnter your choice: ");
						choice = input.nextInt();
						
							switch (choice){
								case 1->{System.out.println("Delivery reports");}
								case 2->{System.out.println("Reply via same centre");}
								case 3->{System.out.println("Character support");}
							}


						}



					 	}

					}
				

					}
				}
				

			}

						

		}

		case 3->{System.out.println("Chat");}
		case 4->{
			System.out.println("Call Register");
		}

		case 5->{
			System.out.println("Tones");
		}

		case 6->{
			System.out.println("Settings");

			menu = """
			1. Call Settings
			2. Phone Settings
			3. Security settings
			4. Restore factory setting """;

				System.out.println(menu);
				System.out.print("\nEnter your choice: ");
				choice = input.nextInt();
			
					
					switch (choice){
						case 1->{
							System.out.println(" Call Settings");
								menu = """
			1. Automatic redial 
			2. Speed dialing
			3. Call waiting options
			4. Own number sending
			5. Phone line in
			6. Automatic answer """;

				System.out.println(menu);
				System.out.print("\nEnter your choice: ");
				choice = input.nextInt();
					}
			
			switch (choice){
				case 1->{System.out.println(" Automatic redial ");}
				case 2->{System.out.println("Speed dialing");}
				case 3->{System.out.println("Call waiting options");}
				case 4->{System.out.println("Own number sending");}
				case 5->{System.out.println("Phone line in");}
				case 6->{System.out.println("Automatic answer");
				
			}

						}

						case 2->{
							System.out.println("Phone Settings");
								menu = """
			1. Language
			2. Cell infor display
			3. Welcome note
			4. Network selection 
			5. Confirm SIM service actions """;

				System.out.println(menu);
				System.out.print("\nEnter your choice: ");
				choice = input.nextInt();
			
			switch (choice){
				case 1->{System.out.println(" Language");}
				case 2->{System.out.println("Cell infor display");}
				case 3->{System.out.println("Welcome note");}
				case 4->{System.out.println("Network selection");}
				case 5->{System.out.println("Confirm SIM service actions");}

				
			}

						}

						case 3->{
							System.out.println("Security settings");

							menu = """
			1. PIN code request
			2. Call barring service
			3. Fixed dialling
			4. Closed user group
			5. Security level
			6. Change access codes  """;

				System.out.println(menu);
				System.out.print("\nEnter your choice: ");
				choice = input.nextInt();
			
			switch (choice){
				case 1->{System.out.println(" PIN code request");}
				case 2->{System.out.println("Call barring service");}
				case 3->{System.out.println("Fixed dialling");}
				case 4->{System.out.println("Closed user group");}
				case 5->{System.out.println("Security level");}
				case 6->{System.out.println("Change access codes ");}

				
			}

						}

						case 4->{System.out.println("Restore factory setting");g}

					}
				
			


							

		}

		case 7->{System.out.println("Call Divert");}
		case 8->{
			System.out.println("Music");

			menu = """
			1. Music player
			2. Radio
			3. Recorder
			4. Tracklist """;

				System.out.println(menu);
				System.out.print("\nEnter your choice: ");
				choice = input.nextInt();
			
			switch (choice){
				case 1->{System.out.println(" Music player");}
				case 2->{System.out.println("Radio");}
				case 3->{System.out.println("Recorder");}
				case 4->{System.out.println("Tracklist");}
				
			}


		}
		case 9->{System.out.println("Games");}
		case 10->{System.out.println("Calculator");}
		case 11->{System.out.println("Reminders");}
		case 12->{
			System.out.println("Clock");
			
			menu = """
			1. Alarm clock
			2. Clock settings
			3. Date setting
			4. Stopwatch
			5. Countdown timer
			6. Auto update update and time """;

				System.out.println(menu);
				System.out.print("\nEnter your choice: ");
				choice = input.nextInt();
			
			switch (choice){
				case 1->{System.out.println("Alarm clock");}
				case 2->{System.out.println("Clock settings");}
				case 3->{System.out.println("Date setting");}
				case 4->{System.out.println("Stopwatch");}
				case 5->{System.out.println("Countdown timer");}
				case 6->{System.out.println("Auto update update and time");}
			}

		}
		case 13->{System.out.println("Profiles");}
		case 14->{System.out.println("Services");}
		case 15->{System.out.println("Sim Services\n");}
    		default->{System.out.println("Invalid choice");}
	
		

		}

	
	}


}