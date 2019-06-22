package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        Calories c = new Calories();
                        
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	
                        	System.out.println(String.format("%.03f",c.calculateCalories(bread)*4.1868)+" kJ of energy generated from "+Math.round(bread*74)/1.0+" calories");
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	System.out.println(String.format("%.03f",c.calculateCalories(bread,jam)*4.1868)+" kJ of energy generated from "+Math.round(((bread*74)+(jam*26)))/1.0+" calories");
                        	
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	System.out.println(String.format("%.03f",c.calculateCalories(bread,jam,butter)*4.1868)+" kJ of energy generated from "+Math.round((bread*74)+(jam*26)+(butter*102))/1.0+" calories");
                        	
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            
            double calculateCalories(int slices) {
            //you have to overload this function for three parameters refer the question
            	return  (Math.round(slices*74)/1.0) ;
            }
            
            double calculateCalories(int slices, int jam) {
                //you have to overload this function for three parameters refer the question
                	return  (Math.round(((slices*74)+(jam*26)))/1.0) ;
                }
            double calculateCalories(int slices, int jam , int butter) {
                //you have to overload this function for three parameters refer the question
                	return  (Math.round((slices*74)+(jam*26)+(butter*102))/1.0) ;
                }
   
}