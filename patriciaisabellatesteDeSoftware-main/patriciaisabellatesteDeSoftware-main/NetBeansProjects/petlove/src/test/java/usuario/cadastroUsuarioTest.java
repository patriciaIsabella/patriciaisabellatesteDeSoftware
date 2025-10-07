package usuario;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class cadastroUsuarioTest {
    
    public cadastroUsuarioTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        // Código para rodar antes de todos os testes (opcional)
    }

    @AfterAll
    public static void tearDownClass() {
        // Código para rodar após todos os testes (opcional)
    }

    @BeforeEach
    public void setUp() {
        // Código para rodar antes de cada teste (opcional)
    }

    @AfterEach
    public void tearDown() {
        // Código para rodar após cada teste (opcional)
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        cadastroUsuario.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCadastrarUsuario() {
        System.out.println("cadastrarUsuario");
        cadastroUsuario.cadastrarUsuario();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLogin() {
        System.out.println("login");
        cadastroUsuario.login();
        fail("The test case is a prototype.");
    }
}
