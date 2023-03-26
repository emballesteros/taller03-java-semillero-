package org.main;

import Banco.CuentaAhorro;
import Banco.CuentaCorriente;
import Banco.RetiroCuentaCorrienteException;

import Musica.Mp3;
import Musica.Wav;
import Musica.VideoMp4;

public class Main {
    public static void main(String[] args) {

        // Cuenta de Ahorros

        CuentaAhorro cuentaAhorro = new CuentaAhorro(1,20000,1095831);
        cuentaAhorro.retirar(1000);
        cuentaAhorro.retirar(1000);
        cuentaAhorro.retirar(1000);

        // Cuenta Corriente

        CuentaCorriente cuentaCorriente = new CuentaCorriente(2,50000,1093832);

        try {
            cuentaCorriente.depositar(3000);
            cuentaCorriente.depositar(2000);
            cuentaCorriente.retirar(10000);
            cuentaCorriente.retirar(10000);
            cuentaCorriente.retirar(10000);
            cuentaCorriente.retirar(10000);
            cuentaCorriente.retirar(10000);
        } catch (RetiroCuentaCorrienteException e) {
            System.out.println("No puede realizar más de 5 retiros en una Cuenta Corriente");
        }

        // MP3

        Mp3 mp3 = new Mp3(5,3,"The Killers","Brandon Flowers","Rock");
        mp3.reproducir();

        // Wav

        Wav wav = new Wav(4,2,"Interpol","Paul Banks","Rock");
        wav.reproducir();

        // Video MP4

        VideoMp4 videoMp4 = new VideoMp4(0,0, "","","","Nirvana","Musical");
        videoMp4.reproducir();
    }

}