public class StringVariable {

    public static void main(String[] args) {

        String name = "Julio";
        System.out.println("name = " + name);
        System.out.println("name.toUpperCase()= " + name.toUpperCase());
        System.out.println("name.toLowerCase()= " + name.toLowerCase());
        System.out.println("name..equals(\"Julio\")= " + name.equals("Julio"));
        System.out.println("name..equals(\"julio\")= " + name.equals("julio"));
        System.out.println("name.equalsIgnoreCase(\"juLio\")= " + name.equalsIgnoreCase("juLio"));
        System.out.println("name..compareTo(\"Julio\")= " + name.compareTo("Julio"));
        System.out.println("name..compareTo(\"JuliO\")= " + name.compareTo("JuliO"));
        System.out.println("name..compareTo(\"uj\")= " + name.compareTo("uj"));
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length()-1));

        /**
         * substring
         */
        System.out.println("name.substring(1) = " + name.substring(1));
        System.out.println("name.substring(3) = " + name.substring(3));
        System.out.println("name.substring(1,4) = " + name.substring(1,4));
        System.out.println("name.substring(3,5) = " + name.substring(3,5));

        /**
         * String variable value trabalenguas
         */
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf(\"2\") = " + trabalenguas.indexOf("2"));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("     trabalenguas = ");
        System.out.println("     trabalenguas = ".trim());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char [] arrayTrabalenguas = trabalenguas.toCharArray();

        for (int index = 0; index < arrayTrabalenguas.length; index++){
            System.out.print(arrayTrabalenguas[index]);
        }

    }
}
