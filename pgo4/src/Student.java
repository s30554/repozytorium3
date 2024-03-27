import java.util.ArrayList;

public class Student {
    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String adress;

    public ArrayList<Double>grades;



    public StudentGroup groupname;

    public double calculateAverage(){
    double avg=0;
        for(int i=0;i<grades.size();i++){
        avg+=grades.get(i);
    }
        avg/=grades.size();

        if (grades.isEmpty()){
            throw new IllegalArgumentException("Student nie posiada ocen");

        }return avg;
    }


}
