package Maping;

import java.util.Stack;

class Stack1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack<String> animal = new Stack();
        animal.push("Dog");
        animal.push("Cat");
        animal.push("Tiger");
        System.out.println("Animal in stack are"+animal);
        System.out.println("peek Operation : "+animal.peek());
        System.out.println("Pop operation : "+animal.pop());
        System.out.println("New Animal stack :"+animal);

    }

}
