package com.julio.app.pooexeptions;

import javax.swing.*;

public class MainExeption {

    public static void main(String[] args) {
        String numr =  JOptionPane.showInputDialog("Ingress value numerator");
        String divi =  JOptionPane.showInputDialog("Ingress value divisor");
        Calculator calculator = new Calculator();
        try{
            //int divisor = Integer.parseInt(valor);
            //int div = 10 / divisor;
            //System.out.println("div = " + div);
            //System.out.println((calculator.div(Integer.parseInt(numr), Integer.parseInt(divi))));
            System.out.println((calculator.div(numr,divi)));
        }catch (NumberFormatException nfe){
            System.out.println("nfe = " + nfe);
        }catch (DivitionByZeroNoAllowedException v){
            System.out.println("Error = " + v);
        }
        catch (ArithmeticException ae){
            System.out.println("e.getMessage() = " + ae.getMessage());
        } catch (ErrorTryingConvertToIntegerException e) {
            System.out.println("Error = " + e.getMessage());
        } finally {
            System.out.println("finally try");
        }

        System.out.println("continue code");
    }
}
