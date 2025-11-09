public class coursework1AverageGrades {

    static int[] average_grades(int grades[][], int weights[]) {
        int numberOfStudents = grades.length;
        int numberOfComponents = weights.length;

        int[] results = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            int total = 0;
            for (int j = 0; j < numberOfComponents; j++) {
                total += grades[i][j] * weights[j];
            }
            results[i] = total / 100;
        }

        return results;
    }

    public static void main(String[] args) {
        int[][] grades = { {31, 44, 54}, {0, 56, 63} };
        int[] weights = {20, 50, 30};
        int[] result = average_grades(grades, weights);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
