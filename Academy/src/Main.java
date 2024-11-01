import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // DEPARTAMENTS //////////////////////////////////

        Department departmentPsych = new Department();
        departmentPsych.name = "Psychology";

        Department departmentIT = new Department();
        departmentIT.name = "Information Technology";

        // COURSES //////////////////////////////////

        Course courseCsharp = new Course();
        courseCsharp.name = "C#";
        courseCsharp.code = "987C#";
        courseCsharp.department = departmentIT;

        Course coursePython = new Course();
        coursePython.name = "Python";
        coursePython.code = "987Python";
        coursePython.department = departmentIT;

        Course courseJavaScript = new Course();
        courseJavaScript.name = "Javascript";
        courseJavaScript.code = "987CJavaScript";
        courseJavaScript.department = departmentIT;

        Course courseEthics = new Course();
        courseEthics.name = "Ethics Psychology";
        courseEthics.code = "789Ethics";
        courseEthics.department = departmentPsych;

        Course courseSosial = new Course();
        courseSosial.name = "Sosial Psychology";
        courseSosial.code = "789Sosial";
        courseSosial.department = departmentIT;

        // PROFESSORS //////////////////////////////////

        Professor professorZigmunFreud = new Professor();
        professorZigmunFreud.name = "Zigmund Freud";
        professorZigmunFreud.id = "1";
        professorZigmunFreud.email = "Freud@gmail.com";
        professorZigmunFreud.department = departmentPsych;
        Course[] coursesFreud = new Course[2];
        coursesFreud[0] = courseSosial;
        coursesFreud[1] = courseEthics;
        professorZigmunFreud.coursesTaught = coursesFreud;

        Professor professorMartinSeligman = new Professor();
        professorMartinSeligman.name = "Martin Seligman";
        professorMartinSeligman.id = "2";
        professorMartinSeligman.email = "Seligman@gmail.com";
        professorMartinSeligman.department = departmentPsych;
        Course[] coursesSeligman = new Course[2];
        coursesSeligman[0] = courseSosial;
        coursesSeligman[1] = courseEthics;
        professorMartinSeligman.coursesTaught = coursesSeligman;

        Professor professorShamilAbilov = new Professor();
        professorShamilAbilov.name = "Shamil Abilov";
        professorShamilAbilov.id = "3";
        professorShamilAbilov.email = "Abilov@gmail.com";
        professorShamilAbilov.department = departmentIT;
        Course[] coursesAbilov = new Course[2];
        coursesAbilov[0] = courseCsharp;
        coursesAbilov[1] = courseJavaScript;
        professorShamilAbilov.coursesTaught = coursesAbilov;

        Professor professorAqilAgamirzayev = new Professor();
        professorAqilAgamirzayev.name = "Aqil Agamirzayev";
        professorAqilAgamirzayev.id = "4";
        professorAqilAgamirzayev.email = "Agamirzeyev@gmail.com";
        professorAqilAgamirzayev.department = departmentIT;
        Course[] coursesAgamirzeyev = new Course[2];
        coursesAgamirzeyev[0] = coursePython;
        coursesAgamirzeyev[1] = courseJavaScript;
        professorAqilAgamirzayev.coursesTaught = coursesAbilov;

        // STUDENTS //////////////////////////////////

        Student studentRufat = new Student();
        studentRufat.id = "1";
        studentRufat.name = "Rufat Hesenzade";
        studentRufat.email = "Rufat@gmail.com";
        studentRufat.department = departmentPsych;
        studentRufat.advisor = professorZigmunFreud;
        Course[] coursesRufat = new Course[1];
        coursesRufat[0] = courseSosial;
        studentRufat.courses = coursesRufat;

        Student studentNasir = new Student();
        studentNasir.id = "1";
        studentNasir.name = "Nasir Abdullayev";
        studentNasir.email = "Nasir@gmail.com";
        studentNasir.department = departmentIT;
        studentNasir.advisor = professorAqilAgamirzayev;
        Course[] coursesNasir = new Course[1];
        coursesNasir[0] = courseJavaScript;
        studentNasir.courses = coursesNasir;

        Student studentLale = new Student();
        studentLale.id = "1";
        studentLale.name = "Lale Efendiyeva";
        studentLale.email = "Lale@gmail.com";
        studentLale.department = departmentIT;
        studentLale.advisor = professorShamilAbilov;
        Course[] coursesLale = new Course[1];
        coursesLale[0] = courseCsharp;
        studentLale.courses = coursesLale;

        // DEPARTAMENTS Continue //////////////////////////////////

        Course[] psychologyCourse = new Course[2];
        psychologyCourse[0] = courseEthics;
        psychologyCourse[1] = courseSosial;
        departmentPsych.courses = psychologyCourse;
        departmentPsych.head = professorMartinSeligman;
        Student[] studentsPsychology = new Student[1];
        studentsPsychology[0] = studentRufat;
        departmentPsych.students = studentsPsychology;

        Course[] itCourse = new  Course[3];
        itCourse[0] = courseCsharp;
        itCourse[1] = coursePython;
        itCourse[2] = coursePython;
        departmentIT.courses = itCourse;
        departmentIT.head = professorShamilAbilov;
        Student[] studentsIt = new Student[2];
        studentsIt[0] = studentNasir;
        studentsIt[1] = studentLale;
        departmentIT.students = studentsPsychology;

        // COURSES Continue //////////////////////////////////

        courseCsharp.teacher = professorShamilAbilov;
        Student[] studentsCsharp = new Student[1];
        studentsCsharp[0] = studentLale;
        courseCsharp.students = studentsCsharp;

        coursePython.teacher = professorAqilAgamirzayev;

        courseJavaScript.teacher = professorShamilAbilov;
        Student[] studentsJavaScript = new Student[1];
        studentsJavaScript[0] = studentNasir;
        courseJavaScript.students = studentsJavaScript;

        courseEthics.teacher = professorMartinSeligman;

        courseSosial.teacher = professorZigmunFreud;
        Student[] studentsSosial = new Student[1];
        studentsSosial[0] = studentRufat;
        courseSosial.students = studentsSosial;

        Scanner scan = new Scanner(System.in);
        System.out.println("Akademiyamızın məlumat sisteminə xoş gəlmisiz.");
        System.out.println("Zəhmət olmasa məlumat almaq üçün müvafiq rəqəmi seçin.");
        System.out.println("""
                1. Departamentlər haqqında məlumat.
                2. Professorlar haqqında məlumat.
                3. Kurslar haqqında məlumat.
                4. Tələbələr haqqında məlumat.
                """);
        System.out.print("Reqemi daxil edin: ");
        int number = scan.nextInt();

        switch (number){
            case 1:
                System.out.println("Departamentin adı: "+departmentIT.name);
                System.out.println("Departamentin Professoru: "+departmentIT.head.name);
                System.out.print("Departamentin kursları: ");
                for (Course i : itCourse){
                    System.out.print(i.name + ", ");
                }
                System.out.println();
                System.out.print("Departamentin Tələbələri: ");
                for (Student i : studentsIt){
                    System.out.print(i.name + ", ");
                }
        }
    }
}