package edu.jhoao.metodos;
public class Usuario {
    public void main(String [] args){
        SmartTv smarTv = new SmartTv();

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        System.out.println("Volume da TV: " + smarTv.volume);

        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.mudarCanal(40);
        System.out.println("A TV está ligada? " + smarTv.ligado);
        System.out.println("Canal Atual: " + smarTv.canal);
        System.out.println("Volume da TV: " + smarTv.volume);

        smarTv.ligar();
        System.out.println("E agr? A TV está ligada? " + smarTv.ligado);
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();


        smarTv.diminuirCanal();
        smarTv.diminuirCanal();
        smarTv.diminuirCanal();
        smarTv.diminuirCanal();
        smarTv.desligar();
        System.out.println("E agr? A TV está ligada? " + smarTv.ligado);
        System.out.println("Canal Atual: " + smarTv.canal);
        System.out.println("Volume da TV: " + smarTv.volume);

    }
    public void imprimir(String texto){
        System.out.println(texto);
    }
}
