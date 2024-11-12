import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

// Classe que representa uma Denúncia

class Denuncia {
    private int id;
    private String titulo;
    private String descricao;
    private String status; 
    private java.util.Date dataCriacao;
    private java.util.Date dataFechamento;
    private int usuarioId;
    private int tipoDenunciaId;

    public Denuncia(int id, String titulo, String descricao, String status, java.util.Date dataCriacao, java.util.Date dataFechamento, int usuarioId, int tipoDenunciaId) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.dataCriacao = dataCriacao;
        this.dataFechamento = dataFechamento;
        this.usuarioId = usuarioId;
        this.tipoDenunciaId = tipoDenunciaId;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public java.util.Date getDataCriacao() {
        return dataCriacao;
    }

    public java.util.Date getDataFechamento() {
        return dataFechamento;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public int getTipoDenunciaId() {
        return tipoDenunciaId;
    }
}

// Classe principal do Dashboard

public class DashboardAdmin extends JFrame {

    private JTable tabelaDenuncias;
    private List<Denuncia> denuncias;

    public DashboardAdmin() {
        setTitle("Dashboard - Administrador");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Inicializar lista de denúncias

        denuncias = new ArrayList<>();
        carregarDenunciasExemplo();  

        // Painel do gráfico
        
        JPanel painelGrafico = new JPanel();
        painelGrafico.setLayout(new BorderLayout());
        painelGrafico.add(criarGraficoDenuncias(), BorderLayout.CENTER);

        // Painel do resumo de denúncias

        JPanel painelResumo = new JPanel();
        painelResumo.setLayout(new GridLayout(1, 2, 20, 20));
        painelResumo.add(criarResumoDenuncias());

        // Adicionar painel de lista de denúncias

        JPanel painelListaDenuncias = new JPanel();
        painelListaDenuncias.setLayout(new BorderLayout());
        painelListaDenuncias.add(new JLabel("Últimas 5 Denúncias"), BorderLayout.NORTH);
        painelListaDenuncias.add(new JScrollPane(criarTabelaDenuncias()), BorderLayout.CENTER);

        // Adicionar tudo à janela principal

        add(painelGrafico, BorderLayout.NORTH);
        add(painelResumo, BorderLayout.CENTER);
        add(painelListaDenuncias, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Método para carregar algumas denúncias de exemplo

    private void carregarDenunciasExemplo() {
        denuncias.add(new Denuncia(1, "Problema na iluminação pública", "Iluminação quebrada na rua X", "Aberta", new java.util.Date(), null, 1, 1));
        denuncias.add(new Denuncia(2, "Buraco na rua Y", "Buraco perigoso na rua Y", "Fechada", new java.util.Date(), new java.util.Date(), 2, 2));
        denuncias.add(new Denuncia(3, "Lixo acumulado na praça Z", "Lixo sendo deixado na praça Z", "Aberta", new java.util.Date(), null, 1, 3));
        // Adicione mais denúncias conforme necessário
    }

    // Método para criar gráfico de barras sobre as denúncias

    private ChartPanel criarGraficoDenuncias() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // Adicionando dados fictícios (você pode substituí-los com dados reais)

        dataset.addValue(10, "Denúncias", "Janeiro");
        dataset.addValue(15, "Denúncias", "Fevereiro");
        dataset.addValue(20, "Denúncias", "Março");
        dataset.addValue(5, "Denúncias", "Abril");

        // Criando o gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Quantidade de Denúncias por Mês", 
                "Mês", 
                "Quantidade", 
                dataset 
        );

        return new ChartPanel(chart);
    }

    // Método para criar o painel com o resumo das denúncias

    private JPanel criarResumoDenuncias() {
        JPanel painelResumo = new JPanel();
        painelResumo.setLayout(new GridLayout(2, 1, 10, 10));

        // Contagem de denúncias abertas e fechadas
        long denunciasAbertas = denuncias.stream().filter(d -> "Aberta".equals(d.getStatus())).count();
        long denunciasFechadas = denuncias.stream().filter(d -> "Fechada".equals(d.getStatus())).count();

        // Adicionando o resumo no painel

        painelResumo.add(new JLabel("Total de Denúncias Abertas: " + denunciasAbertas));
        painelResumo.add(new JLabel("Total de Denúncias Fechadas: " + denunciasFechadas));

        return painelResumo;
    }

    // Método para criar a tabela com as últimas denúncias

    private JTable criarTabelaDenuncias() {
        String[] colunas = {"ID", "Título", "Descrição", "Status"};
        Object[][] dados = new Object[5][4];

        for (int i = 0; i < 5 && i < denuncias.size(); i++) {
            Denuncia denuncia = denuncias.get(i);
            dados[i][0] = denuncia.getId();
            dados[i][1] = denuncia.getTitulo();
            dados[i][2] = denuncia.getDescricao();
            dados[i][3] = denuncia.getStatus();
        }

        tabelaDenuncias = new JTable(dados, colunas);
        return tabelaDenuncias;
    }

    // Main para inicializar o Dashboard

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DashboardAdmin());
    }
}
