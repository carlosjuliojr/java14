import java.io.IOException;
import java.util.Map;

public class EnvVariables {
    public static void main(String[] args) {
        Map<String,String > varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);
        System.out.println("varEnv.get(\"USERNAME\") = " + varEnv.get("USERNAME"));
        System.out.println("varEnv.get(\"JAVA_HOME\") = " + varEnv.get("JAVA_HOME"));
        System.out.println("varEnv.get(\"TEMP\") = " + varEnv.get("TEMP"));

        /**
         * Runtime
         */

        Runtime rt = Runtime.getRuntime();
        Process process;


        try {
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")){
                process = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("Mac")) {
                process = rt.exec("textedit");
            } else
                process = rt.exec("other");
            
            process.waitFor();


        }catch (Exception e){
            System.out.println("e = " + e);
            System.exit(1);
        }
        System.out.println("se ha cerrado el editor");
        System.exit(0);


    }
}
