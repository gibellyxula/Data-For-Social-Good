public class DogInfo {
  
//Instance variables
private String breed; //name of the breed
private String breedGroup; //type of breed
private int year;  //the minimum lifespan of the dog
private int height;  //max height
private int weight;  //max weight

  /**
   * Parameterized constructor for 
   * breed name, breed group, year, height, and weight
   * instance variables
   */
public DogInfo(String breed, String breedGroup, int year, int height, int weight){
  this.breed = breed;
  this.breedGroup = breedGroup;
  this.year = year;
  this.height = height;
  this.weight = weight;
}

  /**
   * Accessor methods for all of the 
   * instance variables defined earlier
   * in the program
   */
public String getBreed(){
  return breed;
}
  public String getBreedGroup(){
  return breedGroup;
}
  public int getYear(){
  return year;
}
  public int getHeight(){
  return height;
}
  public int getWeight(){
  return weight;
}

  /**
   * Overrides original texts to improve
   * readability
   */
public String toString(){
  return "---------------------\n"+"\nBreed: " 
    + breed + "\nGroup: " 
    + breedGroup + "\nLifespan: " 
    + year + " years\n" + "Height: " 
    + height + " inches \n" + "Weight: " 
    + weight + " pounds";
} 

}