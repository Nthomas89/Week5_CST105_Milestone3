/*
 * Program: NFL Player Class
 * File: Players.java
 * Summary: contains the setters and getters for Player Stats
 * Author: Nicholas Thomas
 * Date: December 16, 2017
 * this work is my own  
 */

package NFL_Draft_Project;

public class Players {
	
	//Declare variables
		String name;
		private String position;
		private String team;
		private int height;
		private int weight;
		private int age;
		private int experience;
		private String college;
		private double BMI;
		private int rookieAge;
		
		//Constructor without parameters
		public Players() {
			super();
		}
		
		//Constructor that accepts all of the variables as parameters except BMI and rookieAge
		public Players(String name, String position, String team, int height, int weight,
				int age, int experience, String college) {
			super();
			this.name = name;
			this.position = position;
			this.team = team;
			this.height = height;
			this.weight = weight;
			this.age = age;
			this.experience = experience;
			this.college = college;
			//BMI and Rookie Age are then called last, due to needing other information in order to process
			this.setBMI();
			this.setRookieAge();
		}
		// getters and setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public String getPosition() {
			return position;
		}
		
		public void setPosition(String position) {
			this.position = position;
		}
		
		public int getHeight() {
			return height;
		}
		
		public void setHeight(int height) {
			this.height = height;
		}
		
		public int getWeight() {
			return weight;
		}
		
		public void setWeight(int weight) {
			this.weight = weight;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}

		public int getExperience() {
			return experience;
		}

		public void setExperience(int experience) {
			this.experience = experience;
		}

		public String getCollege() {
			return college;
		}

		public void setCollege(String college) {
			this.college = college;
		}

		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			this.team = team;
		}

		public double getBMI() {
			return BMI;
		}

		public void setBMI() {
			BMI = (this.weight * .453592) / ((this.height * .0254) * 2);
			BMI = Math.round(BMI * 100.)/100.;
		}

		public int getRookieAge() {
			return rookieAge;
		}

		public void setRookieAge() {
			rookieAge = this.age - this.experience;
		}
		
		//String representation of a player's info
		public String toString(){
			return "Name: " + this.name
					+ "\nAge: " + this.age
					+ "\nPosition: " + this.position
					+ "\nTeam: " + this.team
					+ "\nHeight: " + this.height / 12 + "'" + this.height % 12 + "\""
					+ "\nWeight: " + this .weight
					+ "\nBMI: " + this.BMI
					+ "\nRookie Age: " + this.rookieAge
					+ "\nExperience: " + this.experience + "th season"
					+ "\nCollege: " + this.college;
		}
}