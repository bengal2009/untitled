package com.company.Benny;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by blin on 2015/1/7.
 */
public class StackDemo {
    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("入栈(" + a + ")");
        System.out.println("Stack: " + st);
    }

    static void showpop(Stack st) {
        System.out.print("出栈 -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack: " + st);
    }

    public static void main(String args[]) {
        Stack st = new Stack();
        System.out.println("Stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        // 出栈时会有一个EmptyStackException的异常，需要进行异常处理
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("出现异常：栈中内容为空");
        }
    }
}
