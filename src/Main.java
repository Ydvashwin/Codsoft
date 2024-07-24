import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of subject:");
        int numSubjects=scanner.nextInt();
        int[] marks = new int[numSubjects];
        for (int i = 0; i<numSubjects; i++){
            System.out.print("Enter marks for subjects"+ " " +(i+1)+ "(out of 100):");
            marks[i]= scanner.nextInt();
        }
        int totalMarks=0;
        for (int mark:marks){
            totalMarks +=mark;
        }
        double averagePercentage=(double) totalMarks/numSubjects;
        String grade;
        if (averagePercentage>=90){
     grade = "A";
        } else if (averagePercentage>=80){
            grade="B";
        }else if (averagePercentage>=70){
            grade="C";
        }else if (averagePercentage>=60){
            grade="E";
        }else{
            grade="F";
        }
        System.out.println("TotalMarks:"+totalMarks);
        System.out.println("AveragePercentage:"+String.format("%.2f",averagePercentage)+"%");
        System.out.println("Grade:"+grade);
    }

}