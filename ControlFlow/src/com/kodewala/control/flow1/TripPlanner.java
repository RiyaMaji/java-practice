package com.kodewala.control.flow1;

public class TripPlanner {
	public String suggestPLan(String src , String dest, int budget) {
		String suggestion = null;
		if(budget <= 1000) {
			suggestion ="You can be in home only!!!";
			System.out.println(suggestion);
		}
		else if(budget > 1000 && budget <=3000)
		{
			suggestion = "You can visit within the city...." ;
			System.out.println(suggestion);
		}
		else if(budget> 3000 && budget <= 5000) {
			suggestion ="You can hire taxi and visit near by places..." ;
			System.out.println(suggestion);
		}
		else {
			suggestion = " You can visit goa!!" ;
			System.out.println(suggestion);
		}
		
		return suggestion;
	}

}
