import java.util.Date;

public class Comentario {
    private int id;
    private int denunciaId;
    private int usuarioId;
    private String comentario;
    private Date dataComentario;

    public Comentario(int id, int denunciaId, int usuarioId, String comentario, Date dataComentario) {
        this.id = id;
        this.denunciaId = denunciaId;
        this.usuarioId = usuarioId;
        this.comentario = comentario;
        this.dataComentario = dataComentario;
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getDataComentario() {
        return dataComentario;
    }

    public void setDataComentario(Date dataComentario) {
        this.dataComentario = dataComentario;
    }
}
