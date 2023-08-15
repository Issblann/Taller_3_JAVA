package EmpleadosYSalarios;

public class EmpleadoAsalariado extends TipoEmpleados{

        int prestacionSocial;
        int auxilioTransporte;
        int salario;

        public EmpleadoAsalariado(int prestacionSocial, int auxilioTransporte, int salario) {
                this.prestacionSocial = prestacionSocial;
                this.auxilioTransporte = auxilioTransporte;
                this.salario = salario;
        }

        @Override
        public void calcularSalario() {
                int calculoAsalariado = prestacionSocial + auxilioTransporte + salario;
                System.out.println("El salario del empleado asalariado es: " + calculoAsalariado );
        }
}
