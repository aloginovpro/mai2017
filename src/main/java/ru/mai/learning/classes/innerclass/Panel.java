package ru.mai.learning.classes.innerclass;

public class Panel {

    String inputTextLogin = "admin";

    //    Button confirmButton = new ConfirmButton();
    Button confirmButton = new Button() { //anonymous class - Panel$1.class
        public void onClick() {
            System.out.println("confirmed: " + inputTextLogin);
        }
    };

    Object myObj = new Object() {
        public void doSmt() {
            System.out.println("doing smt");
        }
    };


    public static void main(String[] args) {
        Panel panel = new Panel();
        panel.confirmButton.onClick();

//        panel.myObj.doSmt();

        Object o = new Object() {
            @Override
            public String toString() {
                return "i'm anonymous!";
            }
        };
        System.out.println(o.toString());

    }

//    private class ConfirmButton implements Button {
//        public void onClick() {
//            System.out.println("confirmed");
//        }
//    }

}
