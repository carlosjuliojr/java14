package com.julio.app.pooabstractclass.form;

import com.julio.app.pooabstractclass.form.elements.*;
import java.util.Arrays;
import java.util.List;

/**
 * The type Main form.
 */
public class MainForm {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        InputForm username = new InputForm("username", "text");
        InputForm password = new InputForm("password", "text");
        InputForm email = new InputForm("email", "text");
        InputForm age = new InputForm("age", "text");

        TextAreaForm experience = new TextAreaForm("exp", 5, 9);
        experience.setValue("... more than 29 years of experience");

        SelectForm language = new SelectForm("language");

        Option java = new Option(1, "java", true, "1");
        language.addOptions(java)
                .addOptions(new Option(2, "python", false, "2"))
                .addOptions(new Option(3, "javascript", false, "3"))
                .addOptions(new Option(4, "typescript", false, "4"))
                .addOptions(new Option(5, "PHP", false, "5"));

        username.setValue("carlosjuliojr");
        password.setValue("12312321312");
        email.setValue("carlosjuliojr@hotmail.com");
        age.setValue("30");

        List<ElementForm> elementForms = Arrays.asList(
                username, password, email, age, experience, language
        );

        System.out.println("*********************************************************");
        System.out.println("********************Print html***************************");
        System.out.println("*********************************************************");

        elementForms.forEach(x -> System.out.println(x.drawHtml()));

        /**
         * Anonymous class
         */

        System.out.println("*********************************************************");
        System.out.println("****************Anonymous class*************************");
        System.out.println("*********************************************************");

        ElementForm anonimClass = new ElementForm("Hello this is class anonim") {
            @Override
            public String drawHtml() {
                System.out.println("value = " + name);
                return null;
            }
        };

        anonimClass.drawHtml();


    }
}
