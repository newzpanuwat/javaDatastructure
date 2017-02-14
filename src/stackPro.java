import java.util.*;
public class stackPro {
    public static void main(String args[]) {

        popStack();

    }

    public static void popStack() {
        Stack<String> st = new Stack<>();
        st.push("Thai");
        st.push("Laos");
        st.push("Vietnam");
        st.push("Cambodia");
        st.push("Singapore");

        while (!st.empty()) {
            for(int i = 1;i<=6; i++){

            }
            System.out.println(st.pop());
        }

        System.out.println("Out of stack");

    }

    public static void searchStack(){
        Stack<String> st = new Stack<>();
        st.push("Chealsea");
        st.push("Liverpool");
        st.push("ManCity");
        st.push("Arsenal");
        st.push("Norwich");

        System.out.println(st.peek());

    }
}