public class Pergunta {

    private int numero;
    private String questao;
    private String tema;

    public Pergunta() {

    }
public Pergunta(int number, String question, String theme){
    numero = number;
    questao = question;
    tema = theme;


}

public int getNumbero(){
    return numero;
}

public void setNumero(int num){
    numero = num;
}

public String getQuestao(){
    return questao;
}

public void setQuestao(String q){
    questao = q;
}

public String getTema(){
    return tema;
}

public void setTema(String t){
    
}

}
