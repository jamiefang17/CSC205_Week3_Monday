package CSC205_Week3_Monday;
/**
 * Main
 */
public class Main {

    
    public static void main(String[] args) {
        SeasonsLogig();
        CarLogic();
        StudentLogic();

        

        
       
        

    }
    public static void SeasonsLogig() {
        Seasons seasons = Seasons.SPRING; 

        if(seasons == Seasons.SPRING) {
            System.out.println("This is my favorite season!");
        } else if(seasons == Seasons.FALL) {
            System.out.println("I love fall");
        } else {
            System.out.println("Yea this one is okay I guess");
        }
    }
    public static void CarLogic() {
        Car car1 = new Car();
        car1.Milage = 50000;
        car1.Bodystyle = BodyStyle.SEDAN;
        car1.CarMake = Make.FORD;
        Car car2 = new Car();
        car2.Milage = 75000;
        car2.Bodystyle = BodyStyle.VAN;
        car2.CarMake = Make.TOYOTA;
        Car car3 = new Car();
        car3.Milage = 125000;
        car3.Bodystyle = BodyStyle.TRUCK;
        car3.CarMake = Make.GMC;
        System.out.println(car1.CarMake);
        System.out.println(car2.CarMake);
    }
    public static void StudentLogic() {
        Student student1 = new Student();
        student1.SetFirstName("Kurt");
        student1.SetLastName("Vonnegut");
        student1.GPA = 4.0f;
        student1.Major = Major.ART; 
        Student student2 = new Student();
        student2.SetFirstName("Ernest");
        student2.SetLastName("Hemingway");
        student1.PrintNames();
        System.out.println(student2);
        student1.ChangeNameAndMajor("Vonnie", Major.MATHMATICS);
        System.out.println(student1 + " " + " Major: " + student1.Major);
    }
}