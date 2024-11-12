import java.util.Date;

public class Denuncia {
    private int id;
    private String titulo;
    private String descricao;
    private String status; 
    private Date dataCriacao;
    private Date dataFechamento;
    private int usuarioId;
    private int tipoDenunciaId;

    public Denuncia(int id, String titulo, String descricao, String status, Date dataCriacao, Date dataFechamento, int usuarioId, int tipoDenunciaId) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.dataCriacao = dataCriacao;
        this.dataFechamento = dataFechamento;
        this.usuarioId = usuarioId;
        this.tipoDenunciaId = tipoDenunciaId;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getTipoDenunciaId() {
        return tipoDenunciaId;
    }

    public void setTipoDenunciaId(int tipoDenunciaId) {
        this.tipoDenunciaId = tipoDenunciaId;
    }
}
