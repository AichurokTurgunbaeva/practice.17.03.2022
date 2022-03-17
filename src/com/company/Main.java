package com.company;

public class Main {

    public static void main(String[] args) {
        Runable runable = new Runable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        };
        Swimmable swimmable = new Swimmable() {
            @Override
            public void swim() {
                System.out.println("Swimming");
            }
        };
        Walkable walkable = new Walkable() {
            @Override
            public void walk() {
                System.out.println("Walking");
            }
        };
        Abs abs = new Abs() {
            @Override
            void eat() {
                System.out.println("Eating");
            }
        };

        runable.run();
        swimmable.swim();
        walkable.walk();
        abs.eat();

    }

    @FunctionalInterface
    interface Runable {
        void run();
    }

    @FunctionalInterface
    interface Swimmable {
        void swim();
    }

    @FunctionalInterface
    interface Walkable {
        void walk();
    }

    abstract static class Abs {
        abstract void eat();
    }
}
