package LittleTests;


public class Salmon {
    int count;

    public void Salmon() {
        count = 4;
    }

    public static void main(String[] args) {
        Salmon s = new Salmon();
        System.out.println(s.count);
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println(x);
        System.out.println(y);
    }
}

