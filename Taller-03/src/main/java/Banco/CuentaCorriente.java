package Banco;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int numero, float saldo, int propietario) {
        super(numero, saldo, propietario);
    }

    @Override
    public void retirar(float cantidad) throws RetiroCuentaCorrienteException {
        this.setNumeroRetiros(getNumeroRetiros()+1);

        if (cantidad > this.getSaldo()) {
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }

        // Aqui se valida que no pueda realizar mas de 5 retiros
        if (this.getNumeroRetiros() >= 5) {
            throw new RetiroCuentaCorrienteException("No puede realizar más de 5 retiros en una Cuenta Corriente");
        }
        setSaldo(this.getSaldo() - cantidad); // Aqui se modifica el saldo por cada retiro
        System.out.println("Cuenta Corriente: Monto Retirado = " + cantidad + " , Saldo disponible = " + getSaldo());

    }

    @Override
    public void depositar(float cantidad) {
        // Aqui se hace un conteo de la cantida de los retiros realizados
        this.setNumeroRetiros(getNumeroRetiros()+1);

        // Aqui se realiza la adicion del 5% para las 2 primeras transacciones de depositos
        if (this.getNumeroRetiros() <= 2) {
            double adicion = cantidad * 0.05;
            super.depositar((float) (cantidad+adicion)); // Se le suma el %5 a la transaccion
        } else {
            super.depositar(cantidad); // De lo contrario se realiza el deposito normal
        }
    }


}
