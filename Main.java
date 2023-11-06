package CSC205_Week3_Monday;
enum Seasons {SPRING, SUMMER, FALL, WINTER}

public class Main {
    public static void main(String[] args) {
        Seasonslogic();
        Student student1 = new Student();
        student1.FirstName = "Hello";
        student1.LastName ="Kitty";
        student1.GPA =3.0f;
        student1.major = Major.ART;
        
        System.out.println(student1.FirstName);
    }
    public static void Seasonslogic() {   
        Seasons seasons = Seasons.SPRING;
        if(seasons == Seasons.SPRING)
        {
            System.out.println("This is my favorite season");
        }
        else if(seasons == Seasons.WINTER){
            System.out.println("This is my second favorite season");
        }
        else {
            System.out.println("the other seasons are fine");
        }

    }
    
}
        
