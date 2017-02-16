import javax.swing.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;



public class stackPro {
    public static void main(String args[]) {

        //popStack();
        //searchStack();
        //checkEmptyStack();
        arrayStack();

    }

    public static void popStack() {
        Stack<String> st = new Stack<>();
        st.push("Thai");
        st.push("Laos");
        st.push("Vietnam");
        st.push("Cambodia");
        st.push("Singapore");

        while (!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("Out of stack");

    }
    public static void searchStack() {
        Stack<String> st = new Stack<>();
        st.push("Thai");
        st.push("Laos");
        st.push("Vietnam");
        st.push("Cambodia");
        st.push("Singapore");

        System.out.println("top of stack " + st.peek());
        System.out.println("found Laos at position : " + st.search("Laos"));
        System.out.println("Checking data  Thai in stack ? =  " + st.contains("Thai"));

    }

    public static void checkEmptyStack(){
        Stack<String> st = new Stack<>();
        st.push("Thai");
        st.push("Laos");
        st.push("Vietnam");
        st.push("Cambodia");
        st.push("Singapore");

        while (!st.empty()){
                System.out.println(st.pop());
        }

        System.out.println("Stack st have empty ? = "+ st.empty());

    }

    private static void arrayStack(){
        String data[] = new String[5];
        JTextArea text = new JTextArea();
        Stack<String> st = new Stack<>();

        Scanner sc = new Scanner(System.in);
        for (int j=1;j<data.length;j++){
            System.out.print("Enter data " + " "+(j)+":");
            data[j] = sc.next();
        }

            for(int i =0;i<data.length;i++){
                st.push(data[i]);
            }

            System.out.println(st);

                while (!st.empty()){
                    text.append(st.pop()+"\n");
            }
                JOptionPane.showMessageDialog(null, text, "Result data ", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void reverse(){
        String data[] = new String[5];
        JTextArea text = new JTextArea();
        Stack<String> st = new Stack<>();

        Scanner sc = new Scanner(System.in);
        for (int j=1;j<data.length;j++){
            System.out.print("Enter data " + " "+(j)+":");
            data[j] = sc.nextLine();

            for(int i =0;i<data.length;i++){
                st.push(data[i]);
            }

        }
    }
}