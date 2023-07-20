package trab1;

import java.util.Date;
import java.util.TreeMap;


    /**
    *Criação da classe Prova
    */

public class Prova {
    
      /**
    *Atributos da classe Prova
    */
    
    private String designacao;
    private String modalidade;
    private String localidade;
    private double preco;
    private Date dataHora;
    
    
    //Colecao Treemap(chave,valor)
            
    private TreeMap<String,Atleta> atletas;
    
    /** Método Construtor da Classe Atleta */
    
    public Prova(){
        atletas = new TreeMap<>();
        
    }
    
    /**
    * Método que permite inscrever atletas federados
    */
    
    public boolean addInscFederado(String nif, String n, String m, String t, String e, Date dN, String c, Date dF){
        if(atletas.containsKey(nif)){
            System.err.println("Atleta federado com o nif:" + nif + " já registado!");
            return false;
        }
        else{
            atletas.put(nif, new Atleta(nif));
            System.out.println("Atleta federado com o nif:" + nif + " registado!");
            return true;
        }
      
    }
    
    /**
    * Método que permite imprimir para o ecrã os atletas registados pelo respetivo
    */
    
     public String AtletaToString(String nif){
         
        if(atletas.containsKey(nif)){
        System.out.print("Atleta registado - nif:");
        return nif;
        }
        else{
        System.err.println("Atleta com o nif:" + nif + " não está registado!");
        return null;
}  
    }
     
    /**
    * Método que permite imprimir para o ecrã as inscrições dos atletas já inscritos pelo nif
    */
     
     public String InscricaoToString(String nif){
         
        if(atletas.containsKey(nif)){
        System.out.print("Atleta com o nif inscrito na prova:");
        return nif;
        }
        else{
        System.err.println("Atleta com o nif:" + nif + " está inscrito na prova!");
        return null;
}  
    }
     
     
    /**
    * Método que permite inscrever atletas não federados
    */
    
    public boolean addInscNaoFederado(String nif, String n, String m, String t, String e, Date dN, boolean s){
      
        if(atletas.containsKey(nif)){
            System.err.println("Atleta não federado com o nif:" + nif + " já registado!");
            return false;
        }
        else{
            atletas.put(nif, new Atleta(nif));
            System.out.println("Atleta não federado com o nif:" + nif + " registado!");
            return true;
        }
      
    }
    
     /**
    * Método que permite adicionar uma inscrição
    */
    
    public boolean addInscricao(String nif){
        Atleta at = new Atleta(nif);
        if(atletas.containsKey(at.getNif())){
            System.out.println("Atleta com o nif: " + nif + " já existe!");
            return false;
        }
        else{
            atletas.put(at.getNif(), at); //Alteraçao do .put com integer como chave em vez de string
            System.out.println("Atleta com o nif: " + nif + " inscrito!");
            return true;
                }
    }
    
    
    /**
    * Método que permite remover uma inscrição
    */
    
    public boolean removeInscricao(String nif){
        Atleta at = new Atleta(nif);
        if(atletas.containsKey(at.getNif())){
            atletas.remove(at.getNif(), at); //Alteraçao do .put com integer como chave em vez de string
            System.out.println("Atleta com o nif: " + nif + " foi removido!");
            return true;
            
        }
        else{
            System.err.println("Nif:" + nif + " não existe!");
            return false;
            }
        
    }
    
    /**
     * Método que calcular o total faturado
    */
    
    public double totalFaturado(Date dataHora, Date dataInscricao){
        
        double TFaturado = 0;
        Date dataInscrição = new Date();

        if(dataInscricao.compareTo(dataHora)- 7< 0){
            TFaturado+=(TFaturado + (preco*0.10)); // 10% desconto
        }
        else if(dataInscricao.compareTo(dataHora) -3 <0){
             TFaturado+=(TFaturado + (preco*0.05)); // 5% desconto
        }
        else{
             TFaturado+=(TFaturado + preco);  // Sem desconto 
        }

        return TFaturado;
    }
}
