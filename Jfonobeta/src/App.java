public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono");
        Exercicio ex = new Exercicio("Soprar bolinhas de algodão" , 
        "Usar canudo para assoprar bolinhas por um caminho até sair" ,
         "", 5 , "Não tem");
      

        Exercicio ex1 = new Exercicio("Vibrar lábio" ,
         "fazer os lábios vibrarem mcomo o som de um motor de carro, para relaxar a musculatura e aquecer a voz"
        ,"Brrrrrrr.... som de motor ");

        Exercicio ex2 = new Exercicio("Trava língua vibrante", 
        "Use trava-línguas para estimular o som /R/ vibrante. Leia junto com a criança e repita de forma lenta, depois em ritmo normal.",
        "", 5,"Trava-língua: O rato roeu a roupa do rei de Roma.");
        
        
        Clinica nomeClinica = new Clinica("Fono" , "*******");
        
        Clinica cnpjClinica= new Clinica("FONOS");
       
        Profissional profissional= new Profissional("João" , "6199999" , 1);
        Profissional profissional1 = new Profissional("Jorge" , "6199999");

        Paciente nomPaciente = new Paciente();
        nomPaciente.nome = "";
        Paciente emailPaciente = new Paciente();
        emailPaciente.email = "";
        Paciente idPaciente = new Paciente();
        idPaciente.id= 6;

        System.out.println("Nome "+ ex.getNome());
        System.out.println("Descrição"+ ex.getDescricao());
        System.out.println("Exemplo"+ ex.getExemplo());
        System.out.println("Tempo minímo"+ ex.getTempoMin());
        System.out.println("som  "+ ex.getSom());

        System.out.println("Nome "+ ex1.getNome());
        System.out.println("Descrição: "+ ex1.getDescricao());
        System.out.println("Exemplo: "+ ex1.getExemplo());
        System.out.println("Tempo minímo: "+ ex1.getTempoMin());
        System.out.println("som: "+ ex1.getSom());

        System.out.println("Nome:" + nomeClinica.getNome());
        System.out.println("CNPJ:" + cnpjClinica.getCnpj());

        System.out.println("Nome: " + profissional.getnome());
        System.out.println("Telefone: " + profissional.gettelefone());

        System.out.println("Profissinal:" + profissional1.getnome());
        System.out.println("Profissinal:" + profissional1.gettelefone());
    }
}
