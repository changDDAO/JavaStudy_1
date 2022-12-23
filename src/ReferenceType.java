public class ReferenceType {
    public static void main(String[] args) {
        int[] scores = {83, 90, 57};
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double avg = (double) sum/3;
        System.out.println(avg);
        //안다고 자만하지말고 기초부터 튼튼하게
    }
}
