package edu.jhoao.metodos;

public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 15;

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
}
