import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	/**
	 * @param args strings
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<User> currentUser = new ArrayList<User>(); //create user sessions
		currentUser.clear(); //clear existing sessions

		ArrayList<User> myUsers = new ArrayList<User>(); //creating existing users array
		myUsers.add(new User("yeechen", "123abc","Jalan PJU 1a/46, Taman Putra Damai, 47301 Petaling Jaya, Selangor", 0, "Malaysia", 3.07, 101.52));
		myUsers.add(new User("joeltan", "abc123","7, Jalan Bintang, Bukit Bintang, 55100, Kuala Lumpur", 1200, "Japan",3.14,101.69));
		myUsers.add(new User("michelleler", "123abc","6, Jalan Damanlela, Bukit Damansara, 50490, Kuala Lumpur", 700, "Singapore",3.14,101.69));
		myUsers.add(new User("yokelvin", "helloworld","1, Persiaran Kewajipan, Usj 1, 47600 Subang Jaya, Selangor", 300, "Taiwan", 3.07, 101.52));
		
		Attraction [] myAtts = new Attraction[10];
		Restaurants[] myRests = new Restaurants[10];
		Hotels[] myHotels = new Hotels[10];
		
		myHotels[0] = new Hotels("Shangri-La-Hotel" , 489.00 ,3.1541 , 101.7063, 4.5 ,"11, Jalan Sultan Ismail, Kuala Lumpur, 50250 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", 5);
		myHotels[1] = new Hotels("Sunway Putra Hotel",478.00, 3.1666 ,101.6928 , 4.3 ,"100 Jalan Putra, Chow Kit, 50350 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", 5);
		myHotels[2] = new Hotels("Mandarin Oriental Kuala Lumpur", 564.00 ,3.1560,101.7120, 4.6 ,"Kuala Lumpur City Centre, 50088 Kuala Lumpur, Federal Territory of Kuala Lumpur", 5);
		myHotels[3] = new Hotels("Impiana KLCC Hotel" , 245.00 , 3.1536 ,101.7114 , 4.2 ,"Impiana Klcc Hotel & Spa, 13, Jalan Pinang, Kuala Lumpur, 50450 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", 4);
		myHotels[4] = new Hotels("Furama Bukit Bintang" , 178.00 ,  3.1400 ,101.7101, 4.1 ,"136, Jalan Changkat Thambi Dollah, Pudu, 55100 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur",4); 
		myHotels[5] = new Hotels("33 Star Hotel", 67.00 , 3.1478 , 101.7118 , 3.3 ,"56-58, Jalan Sultan Ismail, Bukit Bintang, 50250 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", 2 );
		myHotels[6] = new Hotels("Areena Star Hotel", 120.00,  3.1488 ,101.6989, 3.6 ,"49, Jalan Hang Lekiu, Kuala Lumpur, 50050 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", 3); 
		myHotels[7] = new Hotels("Starpoints Hotel Kuala Lumpur", 268.00, 3.1541 ,101.6975, 3.6 ,"149, Jalan Masjid India, City Centre, 50100 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur",3); 
		myHotels[8] = new Hotels("Hotel Capitol Kuala Lumpur", 153.00 ,  3.1448 , 101.7098,4.0 ,"Bukit Bintang Street, Bukit Bintang, 55100 Kuala Lumpur, Federal Territory of Kuala Lumpur",3); 
		myHotels[9] = new Hotels("My Hotel", 119.00 , 3.1319, 101.6876 , 3.8 ,"1, Jalan Tun Sambanthan 4, Brickfields, 50470 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", 2);
		
		myRests[0] = new Restaurants("McDonald's KL Sentral", 20.00,3.1346 , 101.6866,3.6 ,"15, Jalan Stesen Sentral 5, Kuala Lumpur Sentral, 50470 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", "Fast Food");
		myRests[1] = new Restaurants("Vin's Restaurant and Bar", 100.00,  3.1494 , 101.6298,4.4 ,"6, Lorong Datuk Sulaiman 1, Taman Tun Dr Ismail, 60000 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur","Casual Dining");
		myRests[2] = new Restaurants("Dining in the Dark", 300.00, 3.1475 ,101.7082, 4.6 ,"50A, Changkat Bukit Bintang, Bukit Bintang, 50200 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", "Fine Dining");
		myRests[3] = new Restaurants("Sitka Restaurant", 80.00, 3.1496 ,101.6613, 4.0 ,"Plaza Batai, 8 - 5, Jalan Batai, Bukit Damansara, 50490 Kuala Lumpur, Federal Territory of Kuala Lumpur", "Casual Dining");
		myRests[4] = new Restaurants("The Owls Cafe", 150.00,3.0594 , 101.6733,  4.3 ,"Jalan Jalil Jaya 6, Bukit Jalil, 57000 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", "Casual Dining");
		myRests[5] = new Restaurants("Cantaloupe at Troika Sky Dining", 350.00,  3.1576 ,101.7182, 4.5 ,"Level 23A Tower B, The Troika, 19 Persiaran KLCC, 50450 Kuala Lumpur", "Fine Dining");
		myRests[6] = new Restaurants("El Cerdo Restaurant", 120.00,  3.1473 ,101.7078, 4.4 ,"43 & 45, Changkat Bukit Bintang, Bukit Bintang, 50200 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", "Casual Dining");
		myRests[7] = new Restaurants("Marble 8", 270.00,3.1568 ,101.7117,  4.1 ,"Petronas, Menara 3, Persiaran KLCC, Kuala Lumpur City Centre, 50088 Kuala Lumpur", "Fine Dining");
		myRests[8] = new Restaurants("Fuel Shack", 70.00,  3.1444 ,101.7101, 3.7 ,"Lot G-28, Plaza Low Yat, No.7 Jalan Bukit Bintang,, 7, Jalan Bintang, Bukit Bintang, 55100 Kuala Lumpur, Federal Territory of Kuala Lumpur", "Fast Food");
		myRests[9] = new Restaurants("Marini's on 57", 200.00,  3.1466 ,101.6958, 4.5 ,"Menara 3 Petronas, Persiaran KLCC, Kuala Lumpur City Centre, 50088 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", "Fine Dinning");
		
		myAtts[0] = new Attraction("Petronas Towers", 70.00, 3.1577,101.7122 , 4.60, 4.3, "Petronas Twin Tower, Kuala Lumpur City Centre, 50450 Kuala Lumpur, Federal Territory of Kuala Lumpur", "Landmark");
		myAtts[1] = new Attraction("Kuala Lumpur Tower", 80.00, 3.1537, 101.7041,4.40, 4.1,"2, Jalan Puncak, Kuala Lumpur, 50250 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", "Landmark");
		myAtts[2] = new Attraction("Suria Aquarium", 50.00,  3.1580,101.7117,4.30, 4.2, "Kuala Lumpur Convention Centre Complex, Jalan Pinang, Kuala Lumpur City Centre, 50088 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur","Place of Interest");
		myAtts[3] = new Attraction("Central Market", 15.00,  3.1457, 101.6955,4.20, 4.9, "Jalan Hang Kasturi, City Centre, 50050 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", "Place of Interest");
		myAtts[4] = new Attraction("Merdeka Square", 30.00,  3.1478,101.6934, 4.30, 3.9, "Jalan Raja, Kuala Lumpur City Centre, 50050 Kuala Lumpur, Federal Territory of Kuala Lumpur","Landmark");
		myAtts[5] = new Attraction("National Mosque", 25.00, 3.1421, 101.6918, 4.50, 5.9, "Jalan Perdana, Tasik Perdana, 50480 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur","Landmark");
		myAtts[6] = new Attraction("Jamek Mosque", 10.00,  3.1489,101.6956, 3.70, 3.5, " Jalan Tun Perak, City Centre, 50050 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", "Landmark");
		myAtts[7] = new Attraction("Petaling Street Market", 20.00, 3.1457, 101.6955,3.90, 2.5, "Jalan Petaling, City Centre, 50000 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", "Place of Interest");
		myAtts[8] = new Attraction("Lake Gardens", 3.00, 3.1430,101.6847, 4.40, 4.6, "Jalan Kebun Bunga, Tasik Perdana, 55100 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur" ,"Place of Interest");
		myAtts[9] = new Attraction("Sri Mahamariamman Temple", 5.00, 3.1440,  101.6965,4.30, 3.2, "Jalan Tun H S Lee, City Centre, 50000 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur", "Place of Interest");
		
		int	tourOpt = 0;
		do {
			do {
				if(currentUser.isEmpty()) { 
					System.out.println("=====================================");
					System.out.println("||||||Welcome to Tour Me Around!|||||");
					System.out.println("=====================================");
					System.out.println("1. Register ");
					System.out.println("2. Login "); 
					System.out.println("3. Exit ");	
					System.out.println("-------------------------------------------");
					System.out.println("Choose an option to continue..");
					tourOpt = input.hasNextInt()? input.nextInt() : 8;
					String str = input.nextLine(); //clear scan int leak
					switch(tourOpt) {
					case 1:
						register(myUsers, currentUser, input);
						myUsers.add(currentUser.get(0));
						currentUser.get(0).setLatitude(findLat(currentUser.get(0).getLocation()));
						currentUser.get(0).setLongtitude(findLong(currentUser.get(0).getLocation()));
						break;
					case 2:
						loginUser(myUsers, currentUser, input);
						break;
					case 3:
						System.out.println("Exiting program...\nSee you again!");
						System.exit(0);
					default:
						System.out.println("Invalid menu option!");
						break;
					}
				}else {
					printHeader(currentUser.get(0));					
					System.out.println("Your current GPS coordinates: ");
					System.out.println("Lat: " + currentUser.get(0).getLatitude());
					System.out.println("Long: " + currentUser.get(0).getLongtitude());
					System.out.println("===========================================");
					System.out.println("||| TOUR ME AROUND MAIN MENU |||");
					System.out.println("===========================================");	
					System.out.println("1. My itinerary ");
					System.out.println("2. Restaurant suggestions ");	
					System.out.println("3. Hotel suggestions ");	
					System.out.println("4. Attraction suggestions ");
					System.out.println("5. Manage profile ");		
					System.out.println("6. Logout ");					
					System.out.println("7. Exit ");		
					System.out.println("-------------------------------------------");
					System.out.println("Choose an option to continue..");
					tourOpt = input.hasNextInt()? input.nextInt() : 8;
					String str1 = input.nextLine();
					switch(tourOpt) {
					case 1:
						printIt(currentUser.get(0).getMyIt(), currentUser.get(0));
						if(currentUser.get(0).getMyIt().isEmpty() != true) {
							removeDest(currentUser.get(0).getMyIt(), myAtts, currentUser.get(0), input);
						}						
						break;
					case 2:						
						callingRestaurantsOptions(myRests, currentUser); //restaurant menu
						break;
					case 3:
						callingHotelsOptions(myHotels, currentUser); //hotels menu
						break;
					case 4:
						callingAttractionsOptions(myAtts, input, currentUser.get(0).getMyIt(), currentUser, myUsers); //attractions menu
						break;
					case 5:
						manageProfile(input, currentUser.get(0));
						break;
					case 6:
						currentUser.clear();//clear existing sessions for logout
						break;
					case 7:
						System.out.println("Exiting program...\nSee you again!");
						System.exit(0);
					default:
						System.out.println("Invalid main menu option!");
						break;
					}
					
				}								
			}while(currentUser.isEmpty() == true);
		}while(currentUser.isEmpty() == false);
	}
	
	/**
	 * This method is used to print user header whenever user log in 
	 * @param user user object
	 */
	public static void printHeader(User user) {
    	System.out.println("===========================================");
		System.out.println("WELCOME " + user.getUsername() + " !");
    	System.out.println("===========================================");
	}
	
	/**
	 * This method is used to create current user sessions for user login
	 * @param myUsers my users array list
	 * @param currentUser current user stored in array list
	 * @param loginInp login scanner input
	 */
	public static void loginUser(ArrayList<User> myUsers, ArrayList<User> currentUser, Scanner loginInp) {
		String upassword = null;
		String uname = null;
		int count = 0, logged = 0;
		currentUser.clear();
		
			do {				
				if (count > 0)
					System.out.println("Incorrect username or password. Try again!");
				System.out.println("===============================");
				System.out.println("LOGIN");
				System.out.println("===============================");
				System.out.println("Username: ");
				uname = loginInp.nextLine();
				System.out.println("Password: ");
				upassword = loginInp.nextLine();	
				for(User user: myUsers){
					if(user.getUsername().equals(uname) && user.getPassword().equals(upassword)){												
						logged = 1;
						currentUser.add(user);
						System.out.println("Login successful!");
					}else {
						count++;
					}					
				}
			}while(logged != 1);
	}
	
	/**
	 * This method is used to register the user with different fields
	 * @param myUsers my users array list
	 * @param currentUser current user stored in array list
	 * @param input input scanner for registration
	 */
	public static void register(ArrayList<User> myUsers, ArrayList<User> currentUser, Scanner input) {
		System.out.println("=====================================");
		System.out.println("Please register your account: ");
		System.out.println("=====================================");
		System.out.println("Username: ");
		String username = input.nextLine();
		while (searchUser(myUsers, username) == 1) {
			System.out.println("Username existed! Enter username again: ");
			username = (searchUser(myUsers, username) == 1) ? input.nextLine() : username;
			if (searchUser(myUsers, username) == 0)
				break;
		}
		username = (searchUser(myUsers, username) == 1) ? input.nextLine() : username;
		System.out.println("Password: ");
		String password = input.nextLine();		
		double budget = 0;
		do {
			System.out.println("Budget (myr): ");
			System.out.println("Enter 0 if you have no budget");			
			budget = input.hasNextInt() ? input.nextDouble() : -1;
			if (budget >= 0) {
				break;
			}else {
				System.out.println("Invalid budget value!");
				System.out.println((budget == -1) ? "Invalid budget value!\nBudeget set to 0. Please edit your budget in manage profiles!" : "");
			}
		}while(budget < -1);
		
		String str1 = input.nextLine();
		String location = "";
		do {
			System.out.println("Current location: ");
			location = input.nextLine().toLowerCase();		
			String kl  = "kuala lumpur";
			String s  = "selangor";
			boolean kul = Pattern.matches("kuala lumpur", location);  //check if location matches
			boolean sel = Pattern.matches("selangor", location); 
			if ( kul || sel || location.toLowerCase().indexOf(s.toLowerCase()) != -1 || location.toLowerCase().indexOf(kl.toLowerCase()) != -1) {
			   break;
			}else {
				System.out.println("Location is not valid, enter only address in KL or Selangor");
			}
		}while(!(location.equals("kuala lumpur"))|| !(location.equals("selangor")));	
		
		int cOpt = 0;
		String country = "";
		do {
			System.out.println("Where are you from: ");
			System.out.println("1. Malaysia ");
			System.out.println("2. Singapore ");
			System.out.println("3. Taiwan ");
			System.out.println("4. Japan ");
			cOpt = input.hasNextInt() ? input.nextInt() : 0;
			switch(cOpt) {
			case 1:
				country = "Malaysia";
				break;
			case 2:
				country = "Singapore";
				break;
			case 3:
				country = "Taiwan";
				break;
			case 4:
				country = "Japan";
				break;
			default:
				System.out.println("Please enter valid country option.");
		}
		}while(cOpt < 1 || cOpt >4);
		
		User user1 = new User(username, password, location, budget, country, findLat(location.toLowerCase()), findLong(location.toLowerCase()));
		currentUser.add(user1);

	}
	
	/**
	 * This method is used to search for the user base on the username
	 * @param myUsers myUsers array stored in system
	 * @param username user's username
	 * @return found status 
	 */
	public static int searchUser(ArrayList<User> myUsers, String username) {
		int found = 0;
		for(User user: myUsers){
			if(user.getUsername().equals(username)) {
				found = 1;
			}				
		}
		return found;//if found user, return 1
	}
	
	/**
	 * This method is used to add a destination into my itinerary array list
	 * @param myIt my itinerary array list
	 * @param myAtt all destinations array
	 * @param user user object
	 * @param input input from user
	 */
	public static void addDest(ArrayList<Destination> myIt, Destination[] myAtt, User user, Scanner input) {
		int addOpt = 0;
    	System.out.println("Would you like to add any of these destinations to your itinerary?");
    	System.out.println("1. Yes, I would like to add");
    	System.out.println("2. No, I would not like to add any");
    	addOpt = input.nextInt();
    	String str = input.nextLine();
    	if (addOpt == 1) {
        	System.out.println("Enter destination base on numbering from above: ");
        	int ds = input.nextInt();
        	if (myIt.contains(myAtt[ds-1]) == false) {
        		myIt.add(myAtt[ds-1]);
            	System.out.println("Added " + myAtt[ds-1].getTitle() + " to your itinerary plan!\n");
        	}else {
        		System.out.println("The destination has already been added!");
        	}
    	}else if (addOpt == 2){
    		System.out.println("It's okay!");
    	}
    	else {
    		System.out.println("Error adding!");
    	}
	}
	
	/**
	 * This method is used to display the itinerary plan 
	 * @param myIt my itinerary array list
	 * @param user user object
	 */
	public static void printIt(ArrayList<Destination> myIt, User user) {
		double totalCost = 0.0;
		int i=0;
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("=======================================================================");
		System.out.println("\t\t\t||| MY ITINERARY |||");
		System.out.println("=======================================================================");
	    System.out.printf("%-5s %-35s %-35s","NUM", "TITLE" , "COST (MYR)");		  
	    System.out.println();
	    System.out.println("-----------------------------------------------------------------------");

		if (myIt.isEmpty() != true) {
			for(Destination dest: myIt){
				System.out.format("%-5d %-35s %-35s", (i+1) , dest.getTitle() , dest.getPrice());
				System.out.println("");
				totalCost += dest.getPrice();				
				i++;
			}
			System.out.println("===========================================================================================================================================");
			System.out.println("---------------------------------------------------------PLAN DETAILS----------------------------------------------------------------------");
			System.out.println("===========================================================================================================================================");
			double transCost = toDistance(myIt, user);
			System.out.println("\n");
			System.out.println("=======================================================================");
			System.out.println("-----------------------------MORE DETAILS------------------------------");
			System.out.println("=======================================================================");
	    	System.out.println("MY BUDGET : RM " + user.getBudget() + (user.getCountry().equals("Malaysia") ? "" : " / " + convertCash(user, user.getBudget())));
			System.out.println("TOTAL COST : RM " + df.format((totalCost+transCost)) + (user.getCountry().equals("Malaysia") ? "" : " / " + convertCash(user, totalCost)));					
			
			if (user.getBudget() >= totalCost) {
				System.out.println("You are still within budget!");
			}else if (user.getBudget() < totalCost) {
				System.out.println("You have exceeded your budget!");
			}else if (user.getBudget() == 0){
				System.out.println("Well..You don't have a budget. Have a nice trip!");
			}
			System.out.println("=======================================================================");
			System.out.println("-----------------------------------------------------------------------");    	
		}else {
			System.out.println("Itinerary is empty, add some destinations!");
			System.out.println("-----------------------------------------------------------------------");
		}
	}

	/**
	 * This method is used to calculate any amount to the expected currency value base on user details
	 * @param user user object
	 * @param cost the cost
	 * @return converted amount 
	 */
	public static String convertCash(User user, Double cost) {
		DecimalFormat df = new DecimalFormat("#.##");
		double curCash = 0.0;
		String cur = " ";
		if(user.getCountry().toLowerCase().equals("malaysia")) {			
			curCash = cost;
		}else if (user.getCountry().toLowerCase().equals("japan")){
			cur = "YEN";
			curCash = cost * 27.66;
		}else if (user.getCountry().toLowerCase().equals("singapore")){
			cur = "SGD";
			curCash = cost * 0.33 ;
		}else if (user.getCountry().toLowerCase().equals("taiwan")){
			cur = "NTD";
			curCash = cost * 7.47;
		}		
		return df.format(curCash) + " " + cur ;
	}
	
	/**
	 * This method is used to remove destinations from my itinerary array list
	 * @param myIt my itinerary array list
	 * @param myAtt all destinations array
	 * @param user user object
	 * @param input user input
	 */
	public static void removeDest(ArrayList<Destination> myIt, Destination[] myAtt, User user, Scanner input) {
		int rmOpt = 0;
    	System.out.println("Remove destination from my itinerary?");
    	System.out.println("1. Yes");
    	System.out.println("2. No");    	
    	System.out.println("3. Clear all");  
    	rmOpt = input.nextInt();
    	String str = input.nextLine();
    	if (rmOpt == 1) {
        	System.out.println("Enter destination base on numbering (ex:1) from above: ");
        	int ds = input.nextInt();
        	if (myIt.contains(ds-1) == false) {
            	System.out.println(myIt.get(ds-1).getTitle() + " is removed from your itinerary plan!");
        		myIt.remove(ds-1);
            	printIt(myIt, user);
        	}else {
        		System.out.println("The destination is not in your itinerary list!");
        	}
    	}else if (rmOpt == 2){
    		System.out.println("It's okay!");
    	}else if (rmOpt == 3){
    		System.out.println("Removed all destinations!");
    		myIt.clear();
    	}
    	else {
    		System.out.println("Error removing!");
    	}
	}

	/**
	 * This method is used to show more details of the specific destination
	 * @param myAtt all destinations array
	 * @param input user input
	 */
	public static void showMore(Destination[] myAtt, Scanner input) {		
		int ds = 0;
		do {
			System.out.println("Insert destination number to show more details of destination: (0 to exit)");
			ds = input.nextInt();
			String str = input.nextLine();
			if (ds == 0){
				break;
			}
			else if (ds <= -1 || ds > 10)
			{
				System.out.println("Invalid destination choice!");
			}	
			else if (ds > 0 || ds < 11){
				System.out.println("============================================================");
				System.out.println("MORE DETAILS : ");
				System.out.println("============================================================");
				System.out.println("Place: " + myAtt[ds-1].getTitle());
				System.out.println("Address: " + myAtt[ds-1].getAddress());
				System.out.println("Estimated price (MYR): " + myAtt[ds-1].getPrice());
				System.out.println("Ratings: " + myAtt[ds-1].getRatings());				
				System.out.println("------------------------------------------------------------");
			}
					
		}while(ds != 0);		
	}
	
	/**
	 * This method is used to display the attraction menu to call specific functions listed
	 * @param myAtts all destinations array
	 * @param input user input
	 * @param myIt itinerary array
	 * @param currentUser current user stored in array list
	 * @param myUsers users
	 */
	public static void callingAttractionsOptions(Attraction[] myAtts, Scanner input, ArrayList<Destination> myIt, ArrayList<User> currentUser, ArrayList<User> myUsers) {
		int attOpt = 0;
    	do {
    	System.out.println("===========================================");
    	System.out.println("| Attractions | What would you like to do?");
    	System.out.println("===========================================");
    	System.out.println("1. List by attraction type");
    	System.out.println("2. List by price (lowest to highest)");
    	System.out.println("3. List by ratings (highest to lowest)");
    	System.out.println("4. Show all available attractions");
    	System.out.println("5. Go back");    	
    	System.out.println("-------------------------------------------");
    	System.out.println("Choose an option to continue..");

		attOpt = input.hasNextInt()? input.nextInt() : 0; 
    	Destination d1 = new Destination();
    	Attraction a1 = new Attraction();
		String chosenCategory = null;
		
    	switch (attOpt) {
    		case 1:		
    			System.out.println("===========================================");
    			System.out.println("Type of attraction");
    			System.out.println("===========================================");
    	    	System.out.println("1. Landmark");
    	    	System.out.println("2. Place of Interest");
    	    	System.out.println("3. Go back");
    	    	System.out.println("-------------------------------------------");
    	    	System.out.println("Choose an option to continue..");
    	    	int typOpt = input.nextInt();
    			switch(typOpt)
    			{
    			case 1:
    		        chosenCategory = "Landmark";
    		        break;
    			case 2:
    				chosenCategory = "Place of Interest";
    				break;
    			case 3:
    		        break;
    		    default:
    		    	System.out.println("Invalid restaurant type option chosen!\n Returning to attractions menu");
    		    	typOpt = 0;
    		    	break;
    			}
    			a1.filterAttractionsbyCategory(chosenCategory, myAtts, myIt);    			
    			break;
    		case 2:  
    			a1.sortPrice(myAtts);
    			addDest(myIt, myAtts, currentUser.get(0), input);
    			break;    			
    		case 3:   
    			a1.sortRatings(myAtts);
    			addDest(myIt, myAtts, currentUser.get(0), input);
    			break;    			
    		case 4:
    			a1.printAttractions(myAtts);
            	showMore(myAtts, input);
    			a1.printAttractions(myAtts);
    			addDest(myIt, myAtts, currentUser.get(0), input); 
    			break;    			
    		case 5:        			          			
    			break;    		
    		 default:
    	        System.out.println("Invalid attractions menu option.");        			
    		}
    	}while(attOpt != 5);   
	}
	
	/**
	 * This method is used to display the hotel menu and to call the specific functions listed
	 * @param myHotels all hotels array
	 * @param currentUser current user
	 */
	public static void callingHotelsOptions(Hotels[] myHotels, ArrayList<User> currentUser)
	{
		Scanner input = new Scanner(System.in);
		Hotels h1 = new Hotels();
		int option2 = 0;
		
    	do{
        	System.out.println("===========================================");
        	System.out.println("| Hotels | What would you like to do?");
        	System.out.println("===========================================");
        	System.out.println("1. List by hotel stars ");
        	System.out.println("2. List by price (lowest to highest)");
        	System.out.println("3. List by ratings (highest to lowest)");
        	System.out.println("4. Show all available Hotels ");
        	System.out.println("5. Go back ");
        	System.out.println("-------------------------------------------");
        	System.out.println("Choose an option to continue..");
        	option2 = input.nextInt();
        	switch(option2)
        	{
        	case 1:        		
        		h1.filterHotelsbyStar(input, myHotels,  currentUser.get(0).getMyIt());    			
        		break;
        	case 2:
        		h1.sortPrice(myHotels);
        		addDest(currentUser.get(0).getMyIt(), myHotels, currentUser.get(0), input);
        		break;
        	case 3:
        		h1.sortRatings(myHotels);
        		addDest(currentUser.get(0).getMyIt(), myHotels, currentUser.get(0), input);
        		break;        	
        	case 4:
        		h1.printHotels(myHotels);
        		showMore(myHotels, input);
        		h1.printHotels(myHotels);
        		addDest(currentUser.get(0).getMyIt(), myHotels, currentUser.get(0), input);
        		break;
        	case 5:
        		break;
        	default:
    	        System.out.println("Invalid hotels menu option.");        			
        		break;        	
    		}
    	}while(option2 != 5);	
	}
	
	/**
	 * This method is to display the restaurant menu and to call the specific functions listed
	 * @param myRests all restaurants array
	 * @param currentUser current user
	 */
	public static void callingRestaurantsOptions(Restaurants[] myRests, ArrayList<User> currentUser)
	{
		Restaurants r1 = new Restaurants();
		Scanner input = new Scanner(System.in);
		String chosenCategory = null;
		int option = 0;
		int option1 = 0;		
    	do
    	{
        	System.out.println("===========================================");
        	System.out.println("| Restaurants | What would you like to do?");
        	System.out.println("===========================================");
        	System.out.println("1. List by restaurant type ");
        	System.out.println("2. List by price (lowest to highest)");
        	System.out.println("3. List by ratings (highest to lowest)");
        	System.out.println("4. Show all available restaurants ");
        	System.out.println("5. Go back ");
        	System.out.println("-------------------------------------------");
        	System.out.println("Choose an option to continue..");
        	option = input.nextInt();
        	switch(option)
        	{
        	case 1:
            		System.out.println("===========================================");
        			System.out.println("Type of restaurant");
        	    	System.out.println("===========================================");
        	    	System.out.println("1. Fine Dining");
        	    	System.out.println("2. Casual Dining ");
        	    	System.out.println("3. Fast Food");
        	    	System.out.println("4. Go back");
        	    	System.out.println("-------------------------------------------");
        	    	System.out.println("Choose an option to continue..");
        	    	option1 = input.nextInt();
        			switch(option1)
        			{
        			case 1:
        		        chosenCategory = "Fine Dining";
        		        break;
        			case 2:
        				chosenCategory = "Casual Dining";
        				break;
        			case 3:
        				chosenCategory = "Fast Food";
        				break;
        			case 4:
        		        break;
        		    default:
        		    	System.out.println("Invalid restaurant type option chosen!\n"+"Returning to restaurant menu");
        		    	option1 = 0;
        		    	break;
        			}
        			if (option1 > 0 && option1 < 4) {
        				r1.filterRestaurantsbyCategory(chosenCategory, myRests,currentUser.get(0).getMyIt());
        			}        				
        		break;
        	case 2:
        		r1.sortPrice(myRests);
        		addDest(currentUser.get(0).getMyIt(), myRests, currentUser.get(0), input);
        		break;
        	case 3:
        		r1.sortRatings(myRests);
        		addDest(currentUser.get(0).getMyIt(), myRests, currentUser.get(0), input);
        		break;        	
        	case 4: 
        		r1.printRestaurants(myRests);        		
        		showMore(myRests, input); //loop until 0 to exit        		
        		r1.printRestaurants(myRests);
        		addDest(currentUser.get(0).getMyIt(), myRests, currentUser.get(0), input);
        		break;
        	case 5:        		
        		break;
        	default:
    	        System.out.println("Invalid restaurants menu option.");        			
        		break;
    		}

    	}while(option != 5);
	}
	
	/**
	 * This method is used to calculate the distance between two arrays and transportation cost
	 * @param myIt itinerary array list
	 * @param user user object
	 * @return total transportation cost
	 */
	public static double toDistance(ArrayList<Destination> myIt, User user) {
		double temp = 0, btDis = 0, btUser = 0, totalTransCost = 0;
				
        DecimalFormat df = new DecimalFormat("#.##"); 
        ArrayList<Destination> tmpArr = new ArrayList<Destination>();

        System.out.printf("%-5s %-35s %-35s %-20s %-20s %-20s","NUM", "FROM     - " , "TO" ,"DISTANCE(KM)","TRANS TYPE", "TRANS COST (MYR)");
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        
        	if(myIt.size() > 0) {
            	btUser = distance(user.getLatitude(), user.getLongtitude(), myIt.get(0).getLatitude(), myIt.get(0).getLongtitude());
            	System.out.format("%-5d %-35s %-35s %-20s %-20s %-20s",1 , "Your Location ", myIt.get(0).getTitle() , df.format(btUser) ,transFee(btUser)[0] , df.format(Double.parseDouble(transFee(btUser)[1])) );
            	System.out.println("");
        	}
		if(myIt.size() > 0) {
            for(int i = 0; i<myIt.size()-1; i++){
            	if(myIt.size() > 1) {
                    tmpArr.add(myIt.get(i+1));
                    btDis = distance(myIt.get(i).getLatitude(), myIt.get(i).getLongtitude(), tmpArr.get(i).getLatitude(), tmpArr.get(i).getLongtitude());
                    System.out.format("%-5d %-35s %-35s %-20s %-20s %-20s",(i+2) , myIt.get(i).getTitle() ,tmpArr.get(i).getTitle(), df.format(btDis), transFee(btDis)[0] , df.format(Double.parseDouble(transFee(btDis)[1])));
                    System.out.println("");		                 	
                    totalTransCost += Double.parseDouble(transFee(btDis)[1]);                 	
            	}                        	
            }  
            totalTransCost += Double.parseDouble(transFee(btUser)[1]);            
        }        
        return totalTransCost;
	}
	
	/**
	 * This method returns the distance of two locations base on latitude and longtitude
	 * @param lat1 latitude of destination 1
	 * @param lon1 longitude of destination 1
	 * @param lat2 latitude of destination 2
	 * @param lon2 longitude of destination 2
	 * @return
	 */
	public static double distance(double lat1, double lon1, double lat2, double lon2) {
		double theta = lon1 - lon2;
		double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;		
		dist = dist * 1.1609344;
		return (dist);
	}
	
	/**
	 * This method changes the degree to radians
	 * @param deg the degree
	 * @return
	 */
	public static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}
	
	/**
	 * This method changes the radians to degree
	 * @param rad the radian
	 * @return
	 */
	public static double rad2deg(double rad) {
		 return (rad * 180.0 / Math.PI);
	}

	/**
	 * This method returns the latitude of the location
	 * @param location location of user or destination
	 * @return latitude of location 
	 */
	public static double findLat(String location) {
		double lat = 0;
		String[] loc = location.split(", ");
		for( String state : loc) {
			if (state.equals("kuala lumpur")) {
				lat = 3.139;				
			}else if (state.equals("selangor")) {
				lat = 3.073;				
			}
		}
		return lat;
	}
	
	/**
	 * This method returns the longtitude of the location
	 * @param location location of user
	 * @return longtitude of location
	 */
	public static double findLong(String location) {
		double longt = 0;
		String[] loc = location.split(", ");
		for( String state : loc) {
			if (state.equals("kuala lumpur")) {			
				longt = 101.687;
			}else if (state.equals("selangor")) {			
				longt = 101.518;
			}
		}
		return longt;
	}
	
	/**
	 * This method is used to calculate the transportation fee and return the cost base on distance
	 * @param distance distance of 2 destinations
	 * @return transportation cost
	 */
	public static String[] transFee(double distance) {
        ArrayList<String> transFee = new ArrayList<String>();
        String[][] tp = new String[10][10];
        double busFee =0, taxiFee=0, trainFee=0, fee=0;
        String type ="";
        
        busFee = distance * 1.2;
        taxiFee = distance * 2.3;
        trainFee = distance * 1.3;
        
        if(distance <= 1.5) {
        	type = "Walking";
            tp[0][0] = type;
            tp[0][1] = "0";
        }else if(distance <= 3) {
        	type = "Bus";
        	tp[0][0] = type;
            tp[0][1] = Double.toString(busFee);
        }else if(distance <= 5) {
        	type = "Train";
        	tp[0][0] = type;
            tp[0][1] = Double.toString(trainFee);;
        }else if(distance > 5) {
        	type = "Taxi";
        	tp[0][0] = type;
            tp[0][1] = Double.toString(taxiFee);;
        }
        return tp[0];        
    }
	
	/**
	 * This method is used to make changes to the user details
	 * @param input user input
	 * @param user user object
	 */
	public static void manageProfile(Scanner input, User user) {		
		double newBudget = 0.0;
		String newLocation = "";
		int proOpt = 0;
		do {
			System.out.println("===========================================");
			System.out.println("MANAGE PROFILE");
			System.out.println("===========================================");
			System.out.println("1. My profile ");
			System.out.println("2. Edit budget ");
			System.out.println("3. Edit current location ");
			System.out.println("4. Edit country ");
			System.out.println("5. Go back ");
			System.out.println("-------------------------------------------");
			System.out.println("Enter an option... ");
			proOpt = input.nextInt();
			String str = input.nextLine();
			
			switch (proOpt) {
				case 1:
					System.out.println("==========================================================\nUsername: " + user.getUsername() + "\n" + "Current location: " + user.getLocation() + "\nBudget: RM " + user.getBudget() + "\nCountry: " + user.getCountry() + "\n==========================================================");
					break;
				case 2:
					do {
						System.out.println(newBudget < 0 ? "Invalid budget!": "");
						System.out.println("Enter new budget : ");
						newBudget = input.hasNextInt() ? input.nextInt() : 0;
						str = input.nextLine();
						user.setBudget(newBudget);						
					}while(newBudget < 0);					
					break;
				case 3:										
					do {										
						System.out.println(newLocation.length() == 0 ? "": "Invalid location, must be in Kuala Lumpur or Selangor!");
						System.out.println("Enter new location : ");						 
						newLocation = input.nextLine().toLowerCase();	
						String kl  = "kuala lumpur";
						String s  = "selangor";
						boolean kul = Pattern.matches("kuala lumpur", newLocation);  //see if the string matches the location
						boolean sel = Pattern.matches("selangor", newLocation); 
						if ( kul || sel || newLocation.toLowerCase().indexOf(s.toLowerCase()) != -1 || newLocation.toLowerCase().indexOf(kl.toLowerCase()) != -1) {
							user.setLocation(newLocation);
							user.setLatitude(findLat(newLocation.toLowerCase()));
							user.setLongtitude(findLong(newLocation.toLowerCase()));							
						    break;
						}					
					}while(!(newLocation.equals("kuala lumpur"))|| !(newLocation.equals("selangor")));		
					
					break;
				case 4:
					editCountry(input, user);
					break;
				case 5:
					break;
				default:
					System.out.println("Invalid manage profile menu option!");
					break;
			}			
		}while(proOpt != 5);
	}
	
	/**
	 * This method is used to edit the user's country
	 * @param input user input
	 * @param user user object
	 */
	public static void editCountry(Scanner input, User user) {
		int cOpt = 0;
		String country = "";
		do {
			System.out.println("Where are you from: ");
			System.out.println("1. Malaysia ");
			System.out.println("2. Singapore ");
			System.out.println("3. Taiwan ");
			System.out.println("4. Japan ");
			cOpt = input.hasNextInt() ? input.nextInt() : 0;
			switch(cOpt) {
			case 1:
				country = "Malaysia";
				break;
			case 2:
				country = "Singapore";
				break;
			case 3:
				country = "Taiwan";
				break;
			case 4:
				country = "Japan";
				break;
			default:
				System.out.println("Please enter valid country option.");
			}
			user.setCountry(country);			
		}while(cOpt < 1 || cOpt >4);
	}
		
}
