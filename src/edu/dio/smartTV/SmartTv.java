package edu.dio.smartTV;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void addVolume(){
        volume++;
    }
    public void subVolume(){
        volume--   ;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++   ;
    }
    public void diminuirCanal(){
        canal--   ;
    }
    


}
