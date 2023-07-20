package trab1;

import java.util.Date;

    /**
    *Criação da classe Inscricao
    */

public class Inscricao {
    
     /**
    *Atributos da classe Inscricao
    */
    
    private Date dataInscricao;
    private Atleta atleta;
    
    /** Método Construtor da Classe Inscricao */
    
    public Inscricao(Atleta a){
        
        atleta=a;
        dataInscricao = new Date(); // Cria uma data hora atual
    }

}
