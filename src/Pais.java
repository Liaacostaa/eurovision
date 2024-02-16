import java.util.*;

public class Pais implements Comparable<Pais> {
    private String nombre;
    private String participante;
    private String cancion;
    private List<Integer> listaPuntos;
    private Map<Pais,Integer> puntosAsignados;
    public Pais(String nombre,String participante,String cancion){
        this.nombre=nombre;
        this.participante=participante;
        this.cancion=cancion;
        listaPuntos = new ArrayList<>();
        puntosAsignados=new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParticipante() {
        return participante;
    }
    public void setParticipante(String participante) {
        this.participante = participante;
    }
    public String getCancion() {
        return cancion;
    }
    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public List<Integer> getListaPuntos() {
        return listaPuntos;
    }

    public void setListaPuntos(List<Integer> listaPuntos) {
        this.listaPuntos = listaPuntos;
    }

    public Map<Pais, Integer> getPuntosAsignados() {
        return puntosAsignados;
    }

    public void setPuntosAsignados(Map<Pais, Integer> puntosAsignados) {
        this.puntosAsignados = puntosAsignados;
    }
    public int getTotalPuntos(){
        int contador = 0;
        for (int puntos:listaPuntos) {
            contador += puntos;
        }
        return contador;
    }

    public boolean votar(Pais pais, int puntos){
        if (this.equals(pais))
            return false;
        if (puntos >= 1 && puntos <= 8){
            listaPuntos.add(puntos);
        }
        if (puntos == 10 || puntos== 12){
            if (listaPuntos.contains(puntos)){
                return false;
            }else {
                listaPuntos.add(puntos);
                return true;
            }
        }
        return false;
    }
    public int ordenarPaises(){
        int contador = 0;
        for (int puntos : listaPuntos) {
            contador += puntos;
        }
        return contador;
    }

    @Override
    public int compareTo(Pais otroPais) {
        return this.getNombre().compareTo(otroPais.getNombre());
    }


    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", participante='" + participante + '\'' +
                ", cancion='" + cancion + '\'' +
                ", listaPuntos=" + listaPuntos +
                '}';
    }
}
