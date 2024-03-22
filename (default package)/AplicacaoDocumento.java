//import Exe_aula2.Documento;


public class AplicacaoDocumento{
    public static void main(String[] args) {
        Documento documento = new Documento();
        documento.adiciona("Ola");
        documento.adiciona(" ");
        documento.tab();
        documento.adiciona("Mundo");
        System.out.println(documento.getTexte());
        
    }
}