public class Profissional {
    String nome;
    String telefone;
    int id;

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
    public String getnome(){
        return nome;
    }
    public String gettelefone(){
        return telefone;
    }
    public int getid(){
        return id;
    }

}
