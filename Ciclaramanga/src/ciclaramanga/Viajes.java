

package ciclaramanga;


public class Viajes {
    private Ruta ruta;
    private Usuario usuario;
    private Integer tiempoGastado;
    private boolean estado;

    public Viajes(Ruta ruta, Usuario usuario, Integer tiempoGastado, boolean estado) {
        this.ruta = ruta;
        this.usuario = usuario;
        this.tiempoGastado = tiempoGastado;
        this.estado = estado;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getTiempoGastado() {
        return tiempoGastado;
    }

    public void setTiempoGastado(Integer tiempoGastado) {
        this.tiempoGastado = tiempoGastado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
