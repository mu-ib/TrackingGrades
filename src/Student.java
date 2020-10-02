public class Student {
    String name;
    double total, average;
    //declare arrays for the tests and averages
    double[][] tests;
    //class constructor
    public Student(String studentName){
        name = studentName;
    }
    //user enter's grades for the tests
    public void inputGrades(double[][] testScores){
        tests = testScores;
    }
    //return student's average
    public double getAverage(int i){
        total = 0;
        //nested for loop to figure out the total and then the average of the scores
        for(int j = 0; j < tests[i].length; j++){
            total += tests[i][j];
            average = total/tests[i].length;
        }

        return average;
    }
    public String toString(){
        return name + "'s average for these tests: ";
    }
}
