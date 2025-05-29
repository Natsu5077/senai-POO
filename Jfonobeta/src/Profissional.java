public class Profissional {
   private String nome;
   private String telefone;
   private int id;

    public Profissional(){

    }
    public Profissional(String nome, String telefone , int id){
        this.nome=nome;
        this.telefone=telefone;
        this.id=id;
    }
    public Profissional(String nome, String telefone){
        this.nome=nome;
        this.telefone=telefone;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getnome(){
        return nome;
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    public String gettelefone(){
        return telefone;
    }
    public int getid(){
        return id;
    }

}
