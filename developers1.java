package ML;

public class developers1
{
  String firstName;
  String lastName;
  String degreeLevel;
  String major;
  double experience;

 
      /**
	* developers1 class takes 5 arguments which
	* 
	* @return 	<code>true</code> if the all are called 
        *  <code>false</code> otherwise.
	*/
  
  public developers1(String firstName, String lastName, String degreeLevel, String major, double experience)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.degreeLevel = degreeLevel;
    this.major = major;
    this.experience = experience;

    System.out.println(this.firstName + "," + this.lastName + "," + this.degreeLevel + "," + this.major + "," + this.experience);
  }


}
