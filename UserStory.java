import java.util.Scanner;
public class UserStory {
/**
* Our User Story:
* As a young woman searching for her first ever dog,
* I want to find the perfect dog for me,
* so that I can fullfill my childhood dreams of having the perfect companion.
*/
private DogInfo[] data;
  /**
   * This is our parameterized constructor and allows for us to
   * make a UserStory object
   */
    public UserStory(String breedFile, String breedGroupFile, String yearFile, String heightFile, String weightFile){
      data = createData(breedFile, breedGroupFile, yearFile, heightFile, weightFile);
  }
  
  /**
   * This creates the 1D array for the information about the dog 
   * based on what the user inputs
   */
 public DogInfo[] createData (String breedFile, String breedGroupFile, String yearFile, String heightFile, String weightFile){
   //reads through our text files to get the information about the dogs
   String [] breedData = FileReader.toStringArray(breedFile);
   String [] breedGroupData = FileReader.toStringArray(breedGroupFile);
   int [] yearData = FileReader.toIntArray(yearFile);
   int [] heightData = FileReader.toIntArray(heightFile);
   int [] weightData = FileReader.toIntArray(weightFile);
   
   DogInfo[] info = new DogInfo [breedData.length];
      for (int index = 0; index < breedData.length; index++) {
      info[index] = new DogInfo(breedData[index], breedGroupData[index], yearData[index], heightData[index], weightData[index]);
    }

    return info;
  }

  /**
   * Tells the user to type a dog breed name in order for
   * the program to continue
   */
  public void start() {
    Scanner input = new Scanner(System.in);
    System.out.println("List of dog breeds: "+"\n-----------------------------------------------------");
    System.out.println("(Affenpinscher, Afghan Hound, Airedale Terrier, Akbash Dog, Akita, Alapaha Blue Blood Bulldog, Alaskan Husky, Alaskan Malamute, American Eskimo Dog, American Foxhound, American Pit Bull Terrier, American Water Spaniel, Anatolian Shepherd Dog, Australian Kelpie, Australian Shepherd, Azawakh, Basenji, Basset Bleu de Gascogne, Beagle, Beauceron, Bedlington Terrier, Belgian Malinois, Belgian Tervuren Bernese Mountain Dog, Black and Tan Coonhound, Bloodhound, Bluetick Coonhound, Boerboel, Border Terrier, Boston Terrier, Bouvier des Flandres, Boxer, Boykin Spaniel, Bracco Italiano, Briard, Brittany, Bullmastiff, Cairn Terrier, Cane Corso, Cardigan Welsh Corgi, Catahoula Leopard Dog, Caucasian Shepherd (Ovcharka), Cavalier King Charles Spaniel, Chinese Crested, Chinook, Chow Chow, Clumber Spaniel, Cocker Spaniel, Coton de Tulear, Dalmatian, Dogo Argentino, English Shepherd, English Springer Spaniel, Eurasier, Field Spaniel, Finnish Lapphund, German Pinscher, German Shepherd Dog, German Shorthaired Pointer, Giant Schnauzer, Glen of Imaal Terrier, Golden Retriever, Gordon Setter, Great Dane, Great Pyrenees, Greyhound, Harrier, Havanese, Irish Setter, Irish Wolfhound, Italian Greyhound, Japanese Chin, Keeshond, Komondor, Kuvasz, Labrador Retriever, Lagotto Romagnolo, Leonberger, Lhasa Apso, Maltese, Miniature Schnauzer, Newfoundland, Norfolk Terrier, Papillon, Pembroke Welsh Corgi, Pharaoh Hound, Plott, Pug, Redbone Coonhound, Rhodesian Ridgeback, Rottweiler, Samoyed, Schipperke, Scottish Deerhound, Shih Tzu, Silky Terrier, Soft Coated Wheaten Terrier, Spanish Water Dog, Vizsla, Weimaraner, Welsh Springer Spaniel, West Highland White Terrier, Whippet, Wirehaired Pointing Griffon, Yorkshire Terrier)");
    System.out.println("-----------------------------------------------------" + "\nType a dog breed to learn more about them: ");
    String choice = input.nextLine();

    printInfoForDog(choice);
    
    input.close();
  }
  
  /**
   * Goes through the breeds to get the info
   * for the dog based on what the user inputted
   */
  public void printInfoForDog(String breed) {
    // Create a Dog variable
    DogInfo foundDog = null;
    //Enhanced for loop 
    for (DogInfo dog : data){
      if(dog.getBreed().equals(breed)){
        System.out.println(dog);
      }
    }
  }

  /**
   * Overrides the text to make it 
   * easier to read
   */
public String toString() {
    String result = "";
    for (DogInfo name : data) {
      result += name + "\n";
    }
    return result;
  }
}