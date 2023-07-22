package com.julio.app.lambda;

import com.julio.app.lambda.models.User;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ExamplePredicate {

    public static void main(String[] args) {

        Predicate<Integer> pGreater = number -> number > 2;
        System.out.println("pGreater.test(3) = " + pGreater.test(3));

        BiPredicate<String, String> pComp2Strings = String::equals;
        System.out.println("pComp2Strings.test(\"marco\", \"marco\") = " + pComp2Strings.test("marco", "marco"));
        System.out.println("pComp2Strings.test(\"marco\", \"marco2\") = " + pComp2Strings.test("marco", "marco2"));


        User u1 = new User();
        User u2 = new User();
        u1.setName("manuel");
        u2.setName("manuel");

        BiPredicate<User, User> pUser = (user, user2) -> user.getName().equals(user2.getName());
        System.out.println("pUser.test(u1,u2) = " + pUser.test(u1,u2));

    }
}
