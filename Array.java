// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class Main {
    public static void main(String[] args) {
        double[] temp = { 21.5, 22.3, 23.8, 24.1, 24.9 };
        temp[2] = 22.5;

        for (double t : temp) {
            System.out.println(t);
        }
    }

    // @Test
    // void addition() {
    // assertEquals(2, 1 + 1);
    // }
}