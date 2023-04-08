
public class estudiante {

	 String nombre;
    int creditos;
   double promedioPonderado;
     double puntosCalidad;
    
   
    public Estudiante(String nombre, int creditos, double GPA, double puntosCalidad) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.promedioPonderado = promedioPonderado;
        this.puntosCalidad = puntosCalidad;
    }

    public double calcularPromedioPonderado() {
        return puntosCalidad / creditos;
    }

    public void actualizarCreditosPuntosCalidad(int creditos, double puntosCalidad) {
        this.creditos += creditos;
        this.puntosCalidad += puntosCalidad;
        this.promedioPonderado = calcularPromedioPonderado();
    }
}