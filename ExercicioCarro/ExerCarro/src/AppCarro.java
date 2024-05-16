import java.util.Date;



public class AppCarro {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro(1, "ABC-1234", "Chevrolet", "Cruze");
        Orcamento orcamento = new Orcamento(1, new Date(), carro, null, 0);
        
        orcamento.adicionarServico(new Servico(1, "Troca de óleo", 100.0));
        orcamento.adicionarServico(new Servico(2, "Troca de pneus", 200.0));
        orcamento.adicionarServico(new Servico(3, "Troca de pastilhas de freio", 300.0));
        orcamento.calcularValorTotal();
        
        orcamento.imprimir(true, true);


        Carro carro2 = new Carro(2, "DEF-5678", "Fiat", "Uno");
        Orcamento orcamento2 = new Orcamento(2, new Date(), carro2, null, 0);

        orcamento2.adicionarServico(new Servico(4, "Troca de óleo", 100.0));
        orcamento2.adicionarServico(new Servico(5, "Troca de pneus", 200.0));
        orcamento2.adicionarServico(new Servico(6, "Troca de pastilhas de freio", 300.0));
        orcamento2.adicionarServico(new Servico(7, "Troca de amortecedores", 400.0));
        orcamento2.calcularValorTotal();

        orcamento2.imprimir(true, true);

        Carro carro3 = new Carro(3, "GHI-9101", "Ford", "Ka");
        Orcamento orcamento3 = new Orcamento(3, new Date(), carro3, null, 0);

        orcamento3.adicionarServico(new Servico(8, "Troca de óleo", 100.0));
        orcamento3.adicionarServico(new Servico(9, "Troca de pneus", 200.0));
        orcamento3.adicionarServico(new Servico(10, "Troca de pastilhas de freio", 300.0));
        orcamento3.adicionarServico(new Servico(11, "Troca de amortecedores", 400.0));
        orcamento3.adicionarServico(new Servico(12, "Troca de velas", 50.0));
        orcamento3.calcularValorTotal();

        orcamento3.imprimir(true, true);

        
        

        

    }
}
