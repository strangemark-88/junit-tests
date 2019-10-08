import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {

//    The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.

    @Test
    public void testStudentConstructor(){
        Student mark = new Student(1L, "mark");
        Student bryan = null;
        assertNull(bryan);
        assertNotNull(mark);
    }

    @Test
    public void testStudentFields(){
        Student bryan = new Student(1L, "bryan");
        assertSame(1L, bryan.getId());
        assertSame("bryan", bryan.getName());
        assertSame(0, bryan.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student bryan = new Student(1L, "bryan");
        bryan.addGrade(100);
        assertSame(100, bryan.getGrades().get(0));
        bryan.addGrade(80);
        assertSame(80, bryan.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student bryan = new Student(1L, "bryan");
        bryan.addGrade(100);
        bryan.addGrade(80);
        assertEquals(90, bryan.getGradeAverage(), 0);
    }

}
