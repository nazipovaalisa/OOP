package com.company;

import polimorfizm.A;
import polimorfizm.B;
import polimorfizm.C;
import polimorfizm.I;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int start = 1;
        int end = 10;
        System.out.println("Введите число");
        int a = in.nextInt();
        try{
            if (a<start || a>end)
                throw new NumberException("Число выходит за пределы диапазона!", start, end);
        }
        catch (NumberException ex){
            System.out.println(ex.getMessage());
            System.out.printf("[%d , %d]",ex.getStart(), ex.getEnd());
        }
    }
    static class NumberException extends Exception{
        private int start;
        private int end;
        public int getStart(){
            return start;
        }
        public int getEnd(){
            return end;
        }
        public NumberException(String message, int start, int end){
            super(message);
            this.start = start;
            this.end = end;
        }
    }
}
