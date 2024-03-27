import java.util.ArrayList;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student st= new Student();
        StudentGroup sg=new StudentGroup();


        sg.nazwa="12c";
        st.fname="Kacper";
        st.lname="Lewinski";
        st.indexNumber=213769;
        st.email="kaclew.mail.pl";
        st.grades=new ArrayList<>();
        st.grades.add(4.5);
        st.grades.add(4.0);
        st.grades.add(2.5);
        double srednia = st.calculateAverage();

        Student st2=new Student();
        sg.nazwa="12c";
        st2.fname="Mateusz";
        st2.lname="Fusiek";
        st2.indexNumber=123456;
        st2.email="matfus.mail.pl";
        st2.grades=new ArrayList<>();
        st2.grades.add(2.0);
        st2.grades.add(3.0);
        st2.grades.add(3.5);
        double srednia2 = st2.calculateAverage();

        Student st3=new Student();
        sg.nazwa="12c";
        st3.fname="Krzysztof";
        st3.lname="Barcz";
        st3.indexNumber=666666;
        st3.email="matfus.mail.pl";
        st3.grades=new ArrayList<>();
        st3.grades.add(2.0);
        st3.grades.add(3.0);
        st3.grades.add(3.5);
        double srednia3 = st3.calculateAverage();


        Student st4=new Student();
        sg.nazwa="12c";
        st4.fname="Antoni";
        st4.lname="Michalecki";
        st4.indexNumber=192837;
        st4.email="matfus.mail.pl";
        st4.grades=new ArrayList<>();
        st4.grades.add(2.0);
        st4.grades.add(3.0);
        st4.grades.add(3.5);
        double srednia4 = st4.calculateAverage();












    }
}