package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> stack = new Stack<Coin>();
        stack.push(new Coin(10));
        stack.push(new Coin(20));
        stack.push(new Coin(40));
        stack.push(new Coin(50));

        while(!stack.isEmpty()) {
            Coin coin = stack.pop();
            System.out.println("꺼냄 :" + coin.getValue());
        }
    }
}
