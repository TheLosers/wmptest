import org.junit.Test;

import static org.junit.Assert.*;

public class WmpTestMainTest {

    // 알파벳, 숫자가 아닌 케이스
    @Test
    public void solutionOne() {

        System.out.println("TEST1 : 알파벳, 숫자가 아닌 케이스");
        WmpTestMain m = new WmpTestMain();
        System.out.println("TEST1 RESULT : " +m.solution("1dsg34!d"));

    }

    // only number
    @Test
    public void solutionTwo() {
        System.out.println("TEST2 : only number");
        WmpTestMain m = new WmpTestMain();
        System.out.println("TEST2 RESULT : " + m.solution("1235435345"));

    }

    // only alphabet
    @Test
    public void solutionThree() {
        System.out.println("TEST3 : only alphabet");
        WmpTestMain m = new WmpTestMain();
        System.out.println("TEST3 RESULT : " + m.solution("dfsdf"));

    }

    // number + alphabet
    @Test
    public void solutionFour() {
        System.out.println("TEST4 : number + alphabet");
        WmpTestMain m = new WmpTestMain();
        System.out.println("TEST4 RESULT : " + m.solution("1dsg34d"));

    }

}