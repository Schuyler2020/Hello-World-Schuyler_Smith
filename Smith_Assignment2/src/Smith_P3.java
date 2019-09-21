import java.util.*;
public class Smith_P3{
   public static void main(String args[]){
	 //important topics to me 
       String[] topic={"Global warming","Teaching coding at a young age","Bring manufacturing jobs back to the USA","Becoming more reliant on sustainable energy sources","Switching to electric cars"}; 
       int[][] voterresp=new int[5][11];
       
       //loop to get generate voter responses
       for(int i=0;i<4;i++){
           for(int j=1;j<=10;j++){
               voterresp[i][j]=0;  
           }
       }
       
       int noofPeople;
       
       //takes an input of how many people there are
       System.out.print("How many people are voting today? ");
       Scanner scnr=new Scanner(System.in);
       noofPeople=scnr.nextInt();
       
       //outputs the scale system letting the voters know the scale from a 1 to 10
       System.out.println("On a scale of 1(least) to 10(most) how important is each topic to you  ");
       int i=1;
       
       //while loop to get voter response while also printing out the topic
       while(i<=noofPeople){
           for(int j=0;j<5;j++){
               System.out.print("Voter #"+i+"How important is "+topic[j]+" to you: ");
               int x=scnr.nextInt();
               voterresp[j][x]=voterresp[j][x]+1;
           }
           i++;
       }
       
       System.out.println("Topic: "+"Average rating:");
       int most_points=0, Smallest_points=100000,Biggest_topic=0,Smallest_topic=0;
       for(i=0;i<5;i++)
       {
           int total=0,count=0;
           for(int j=1;j<=10;j++)
           {
               total=total+j*voterresp[i][j];
               count=count+voterresp[i][j]; 
           }
           if(most_points<total)
           {  
               most_points=total;
               Biggest_topic=i;
           }
           if(Smallest_points>total)
           {  
               Smallest_points=total;
               Smallest_topic=i;
           }
           System.out.println(topic[i]+": "+(total+0.0)/count);
       }
       
       System.out.println("Highest rated topic: "+" Total amount of points:");
       System.out.println(topic[Biggest_topic]+": "+most_points);
       
       System.out.println("Lowest rated topic: "+" Total amount of points: ");
       System.out.println(topic[Smallest_topic]+": "+Smallest_points);
       
       scnr.close();
   }
}