package es.iesmz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoBRTests {

    @BeforeEach
    void setUp() {
        System.out.println("Ejecutar prueba");
    }

    @Test
    void testCalculaSalarioNeto_2000() {
        assertEquals(1640f, EmpleadoBR.calcularSalarioNeto(2000f), 0.01f);
    }

    @Test
    void testCalculaSalarioNeto_1500() {
        assertEquals(1230f, EmpleadoBR.calcularSalarioNeto(1500f), 0.01f);
    }

    @Test
    void testCalulaSalarioNeto_1499_99(){
        assertEquals(1259.9916f, EmpleadoBR.calcularSalarioNeto(1499.99f), 0.01f);
    }

    @Test
    void testCalculaSalarioNeto_1250(){
        assertEquals(1050f, EmpleadoBR.calcularSalarioNeto(1250f), 0.01f);
    }

    @Test
    void testCalulaSalarioNeto_1000(){
        assertEquals(1000f, EmpleadoBR.calcularSalarioNeto(1000f), 0.01f);
    }

    @Test
    void testCalculaSalarioNeto_999_99(){
        assertEquals(999.99f, EmpleadoBR.calcularSalarioNeto(999.99f), 0.01f);
    }

    @Test
    void testCalculaSalarioNeto_500(){
        assertEquals(500f, EmpleadoBR.calcularSalarioNeto(500f), 0.01f);
    }

    @Test
    void testCalculaSalarioNeto_0(){
        assertEquals(0f, EmpleadoBR.calcularSalarioNeto(0f), 0.01f);
    }

    @Test
    void testCalculaSalarioNeto_negativo(){
        assertEquals(-1f, EmpleadoBR.calcularSalarioNeto(-1f), 0.01f);
    }

    @Test
    void testCalculaSalarioBruto_vendedor_2000_8h(){
        assertEquals(1360f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 2000f, 8f), 0.01f);
    }
    @Test
    void testCalculaSalarioBruto_vendedor_1500_3h(){
        assertEquals(1260f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 1500.0f, 3f), 0.01f);
    }

    @Test
    void testCalculaSalarioBruto_vendedor_1499_99_0h(){
        assertEquals(1110f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 1499.99f, 0f), 0.01f);
    }

    @Test
    void testCalculaSalarioBruto_encargado_1250_8h(){
        assertEquals(1760f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encargado, 1250f, 8f), 0.01f);
    }

    @Test
    void testCalculaSalarioBruto_encargado_1000_0h(){
        assertEquals(1600f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encargado, 1000f, 0f), 0.01f);
    }

    @Test
    void testCalculaSalarioBruto_encargado_999_99_3h(){
        assertEquals(1560f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encargado, 999.99f, 3f), 0.01f);
    }

    @Test
    void testCalculaSalarioBruto_encargado_500_0h(){
        assertEquals(1500f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encargado, 500.0f, 0f), 0.01f);
    }

    @Test
    void testCalculaSalarioBruto_encargado_0_8h(){
        assertEquals(1660f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encargado, 0f, 8f), 0.01f);
    }

    @Test
    void testCalculaSalarioBruto_vendedor_negativo_ventas(){
        assertEquals(-1f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, -1f, 8f), 0.01f);
    }
    @Test
    void testCalculaSalarioBruto_vendedor_negativo_horas(){
        assertEquals(-1f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 1500f, -1f), 0.01f);
    }

    @Test
    void testCalculaSalarioBruto_null_tipo(){
        assertEquals(-1f, EmpleadoBR.calcularSalarioBruto(null, 1500f, 8f), 0.01f);
    }
}
