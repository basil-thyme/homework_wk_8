package displaypattern;

/**Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@*/
public class Exercise8RightAngleTriangle {

    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(" ");
        }


    }

}
