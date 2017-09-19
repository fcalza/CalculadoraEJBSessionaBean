/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotecodigo;

import javax.ejb.Local;

/**
 *
 * @author Calza
 */
@Local
public interface CalculadoraSessionBeanLocal {

    Double dividir(Double numero1, Double numero2);
    Double somar(Double numero1, Double numero2);
    Double subtrair(Double numero1, Double numero2);
    String limpar();
    
}
