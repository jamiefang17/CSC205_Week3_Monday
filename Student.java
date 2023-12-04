package CSC205_Week3_Monday;

public class Student {
    private String FirstName, LastName;

    public String getFirstName() {
        return FirstName;
    }
    public void SetFirstName(String NewName) {
        FirstName = NewName.toLowerCase();
    }
    public String getLastName() {
        return LastName;
    }
    public void SetLastName(String NewName) {
        LastName = NewName.toUpperCase();
    }
    float GPA;
    Major Major;
    boolean isVeteran;

    public void PrintNames() {
        System.out.println(FirstName + " " + LastName);
    }

    public String toString() {
        return "First Name: " + FirstName + " Last Name: " + LastName;
    }

    public void ChangeNameAndMajor(String LastName, Major Major) {
        this.LastName = LastName;
        this.Major = Major;
    }

    public void ChangeNameAndMajor(String FirstName ,String LastName, Major Major) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Major = Major;

    }
}