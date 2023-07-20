package principal;

import java.util.Date;
import trab1.Prova;

public class Principal {

    /**
     * Aplicação que permite organizar eventos desportivos
     * Classe Principal com o método main que faz uso das funcionalidades da aplicação desenvolvida
     * @param args
     */
    
    public static void main(String[] args) {
        
        Prova p = new Prova();
        p.addInscFederado("202222111", "Ricardo","Bragança", "923421222", "r@email.com",new Date(2000-17-02),"Chaves", new Date(2020-12-05));
        p.addInscNaoFederado("233121233", "Simão", "Bragança", "912321111", "sp@email.com", new Date(2000-11-02), true);
        p.addInscricao("202222111");
        p.addInscricao("233121233");
        p.removeInscricao("233121233");
        p.totalFaturado(new Date(2000-17-02), new Date(2000-15-02));
        System.out.println(p.AtletaToString("202222111"));
        System.out.println(p.InscricaoToString("202222111"));
    }
    
}
