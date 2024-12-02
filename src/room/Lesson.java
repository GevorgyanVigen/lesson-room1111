package room;

//bug
public class Lesson {
    public static void main(String[] args) {

        int x = 1;

        switch (x) {
            case 1, 3, 5:
                System.out.println("dasi enq");
                break;
            case 2, 4, 6:
                System.out.println("azat enq");
                break;
            case 7:
                System.out.println("kiraki");
                break;
            default:
                System.out.println("aydpisi or chka");
        }

    }
}
