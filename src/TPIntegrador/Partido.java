/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPIntegrador;

import java.util.List;

/**
 *
 * @author leand
 */
public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private Integer golesEquipo1;
    private Integer golesEquipo2;

    public Partido(Equipo equipo1, Equipo equipo2, Integer golesEquipo1, Integer golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
    public static Partido BuscarPartidoPorNombreEquipos(List<Partido> partidos, String nombreEquipo1, String nombreEquipo2) {
        Partido partidoEncontrado = partidos.stream()
                .filter(partido -> partido.getEquipo1().getNombre().equals(nombreEquipo1) 
                        && partido.getEquipo2().getNombre().equals(nombreEquipo2))
                .findAny()
                .orElse(null);
        return partidoEncontrado;
    }
    
}
