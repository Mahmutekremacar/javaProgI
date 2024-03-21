import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class numberGradeTest {
    @Test
    void fiftyNineShouldReturnF(){
        var grader = new numberGrade();
        assertEquals('F', grader.determineLetterGrade(59));
    }
    @Test
    void sixtyNineShouldReturnD(){
        var grader = new numberGrade();
        assertEquals('D',grader.determineLetterGrade(69) );
    }
    @Test
    void seventyNineShouldReturnC(){
        var grader = new numberGrade();
        assertEquals('C',grader.determineLetterGrade(79) );
    }

    @Test
    void eightyNineShouldReturnB(){
        var grader = new numberGrade();
        assertEquals('B',grader.determineLetterGrade(89) );
    }
    @Test
    void nintyNineShouldReturnC(){
        var grader = new numberGrade();
        assertEquals('A',grader.determineLetterGrade(99) );
    }
}