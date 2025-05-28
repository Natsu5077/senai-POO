public class Clinica {
   private  String nome;
    private int id;
   private String cnpj;
  
   public Clinica (){

   }
   public Clinica(String nome, String cnpj){
    this.nome=nome;
    this.cnpj=cnpj;
   }
   public Clinica(String nome){
    this.nome=nome;
   }

   public String getNome() {
    return nome;
}
   public String getCnpj() {
    return cnpj;
   }
}
