import java.util.Date;

public class Interacao {
    private int id;
    private int denunciaId;
    private int usuarioId;
    private String tipoInteracao; 
    private Date dataInteracao;

    public Interacao(int id, int denunciaId, int usuarioId, String tipoInteracao, Date dataInteracao) {
        this.id = id;
        this.denunciaId = denunciaId;
        this.usuarioId = usuarioId;
        this.tipoInteracao = tipoInteracao;
        this.dataInteracao = dataInteracao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDenunciaId() {
        return denunciaId;
    }

    public void setDenunciaId(int denunciaId) {
        this.denunciaId = denunciaId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getTipoInteracao() {
        return tipoInteracao;
    }

    public void setTipoInteracao(String tipoInteracao) {
        this.tipoInteracao = tipoInteracao;
    }

    public Date getDataInteracao() {
        return dataInteracao;
    }

    public void setDataInteracao(Date dataInteracao) {
        this.dataInteracao = dataInteracao;
    }
}
