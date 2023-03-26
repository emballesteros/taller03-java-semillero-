package Banco;

public class CuentaAhorro extends Cuenta{

    public CuentaAhorro(int numero, float saldo, int propietario) {
        super(numero, saldo, propietario);
    }

    @Override
    public void retirar(float cantidad) {
        // Aqui se hace un conteo de la cantida de los retiros realizados
        this.setNumeroRetiros(getNumeroRetiros()+1);

        // Aqui se valida que el saldo disponible sea mayor a la cantidad a retirar
        if (cantidad > getSaldo()) {
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }

        // Aqui se valida que cuando se realizan mas 3 retiros le cobre una comisión del 1%
        if (this.getNumeroRetiros() >= 3) {
            double resta = cantidad * 0.01; // Obtener el valor de la cantidad 0.01%
            cantidad += resta * this.getNumeroRetiros(); // Aqui se multiplica el resultado de resta y se le asigna a la cantidad
        }
        setSaldo(this.getSaldo() - cantidad); // Aqui se modifica el saldo por cada retiro
        System.out.println("Cuenta de Ahorros: Monto retirado = " + cantidad + " , Saldo disponible = " + getSaldo());
    }

}
