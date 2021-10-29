package hw3;

public class RandomTest {
    public static void main(String[] args) {
        // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        while (true) {
            // Min + (int)(Math.random() * ((Max - Min) + 1))
            int rand = (int) (Math.random() * 101);
            System.out.println(rand);
            if (rand == 100) {
                break;
            }
        }
    }
}
