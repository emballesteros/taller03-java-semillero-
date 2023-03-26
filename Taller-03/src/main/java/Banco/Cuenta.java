package Banco;

public abstract class Cuenta {

    private int numero;

    private float saldo;

    private int propietario; // Nùmero de cedula

    private int numeroRetiros = 0; // Contador de Retiros


    public Cuenta(int numero, float saldo, int propietario) {
        this.numero = numero;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public abstract void retirar(float cantidad) throws RetiroCuentaCorrienteException;

    public void depositar(float cantidad){
        setSaldo(getSaldo()+cantidad);
        System.out.println("Ha depositado "+cantidad+" y su nuevo saldo es " + getSaldo());
    };

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getPropietario() {
        return propietario;
    }

    public void setPropietario(int propietario) {
        this.propietario = propietario;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

}
