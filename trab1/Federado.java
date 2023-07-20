package trab1;

import java.util.Date;

    /**
    *Criação da classe Federado
    *Herança da class Atleta
    */

public class Federado extends Atleta{
    
     /**
    *Atributos da classe Federado
    */
    
    private String clube;
    private Date dataRegistoFed;
    
   /** Método Construtor da Classe Federado */
    
    public Federado(String nif){
        super(nif);
    }
    
     /**
      *Devolve o clube do atleta federado como uma string.
      * @return O clube do federado atleta. 
      */
    
    public String getClube(String c){
        return clube;
    }
    
      /**a data de registo de federação do atleta federado como uma Date.
      * @return A data de registo de federação do atleta federado. 
      */
    
    public Date getDataRegistoFed(){
        return dataRegistoFed;
    }
    
    /** Define o clube do atleta federado
      */
    
    public void setClube(String c){
        this.clube=c;
    }
    
    /** Define a data de registo de federação do atleta federado
      */
    
    public void setDataRegistoFed(Date d){
        this.dataRegistoFed=d;
    }
    
}
