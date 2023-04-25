/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPIntegrador;

/**
 *
 * @author leand
 */
public class Pronostico {
    private Partido partido;
    private ResultadoEnum resultado;
    private int puntaje;

    public Pronostico(Partido partido, ResultadoEnum resultado) {
        this.partido = partido;
        this.resultado = resultado;
        this.puntaje = 0;
        
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    public int calcularpuntajepronostico()
    {   
        ResultadoEnum resultado = this.partido.decidirResultado();
        if(resultado== this.resultado)
        {
        
        return 1;
        }
        else 
        {
        return 0;
        }
}
}
    
