package ru.mai.learning.classes.innerclass;

public class Main {

    //Computer$Memory.class	Computer.class		Main.class

    public static void main(String[] args) {
        Computer.Memory memory = new Computer.Memory();
//        Computer.BoostButton boostButton = new Computer.BoostButton();
        Computer computer = new Computer();
        Computer.BoostButton boostButton1 = computer.new BoostButton();
        Computer.BoostButton boostButton2 = computer.new BoostButton();
    }

}
