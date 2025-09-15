import java.util.Scanner;

public class MAD_LIBS {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String Adjective1;
        String Noun1;
        String Adjective2;
        String verb1;
        String Adjective3;

        System.out.println("Enter an Adjective(Description):");
        Adjective1=obj.nextLine();
        System.out.println("Enter a Noun(animal or person):");
        Noun1=obj.nextLine();
        System.out.println("Enter an Adjective(Description):");
        Adjective2=obj.nextLine();
        System.out.println("Enter a Verb end with -ing(action):");
        verb1=obj.nextLine();
        System.out.println("Enter the Adjective(Description):");
        Adjective3=obj.nextLine();


        System.out.println("One"+Adjective1 +"day");
        System.out.println("A "+Noun1 +"appeared in the village. ");
        System.out.println("Everyone was surprised because it looked so "+ Adjective2);
        System.out.println("Suddenly, it started to " + verb1 +",and the people couldn’t believe their eyes.");
        System.out.println("By the end of the day, the whole village felt "+ Adjective3 + ", remembering the strange event.");
    }
}
