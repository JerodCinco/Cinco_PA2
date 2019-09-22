import java.util.Scanner; //needed to use scanner 

public class poll {

	/*
	 * Write a simple polling program that allows users to rate five topics from 1
	 * (least important) to 10 (most important). Pick five topics that are important
	 * to you (e.g., political issues, global environmental issues, food, video
	 * games). Use a one-dimensional array topics (of type String) to store the five
	 * issues. To summarize the survey responses, use a 5-row, 10-column
	 * two-dimensional array responses (of type int), each row corresponding to an
	 * element in the topics array. When the program runs, it should ask the user to
	 * rate each issue. Multiple people should be able to respond to the survey
	 * during a single run of the program. Once all responses have been logged, have
	 * the program display a summary of the results, including:
	 * 
	 * 1. A tabular report with the five topics down the left side and the 10
	 * ratings across the top, listing in each column the number of ratings received
	 * for each topic.
	 * 
	 * 2.To the right of each row, show the average of the ratings for that issue.
	 * 
	 * 3.Which issue received the highest point total? Display both the issue and
	 * the point total.
	 * 
	 * 4.Which issue received the lowest point total? Display both the issue and the
	 * point total.
	 */

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		//Use a one-dimensional array topics (of type String) to store the five issues.
		
		String[] topics = {"Political issues", "Global issues", "Financial Issues", "Sports Issues", "Celebrity Issues" };
		
		/*To summarize the survey responses, use a 5-row, 10-column two-dimensional array responses (of type int),
		 *  each row corresponding to an element in the topics array.
		*/
		int [][]ratings = new int [topics.length][]; 
			
		int i; //delcaration of i and j for loop counters 
		int j;
        int num_people;
        int rating;
	  
        for(i=0;i<ratings.length;i++){

        ratings[i] = new int[10];
        	for( j=0;j<ratings[i].length;j++)
                      ratings[i][j] = 0;
               }
        
        System.out.print("How many people are rating?: ");
        num_people = in.nextInt();
        
        for(i=0;i<num_people;i++){

        System.out.println("From 1-10 rate the importance of the topics below: ");
        	for(j=0;j<topics.length;j++){
        			  System.out.print("How important are "+topics[j]+"?: ");
        			  rating = in.nextInt();
        			  while(rating < 1 || rating > 10){ //just in case user inputs anything outside 1-10
        			  System.out.println("Rating should be between [1,10]");
        			  System.out.print("Enter your rating for "+topics[j]+" : ");
        			  rating = in.nextInt();
        			  }
        			  ratings[j][rating-1]++; // increment the corresponding rating entry
        			  }
        	  }
        
        /*	2.To the right of each row, show the average of the ratings for that issue.
         * 
        */
        
        int avg_rating[] = new int[topics.length];
        String highest_point_issue="" , lowest_point_issue="" ;
        int highest_point_total = 0 , lowest_point_total= 0;
        
        for(i=0;i<ratings.length;i++){
        	avg_rating[i] = 0;
        		for(j=0;j<ratings[i].length;j++)
        			avg_rating[i] += (ratings[i][j]*(j+1));
        				if(i == 0) { //for first entry initialize the variables
        					highest_point_total = avg_rating[i];
        					lowest_point_total = avg_rating[i];
        					highest_point_issue = topics[i];
        					lowest_point_issue = topics[i];
        				}
        				else{
        					if(avg_rating[i] > highest_point_total){
        						highest_point_issue = topics[i];
        						highest_point_total = avg_rating[i];
        					}
        					if(avg_rating[i] < lowest_point_total){
        						lowest_point_issue = topics[i];
        						lowest_point_total= avg_rating[i];
        					}
        					}
        					avg_rating[i] = avg_rating[i]/num_people;

        }
        
        System.out.printf("\n%-20s","");
        for(i=0;i<10;i++)
        	System.out.printf("%-10d",(i+1));
        	System.out.printf("%20s","Average Rating");
        	System.out.println();
        	for(i=0;i<ratings.length;i++){
        		System.out.printf("\n%-20s",topics[i]);
        			for(j=0;j<ratings[i].length;j++) {
        				System.out.printf("%-10d",ratings[i][j]);
        			}
        		System.out.printf("%20d",avg_rating[i]);

        }

        	/*3.Which issue received the highest point total? Display both the issue and the point total
            4.Which issue received the lowest point total? Display both the issue and the point total.		
            */
        	System.out.println("\nHighest Point total : "+highest_point_total+" Issue : "+highest_point_issue);
        	System.out.println("Lowest Point total : "+lowest_point_total+" Issue : "+lowest_point_issue);
    
	} //brace for main

} //brace for class
