package es.iesmz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoBRTests {

    @BeforeEach
    public void antesDeCadaTest() {
        System.out.println("Ejecuta Prueba");
    }

    // -------- SALARIO NETO --------

    @Test
    public void testSalarioNeto1() {
        assertEquals(1640, EmpleadoBR.calculaSalarioNeto(2000), 0.01);
    }

    @Test
    public void testSalarioNeto2() {
        assertEquals(1230, EmpleadoBR.calculaSalarioNeto(1500), 0.01);
    }

    @Test
    public void testSalarioNeto3() {
        assertEquals(1259.9916f, EmpleadoBR.calculaSalarioNeto(1499.99f), 0.01);
    }

    @Test
    public void testSalarioNeto4() {
        assertEquals(1050, EmpleadoBR.calculaSalarioNeto(1250), 0.01);
    }

    @Test
    public void testSalarioNeto5() {
        assertEquals(840, EmpleadoBR.calculaSalarioNeto(1000), 0.01);
    }

    @Test
    public void testSalarioNeto6() {
        assertEquals(999.99f, EmpleadoBR.calculaSalarioNeto(999.99f), 0.01);
    }

    @Test
    public void testSalarioNeto7() {
        assertEquals(500, EmpleadoBR.calculaSalarioNeto(500), 0.01);
    }

    @Test
    public void testSalarioNeto8() {
        assertEquals(0, EmpleadoBR.calculaSalarioNeto(0), 0.01);
    }

    @Test
    public void testSalarioNeto9() {
        assertEquals(-1, EmpleadoBR.calculaSalarioNeto(-1), 0.01);
    }

    // -------- SALARIO BRUTO --------

    @Test
    public void testBruto1() {
        assertEquals(1360, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 2000, 8), 0.01);
    }

    @Test
    public void testBruto2() {
        assertEquals(1260, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1500, 3), 0.01);
    }

    @Test
    public void testBruto3() {
        assertEquals(1100, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1499.99f, 0), 0.01);
    }

    @Test
    public void testBruto4() {
        assertEquals(1760, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 1250, 8), 0.01);
    }

    @Test
    public void testBruto5() {
        assertEquals(1600, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 1000, 0), 0.01);
    }

    @Test
    public void testBruto6() {
        assertEquals(1560, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 999.99f, 3), 0.01);
    }

    @Test
    public void testBruto7() {
        assertEquals(1500, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 500, 0), 0.01);
    }

    @Test
    public void testBruto8() {
        assertEquals(1660, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encargado, 0, 8), 0.01);
    }

    @Test
    public void testBruto9() {
        assertEquals(-1, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, -1, 8), 0.01);
    }

    @Test
    public void testBruto10() {
        assertEquals(-1, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1500, -1), 0.01);
    }

    @Test
    public void testBruto11() {
        assertEquals(-1, EmpleadoBR.calculaSalarioBruto(null, 1500, 8), 0.01);
    }
}