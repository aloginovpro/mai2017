package ru.mai.learning.classes.innerclass;

public class Computer {

    int freq;
    Memory memory;

    public static class Memory { //nested class
        int size;
        String model;

//        public int getCompFreq() { //does not have access to context
//            return freq;
//        }
    }

    public class BoostButton { //inner class
        private boolean isPushed;

        public void push() {
            freq += (isPushed ? -10 : 10); //has access to context
            isPushed = !isPushed;
        }

    }

}
