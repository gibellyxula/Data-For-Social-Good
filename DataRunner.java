import java.util.Scanner;
public class DataRunner {
public static void main(String[] args) { 
  
  //Prints out the information into the console
  UserStory d = new UserStory("breed.txt", "breedGroup.txt", "year.txt", "height.txt", "weight.txt");
  d.start();
  }
}