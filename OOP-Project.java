import java.util.Scanner;

class Group {
    

    public void display(){
        System.out.println("Activity 3");
        System.out.println("Group Members Personal info: \n");
    }

}
class Villasencio extends Group {

    protected String Fullname = "Villasencio, John Brian N.";
    public int age = 21;
    String address = "Luy-a medellin, cebu";
    protected String gender = "Male";


    public void display(){
        System.out.println("Fullname: "+Fullname);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Gender: "+gender);
        System.out.println("\n");

    }
    
}

class Yaun extends Group {

    protected String Fullname = " Yaun, Joshrael";
    public int age = 26;
    String address = "Antipolo Medellin, Cebu";
    protected String gender = "Male";

    public void display() {

        System.out.println("Fullname: "+Fullname);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Gender: "+gender);
        System.out.println("\n");

    }

}

class Baring extends Group {

    protected String Fullname = "Baring, Junel";
    public int age;
    String address;
    protected String gender;

    public void display() {

        System.out.println("Fullname: "+Fullname);
        System.out.println("Age: 20");
        System.out.println("Address: Medellin, Cebu");
        System.out.println("Gender: Male ");
        System.out.println("\n");

    }

}

class Hijapon extends Group{

    protected String Fullname = "Hijapon, Maridel"; 
    public int age;
    String address;
    protected String gender;

    public void display() {

        System.out.println("Fullname: "+Fullname);
        System.out.println("Age: 23");
        System.out.println("Address:  Daanbantayan, Cebu ");
        System.out.println("Gender: Female");
        System.out.println("\n");


    }
}
class enter extends Group{

    Scanner input = new Scanner(System.in);
    protected String Fullname;
    public int age;
    String address;
    protected String gender;

    public void display() {
        System.out.println("");
        System.out.print("Fullname: ");
        Fullname = input.next();
        System.out.print("Age: ");
        age = input.nextInt();
        System.out.print("Address: ");
        address = input.next();
        System.out.print("Gender: ");
        gender = input.next();
        System.out.println();

    }



}

public class main {

    public static void main(String [] args) {

         Group g = new Group();
        g.display();

        Villasencio v = new Villasencio();
        v.display();

        Yaun y = new Yaun();
        y.display();

        Baring b = new Baring();
        b.display();

        Hijapon h = new Hijapon();
        h.display();


        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to enter your own info? type \"Yes\" or \"No\". ");
        System.out.print("Enter your choice: ");
        String choice = input.next();
        
        switch(choice) {

            case "Yes":
            System.out.print("How many do you want to create? ");
            int num = input.nextInt();

            int[] arr;
            for (int i = 0; i < num; i++) {
                
                enter e = new enter();
                e.display();

            }

            if (num == num) {
                System.out.println("Program finished!");
            }
            break;
            
            case "No":
            System.out.println("Program Closed.");

        }
    }
    
}