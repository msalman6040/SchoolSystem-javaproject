public class SchoolSystem{
    public static void main(String args[]){
        Student Joseph = new Student(4, "Calculus", 99, "AP Biology", 100, "AP Literature", 94, "AP Weights", 76, "AP American History", 60, "Metal class", 100);
        Joseph.Declaration();
        Joseph.Passed();
    }
}
class SchoolMember{
    String Name;
    char Gender;
    int Height;
    int Weight;
    int Attendance;
    public SchoolMember(){
        System.out.println("default school member constructor passed.");
    }
    public SchoolMember(String name, char gender, int height, int weight, int attendance){
        Name = name;
        Gender = gender;
        Height = height;
        Weight = weight;
        Attendance = attendance;
    }
    void Declaration(){
        System.out.println("This person is a school member.");
    }
}
class Student extends SchoolMember{
    int StudentYear;
    String Math;
    int MathGrade;
    String Science;
    int ScienceGrade;
    String English;
    int EnglishGrade;
    String PhysicalEducation;
    int PhysicalEducationGrade;
    String History;
    int HistoryGrade;
    String ExtraClass;
    int ExtraGrade;
    double Average;
    int[] GradeSet;
    boolean Passed;

    public Student(){
        System.out.println("Default student constructor passed.");
    }
    public Student(int studentYear, String math, int mathGrade, String science, int scienceGrade, String english, int englishGrade, String physicalEducation, int physicalEducationGrade, String history, int historyGrade, String extraClass, int extraGrade){
        StudentYear = studentYear;
        Math = math;
        MathGrade = mathGrade;
        Science = science;
        ScienceGrade = scienceGrade;
        English = english;
        EnglishGrade = englishGrade;
        PhysicalEducation = physicalEducation;
        PhysicalEducationGrade = physicalEducationGrade;
        History = history;
        HistoryGrade = historyGrade;
        ExtraClass = extraClass;
        ExtraGrade = extraGrade;
        GradeSet = new int[]{MathGrade, ScienceGrade, EnglishGrade, PhysicalEducationGrade, HistoryGrade, ExtraGrade}; 

}
    public void Passed(){
        Average = (GradeSet[0] + GradeSet[1] + GradeSet[2] + GradeSet[3] + GradeSet[4] + GradeSet[5]) / 6;
        System.out.println("Average is " + Average );
        if (Average >= 60.0) {
            Passed = true;
            System.out.println("This student has passed.");
        }
        else {
            Passed = false;
            System.out.println("This student has failed.");
        }
    }
 }
class Teacher extends SchoolMember{
    int CurrentYear;
    int CurrentYearTaught;
    String[] CurrentRoster;
    int[] StudentGrades;
    public Teacher(int currentYear, int currentYearTaught, String[] currentRoster, int[] studentGrades){
        CurrentYear = currentYear;
        CurrentYearTaught = currentYearTaught;
        CurrentRoster = currentRoster;
        StudentGrades = studentGrades;
    }
    public Teacher(){
        System.out.println("Default constructor teacher passed.");
    }
}

class Classes{
    Classes(){
        System.out.println("This is the default Classes Contructor.");
    }
}
