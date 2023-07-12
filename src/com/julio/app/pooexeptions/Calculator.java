package com.julio.app.pooexeptions;

public class Calculator {

    public double div(int numerator, int divisor) throws DivitionByZeroNoAllowedException {

        if(divisor == 0){
            throw new DivitionByZeroNoAllowedException("Division by zero not allowed");
        }
        return numerator / (double)divisor;
    }

    public double div(String numerator, String divisor) throws DivitionByZeroNoAllowedException, ErrorTryingConvertToIntegerException {
        int num;
        int div;
        try{
            num = Integer.parseInt(numerator);
            div = Integer.parseInt(divisor);
        }catch (NumberFormatException e){
            throw new ErrorTryingConvertToIntegerException("Numerator and Divisor must be numbers type");
        }
        return num / (double)div;
    }
}
