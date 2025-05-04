
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> pointz;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.pointz = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.pointz.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        double average = 0.0;
        int numberOfGrades = this.grades.size();
        int sum = sumOfNumbers(this.grades);

        if(numberOfGrades > 0){
            average = 1.0 * sum / numberOfGrades;
        } 
        if(this.grades.isEmpty() || this.grades.size() == 0){
            average = -1;
        }
        return average;
    }

    public int sumOfNumbers(ArrayList<Integer> grades) {
        int sum = 0;
        for(Integer grade : grades){
            sum += grade;
        }
        return sum;
    }

    public double averageOfPoints() {
        double average = 0.0;
        if (this.pointz != null && !this.pointz.isEmpty()) {
            int numberOfGrades = this.pointz.size();
            int sum = sumOfNumbers(this.pointz);
            average = 1.0 * sum / numberOfGrades;
        } else {
            average = -1;
        }
        return average;
    }
}
