package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int count = 1;
        for (int i = 1; i <= lastPrinted; i++) {
            if (i == lastPrinted) {
                System.out.println(i);
            } else {
                if (count == 3) {
                    count = 1;

                    continue;
                }
                System.out.println(i);
                count++;
            }

        }
    }
}
