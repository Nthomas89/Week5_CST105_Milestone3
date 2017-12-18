/*
 * Program: Milestone 3 (NFL Player Manager)
 * File: NFL_Player_Manager.java
 * Summary: Manages the players in the NFL Draft program
 * Author: Nicholas Thomas
 * Date: December 17, 2017
 * This is my own work
 */

/*
 * All player statistics gathered from - 
 * Statistics. (2017). Retrieved December 16, 2017, from http://www.nfl.com/stats/player
*/

package NFL_Draft_Project;
import java.util.*;

public class NFL_Player_Manager {
	
	//	// creating the list of players
	private static ArrayList<Players> availablePlayers = new ArrayList<Players>();
	@SuppressWarnings("unused")
	private static NFL_Player_Manager test;
	
	public NFL_Player_Manager() {
			createPlayers();
	}
		
	//Generates players and adds them to our list above
	public void createPlayers(){
			Players player0 = new Players("Drew Stanton", "Quarterback", "Arizona Cardinals", 75, 243, 33,
					10, "Michigan State"+"\n");
			Players player1 = new Players("Le'Veon Bell", "Running Back", "Pittsburgh Steelers", 73, 225, 25,
					5, "Michigan State"+"\n");
			Players player2 = new Players("Zack Brown", "Inside Linebacker", "Washington Redskins", 73, 251, 28,
					6, "North Carolina"+"\n");
			Players player3 = new Players("Antonio Brown", "Wide Receiver", "Pittsburg Steelers", 70, 181, 29,
					8, "Central Michigan"+"\n");
			Players player4 = new Players("Calais Campbell", "Defensive End", "Jacksonville Jaguars", 80, 300, 31,
					10, "Miami"+"\n");
			Players player5 = new Players("Darius Slay", "Cornerback", "Detroit Lions", 72, 190, 26,
					5, "Mississippi State"+"\n");
			
			availablePlayers.add(player0);
			availablePlayers.add(player1);
			availablePlayers.add(player2);
			availablePlayers.add(player3);
			availablePlayers.add(player4);
			availablePlayers.add(player5);
		}
		
	//String which shows the names of all the available players
	//! I could Not get my .toSting method to print out the list of players

//	public String toString(){
//		String players = "";
//		
//		for (Players x : availablePlayers){
//			players += x.getName() + "\n";
//		}
//		return players;
//	}
		
	// show all the players and their info on the team
		public static void main(String[] args) {
			test = new NFL_Player_Manager();
			System.out.println("NFL Players" + "\n");
			System.out.println( availablePlayers.toString());
			
		}
}
