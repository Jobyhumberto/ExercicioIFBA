import br.com.programacaoempar.Area;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class testaArea {

    Area exercicio;
    private Object assertEquals;

    @BeforeEach
    public void iniciar() {
        exercicio = new Area();
    }

    @Test
    public void retanguloArea() { //Exercício 1 da Liste de Lógica de Programação
        assertEquals(25, exercicio.areaRetangulo(5, 5));
    }

    @Test
    public void retanguloPerimetro() { //Exercício 1 da Liste de Lógica de Programação
        assertEquals(20, exercicio.perimetroRetangulo(5, 5));
    }

    @Test
    public void quadradoArea() { //Exercício 2 da Liste de Lógica de Programação
        assertEquals(25, exercicio.areaQuadrado(5, 5));
    }

    @Test
    public void quadradoPerimetro() { //Exercício 2 da Liste de Lógica de Programação
        assertEquals(16, exercicio.perimetroQuadrado(4));
    }

    @Test
    public void circunferenciaArea() { //Exercício 3 da Liste de Lógica de Programação
        assertEquals(28.26, exercicio.areaCircunferencia(3.0));
    }

    @Test
    public void circunferenciaPerimetro() { //Exercício 3 da Liste de Lógica de Programação
        assertEquals(25.12, exercicio.perimetroCircunferencia(4));
    }


    @Test
    public void perimetroTriangulo() { //Exercício 4 da Liste de Lógica de Programação
        assertEquals(30.0, exercicio.perimetroTriangulo(10.0, 10.0, 10.0));
    }

    @Test
    public void numeroInteiroSucessor() { //Exercício 5 Ler núemro inteiro e exibir sucessor
        assertEquals(6, exercicio.numeroInteiroSucessor(5)); //Comando lê apenas númetos Int e exibe o número sucessor
    }

    @Test
    public void divisaoNumeros() { //Exercício 6 Ler dois números inteiros e exibir quociente da divisao entre eles
        assertEquals(3, exercicio.resultadoDivisao(6, 2));
    }
}
