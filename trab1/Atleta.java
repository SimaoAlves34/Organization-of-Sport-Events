package trab1;

import java.util.Date;

    /**
    *Criação da classe Atleta
    */

public class Atleta {
    
     /**
    *Atributos da classe Atleta
    */
    protected String nif;
    protected String nome;
    protected String morada;
    protected String telefone;
    protected String email;
    protected Date dataNascimento;
    
    
    /** Método Construtor da Classe Atleta */
    
    public Atleta(String n){
        nif=n;
    }
    
     /**
      *Devolve o nif do atleta como uma string.
      * @return O nif do atleta. 
      */
    
    public String getNif(){
        return nif;
    }
    
    /** Devolve o nome do atleta como uma string.
      * @return O nome do atleta. 
      */
    
    public String getNome(){
        return nome;
    }
    
    /** Devolve a morada do atleta como uma string.
      * @return A morada do atleta. 
      */
    
    public String getMorada(){
        return morada;
    }
    
    /** Devolve o telefone do atleta como uma string.
      * @return O telefone do atleta. 
      */
    
    public String getTelefone(){
        return telefone;
    }
    
    /** Devolve o email do atleta como uma string.
      * @return O email do atleta. 
      */
    
    public String getEmail(){
        return email;
    }
    
    /** Devolve a data de nascimento do atleta como tipo date.
      * @return A data de nascimento do atleta. 
      */
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    
    /** Define o nif do atleta
      */
    
    public void setNif(String n){
        this.nif=n;
    }
    
     /** Define o nome do atleta
      */
    
    public void setNome(String n){
        this.nome=n;
    }
    
     /** Define a morada do atleta
      */
    
    public void setMoarada(String m){
        this.morada=m;
    }
    
     /** Define o telefone do atleta
      */
    
    public void setTelefone(String t){
        this.telefone=t;
    }
    
     /** Define o email do atleta
      */
    
    public void setEmail(String e){
        this.email=e;
    }
    
     /** Define a data de nascimento do atleta
      */
    
    public void setdataNascimento(Date dN){
        this.dataNascimento=dN;
    }   
}
