import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;



public class Orcamento {



    private long id;
    private LocalDate data;
    private Carro carro;
    private List<Servico> servicos;
    private double valorTotal;

    public Orcamento() {
    }

    public Orcamento(long id, Date data, Carro carro, List<Servico> servicos, double valorTotal) {
        this.id = id;
        this.data = LocalDate.now();
        this.carro = carro;
        this.servicos = servicos;
        this.valorTotal = valorTotal;
    }

    public void adicionarServico(Servico servico) {
        if (this.servicos == null) {
            this.servicos = new ArrayList<>();
        }
        this.servicos.add(servico);
    }

    public void calcularValorTotal() {
        this.valorTotal = 0;
        for (Servico servico : this.servicos) {
            this.valorTotal += servico.getValor();
        }
    }


    public void imprimir() {
        System.out.println("ID: " + this.id);
        System.out.println("Data: " + this.data);
        System.out.println("Carro: " + this.carro.getMarca() + " " + this.carro.getModelo() + " - " + this.carro.getPlaca());
        System.out.println("Serviços:");
        for (Servico servico : this.servicos) {
            System.out.println("  " + servico.getDescricao() + " - R$ " + servico.getValor());
        }
        System.out.println("Valor total: R$ " + this.valorTotal);
    }

    public void imprimir(String cabecalho) {
        System.out.println(cabecalho);
        this.imprimir();
    }


   

    public void imprimir(boolean imprimirCabecalho, boolean imprimirCarro) {
        if (imprimirCabecalho) {
            this.imprimir("-----------------------ORÇAMENTO-----------------------");
        }
      
        
        if (imprimirCarro) {
            System.out.println("Carro: " + this.carro.getMarca() + " " + this.carro.getModelo() + " - " + this.carro.getPlaca());
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getData() {
        
        return data;
    }

    public void setData(Date data) {
        LocalDate localDate = LocalDate.now();
        this.data = localDate;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    

}
