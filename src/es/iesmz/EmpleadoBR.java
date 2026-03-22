package es.iesmz;

public class EmpleadoBR {

    public static float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) {

        if (tipo == null || ventasMes < 0 || horasExtra < 0) {
            return -1;
        }

        float salarioBase;

        if (tipo == TipoEmpleado.vendedor) {
            salarioBase = 1000;
        } else {
            salarioBase = 1500;
        }

        float prima = 0;

        if (ventasMes >= 1500) {
            prima = 200;
        } else if (ventasMes >= 1000) {
            prima = 100;
        }

        float pagoHorasExtra = horasExtra * 20;

        return salarioBase + prima + pagoHorasExtra;
    }


    public static float calculaSalarioNeto(float salarioBruto) {

        if (salarioBruto < 0) {
            return -1;
        }

        float retencion = 0;

        if (salarioBruto >= 1500) {
            retencion = 18;
        } else if (salarioBruto >= 1000) {
            retencion = 16;
        }

        return salarioBruto * (1 - (retencion / 100));
    }
}