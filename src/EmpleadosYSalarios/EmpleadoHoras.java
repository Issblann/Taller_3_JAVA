package EmpleadosYSalarios;

public class EmpleadoHoras extends TipoEmpleados{

    int valorHora;

    int horasTrabajadas;

    public EmpleadoHoras(int valorHora, int horasTrabajadas) {
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void calcularSalario() {
        int calculoEmpleadoHoras = valorHora * horasTrabajadas;
        System.out.println("El salario del empleado que trabaja por horas es de: " + calculoEmpleadoHoras);
    }
}
