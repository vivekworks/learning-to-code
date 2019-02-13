package warmup;

public class GradingStudents {
    public static int[] gradingStudents(int[] grades) {
        for(int i=0; i<grades.length;i++)
            grades[i]=grades[i]>37 ? (grades[i]+(grades[i]%5 > 2 ? (5-(grades[i]%5)) : 0)) : grades[i];
        return grades;
    }
}
