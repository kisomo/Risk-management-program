package ML;

public class validators
{
   String firstName;
   String lastName;
   String degreeLevel;
   String major;
   double experience;
  
  public validators(String firstName, String lastName, String degreeLevel, String major, double experience)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.degreeLevel = degreeLevel;
    this.major = major;
    this.experience = experience;

   System.out.println(this.firstName +"," + this.lastName + "," + this.degreeLevel + "," + this.major + "," + this.experience);
  }

}
