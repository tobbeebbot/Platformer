/**
 * Created by Tobbe on 2017-02-07.
 */
public abstract class fpsCounter {
    private static int counter = 0;
    private static Long last = 0L;
    private static Long delta;
    private static Long elapsed = 0L;

    public static void calculate(Long now) {
        counter++;
        delta = now - last;
        elapsed += delta;
        if (elapsed >= 1000000000) {
            elapsed = 0L;
            System.out.println("FPS: " + counter);
            counter = 0;
        }
        last = now;
    }
}
