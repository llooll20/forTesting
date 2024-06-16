package com.example;

public class App 
{

    public interface IAdder {
        public int add(int a, int b);
    }
    public interface IFlipper {
        public int flip(int a);
    }
    public interface ISubtractor {
        public int subtract(int a, int b);
    }

    public static class Subtractor implements ISubtractor{
        private IAdder adder;
        private IFlipper flipper;
    
        public Subtractor(IAdder adder, IFlipper flipper){
            this.adder = adder;
            this.flipper = flipper;
        }
        public int subtract (int a, int b){
            return adder.add(a, flipper.flip(b));
        }
    }


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println( "\nbuild success!!!" );

    }
}