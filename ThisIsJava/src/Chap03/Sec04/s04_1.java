package Chap03.Sec04;

public class s04_1 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        if (a && b) {
            System.out.println("a AND b = True");
        } else {
            System.out.println("a AND b = False");
        }

        if (a && c) {
            System.out.println("a AND c = True");
        } else {
            System.out.println("a AND c = False");
        }

        if (c && d) {
            System.out.println("c AND d = True");
        } else {
            System.out.println("c AND d = False");
        }

        if (a || b) {
            System.out.println("a OR b = True");
        } else {
            System.out.println("a OR b = False");
        }

        if (a || c) {
            System.out.println("a OR c = True");
        } else {
            System.out.println("a OR c = False");
        }

        if (c || d) {
            System.out.println("c OR d = True");
        } else {
            System.out.println("c OR d = False");
        }

        if (a ^ b) {
            System.out.println("a XOR b = True");
        } else {
            System.out.println("a XOR b = False");
        }

        if (a ^ c) {
            System.out.println("a XOR c = True");
        } else {
            System.out.println("a XOR c = False");
        }

        if (c ^ d) {
            System.out.println("c XOR d = True");
        } else {
            System.out.println("c XOR d = False");
        }

        if (!a) {
            System.out.println("NOT a = True");
        } else {
            System.out.println("NOT a = False");
        }

        if (!c) {
            System.out.println("NOT c = True");
        } else {
            System.out.println("NOT c = False");
        }
    }
}
