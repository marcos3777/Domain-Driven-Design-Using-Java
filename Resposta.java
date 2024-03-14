public class Resposta {

    private String pessoa;
    private String texto;
    private int pergunta; //numero da pergunta

public Resposta() {

}

public Resposta(String person, String text, int question){

    pessoa = person;
    texto = text;
    pergunta = question;
}

public int getPergunta(){
    return pergunta;
}

public void setPergunta (int p) {
    pergunta =p;
}




}
