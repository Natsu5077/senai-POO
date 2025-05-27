public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono");
        Exercicio ex = new Exercicio();
        ex.nome = "kiko";
        ex.descricao = "Exércio de aquecimento, imitar personagem kiko dda série Chaves chorando, oscilando alterando a vibração";
        ex.tempoMin = 3;
        ex.som = "sons/kiko.ogg";
        ex.exemplo="";
        ex.id =1;

        Exercicio ex1 = new Exercicio();
        ex1.nome = " Sibilância do /S/ com espelho";
        ex1.descricao ="Treine o som /S/ usando um espelho para que a criança possa observar a posição correta da língua (atrás dos dentes superiores). Comece com a repetição do som isolado e depois insira em palavras.";
        ex1.exemplo = "repita palavas com S: Sapato, sapo...";
        ex1.som= "S";
        ex1.tempoMin= 10;
        ex1.id=2;


        Exercicio ex2 = new Exercicio();
        ex2.nome= " Trava-língua com /R/ vibrante";
        ex2.descricao= "Use trava-línguas para estimular o som /R/ vibrante. Leia junto com a criança e repita de forma lenta, depois em ritmo normal.";
        ex2.exemplo = "Trava-língua: O rato roeu a roupa do rei de Roma.";
        ex2.som =" R ";
        ex2.tempoMin=8;
        ex2.id =3;

        Exercicio ex3 =  new Exercicio();
        ex3.nome ="Língua elástica para o /L/";
        ex3.descricao ="Peça que a criança toque o céu da boca com a ponta da língua várias vezes, como se fosse estalar a língua. Isso fortalece os músculos usados na emissão do som /L/.";
        ex3.exemplo= "Palavras: lua, lápis, lobo\n" + 
                        "Frase: O lobo levou o lápis para a lua.";
        ex3.som="L";
        ex3.tempoMin=5;
        ex3.id=4;

        Clinica nomeClinica = new Clinica();
        nomeClinica.nome = "Fonos";
        Clinica cnpjClinica= new Clinica();
        cnpjClinica.cnpj ="*******";
        Clinica idClinica = new Clinica();
        idClinica.id = 5;

        Paciente nomPaciente = new Paciente();
        nomPaciente.nome = "";
        Paciente emailPaciente = new Paciente();
        emailPaciente.email = "";
        Paciente idPaciente = new Paciente();
        idPaciente.id= 6;

    }
}
