public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono");
        //objeto exercicios 
        Exercicio ex = new Exercicio("Soprar bolinhas de algodão" , 
        "Usar canudo para assoprar bolinhas por um caminho até sair" ,
         "", 5 , "Não tem");
      

        Exercicio ex1 = new Exercicio("Vibrar lábio" ,
         "fazer os lábios vibrarem mcomo o som de um motor de carro, para relaxar a musculatura e aquecer a voz"
        ,"Brrrrrrr.... som de motor ");

        Exercicio ex2 = new Exercicio("Trava língua vibrante", 
        "Use trava-línguas para estimular o som /R/ vibrante. Leia junto com a criança e repita de forma lenta, depois em ritmo normal.",
        "", 5,"Trava-língua: O rato roeu a roupa do rei de Roma.");
        
        //objeto clinica 

        Clinica nomecnpjClinica = new Clinica("Clinicas Fono" , "2222222111");
        Clinica clinica2 = new Clinica("J-Fonbo" , "1212121212");
        
       
       //objeto profissional 

        Profissional profissional= new Profissional("João" , "6199999" , 1);
        Profissional profissional1 = new Profissional("Jorge" , "6199999");

        //objeto paciente 

        Paciente nomEmailPaciente = new Paciente("Jorge", "Jorge@gmail.com", 1);

        //mensagem dos exercicios - maneira dele aparecer no sistema 

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

        System.out.println("Nome "+ ex2.getNome());
        System.out.println("Descrição: "+ ex2.getDescricao());
        System.out.println("Exemplo: "+ ex2.getExemplo());
        System.out.println("Tempo minímo: "+ ex2.getTempoMin());
        System.out.println("som: "+ ex2.getSom());

        //aparecer os dados do objeto clinica 

        System.out.println("Nome da clinica: " + nomecnpjClinica.getNome() + "\n CNPJ:" + nomecnpjClinica.getCnpj());
        System.out.println("Clinica: " + clinica2.getNome() + "\n CNPJ: " + clinica2.getCnpj());
      //aparecer os dados do objeto profissional 

        System.out.println("Profissional: " + profissional.getnome());
        System.out.println("Telefone: " + profissional.gettelefone());

        System.out.println("Profissinal:" + profissional1.getnome());
        System.out.println("Telefone:" + profissional1.gettelefone());

        //aparecer os dados do objeto paciente 

        System.out.println("Paciente: " +nomEmailPaciente.getNome());
        System.out.println("Email: " + nomEmailPaciente.getEmail());
        System.out.println("nome " + nomEmailPaciente.toString());
        
    }
}
