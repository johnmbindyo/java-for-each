package devsought.forloop;

public class ForEachLoopExample1 {

    public static void main(String... args) {
        int[] scores = new int[]{75, 55, 67, 88, 52};
        double total = 0;
        for (int score : scores) {
            total += score;
        }
        System.out.println("Total score=>" + total);
        System.out.println("Average score=>" + (total / scores.length));
    }
}
