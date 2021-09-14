package com.data_structure.stack;

import java.util.ArrayList;

class StackTest<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T data) {
        stack.add(data);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }
}

public class ExStack1 {
    public static void main(String[] args) {
        StackTest<Integer> st = new StackTest<>();

        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
