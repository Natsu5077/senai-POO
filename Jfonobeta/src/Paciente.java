public class Paciente {
   private String nome;
   private String email;
    private int id;
    public Paciente(){

    }
    public Paciente(String nome, String email, int id){
        this.nome=nome;
        this.email=email;
        this.id=id;
    }
    public Paciente(String nome, String email){
        this.nome=nome;
        this.email=email;
    }
    public Paciente (String nome){
        this.nome=nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    //metodo set e get  
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    //tostring é para puxar varios dados, juntar ele com o construtor é uma boa 
}
