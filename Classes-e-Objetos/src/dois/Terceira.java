package src.dois;

import src.um.Primeiro;

public class Terceira {

    private void metodoPrivadi() {
        Primeiro primeiro = new Primeiro();

       // primeiro.metodoProtected();  nao consegue puxar por estar em um pacote  diferente
        //primeiro.metodoDefault(); tambem nao conseguimos acessar por estar em um outro pacote

        // conseguimos acessar metodo public

        Quarta quarta = new Quarta();
       // quarta.metodoProtected(); Só conseguimos acessar de dentro do pacote extends na quarta.java
    }
}
