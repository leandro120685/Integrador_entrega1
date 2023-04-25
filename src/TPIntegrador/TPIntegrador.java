/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TPIntegrador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TpIntegrador {

    public static void main(String[] args) throws IOException {
        String ubicacionArchivoPronosticos = "C:\\archivos_\\pronosticos.csv";
        String ubicacionArchivoPartidos = "C:\\archivos\\partidos.csv";

        List<Pronostico> pronosticos = new ArrayList<>();
        List<Partido> partidos = new ArrayList<>();
        
        
        Path pathPartidos = Paths.get(ubicacionArchivoPartidos);
        boolean primeraLinea = true;
        for (String partidoLinea : Files.readAllLines(pathPartidos)) {
            
                String[] columnas = partidoLinea.split(";");

                Equipo equipo1 = new Equipo(columnas[0]);
                Equipo equipo2 = new Equipo(columnas[3]);

                Partido partido = new Partido(equipo1,equipo2,Integer.parseInt(columnas[1]),Integer.parseInt(columnas[2]));
                partidos.add(partido);
  
            primeraLinea = false;
        }

        Path pathPronosticos = Paths.get(ubicacionArchivoPronosticos);
        for (String Pronosticoslinea : Files.readAllLines(pathPronosticos)) {
            String[] columnas = partidoLinea.split(";");
            Pronostico Pronostico = new Pronostico(new Partido(equipo1,equipo2, integer.SIZE,integer.SIZE,ResultadoEnum.GANA_EQUIPO_1));
            pronosticos.add(pronostico);
        }
        int puntajeFinalPersona = 0;
        for(Pronostico pronostico : pronosticos)
        {
            puntajeFinalPersona = puntajeFinalPersona + pronostico.calcularpuntajepronostico();
          
        }  
          System.out.println(puntajeFinalPersona);
    }       
    
 }