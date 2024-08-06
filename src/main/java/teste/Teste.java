package teste;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assume.assumeTrue;

public class Teste {

    @Before
    public void beforeMethod() {
        assumeTrue("Condição não atendida, ignora o teste.", someCondition());
    }

    @Test
    public void test() {
        System.out.println("Condição verdadeira.");
    }

    private boolean someCondition() {
        return 7 > 5; 
    }
}