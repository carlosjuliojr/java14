import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        String result ="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name 1");
        String name1= scanner.nextLine();

       System.out.println("Insert name 2");
        String name2= scanner.nextLine();

        System.out.println("Insert name 3");
        String name3= scanner.nextLine();

        Character upC =  name1.charAt(1);
        String last2Characters = String.valueOf(name1.toCharArray(),name1.length() - 2,2);
        name1 = upC.toString().toUpperCase().concat(".").concat(last2Characters);

        last2Characters = String.valueOf(name2.toCharArray(),name2.length() - 2,2);
        name2 = upC.toString().toUpperCase().concat(".").concat(last2Characters);

        last2Characters = String.valueOf(name3.toCharArray(),name3.length() - 2,2);
        name3 = upC.toString().toUpperCase().concat(".").concat(last2Characters);

        result = name1.concat("_").concat(name2).concat("_").concat(name3);

        System.out.println(result);
    }
}
