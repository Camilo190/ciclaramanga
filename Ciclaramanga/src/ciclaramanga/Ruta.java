

package ciclaramanga;


public class Ruta {
   private String lugarInicio;
   private String lugarFin;
   private String nombre;
   private String horario;
   private Integer tiempoPromedio;
   private Integer distancia;

    public Ruta(String lugarInicio, String lugarFin, String nombre, String horario, Integer tiempoPromedio, Integer distancia) {
        this.lugarInicio = lugarInicio;
        this.lugarFin = lugarFin;
        this.nombre = nombre;
        this.horario = horario;
        this.tiempoPromedio = tiempoPromedio;
        this.distancia = distancia;
    }

    public String getLugarInicio() {
        return lugarInicio;
    }

    public void setLugarInicio(String lugarInicio) {
        this.lugarInicio = lugarInicio;
    }

    public String getLugarFin() {
        return lugarFin;
    }

    public void setLugarFin(String lugarFin) {
        this.lugarFin = lugarFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getTiempoPromedio() {
        return tiempoPromedio;
    }

    public void setTiempoPromedio(Integer tiempoPromedio) {
        this.tiempoPromedio = tiempoPromedio;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }
   
    
    
    
    
    
}
