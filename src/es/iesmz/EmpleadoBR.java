package es.iesmz;

public class EmpleadoBR {

    public static float calcularSalarioBruto(TipoEmpleado tipo, float ventaMensual, float horasExtra){
        if (tipo==null || ventaMensual<0 || horasExtra<0){
            return -1;
        }

        float salarioBase;
        if (tipo == TipoEmpleado.vendedor){
            salarioBase = 1000f;
        }   else {
            salarioBase = 1500f;
        }

        float prima = 0f;
        if (ventaMensual >= 1500f){
            prima = 200f;
        } else if (ventaMensual>=1000f) {
            prima=100f;
        }

        float pagoHorasExtra = horasExtra * 20f;
        return salarioBase + prima + pagoHorasExtra;
    }

    public static float calcularSalarioNeto(float salarioBruto){
        if (salarioBruto<0f){
            return -1;
        }

        float retencion;
        if (salarioBruto>=1500f){
            retencion = 18f;
        } else if (salarioBruto>=1000f) {
            retencion = 16f;
        }   else  retencion = 0f;

        return salarioBruto *(1-(retencion/100));
    }
}
