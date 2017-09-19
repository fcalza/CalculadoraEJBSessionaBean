/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotecodigo;

import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

//@ManagedBean(name = "calculadorasessionbean")
//@RequestScoped
/**
 *
 * @author Calza
 */
@Stateless
public class CalculadoraSessionBean implements CalculadoraSessionBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Double somar(Double numero1, Double numero2) {
        return numero1+numero2;
    }

    @Override
    public Double subtrair(Double numero1, Double numero2) {
        return numero1-numero2;
    }

    @Override
    public Double dividir(Double numero1, Double numero2) {
        return numero1/numero2;
    }

    @Override
    public String limpar() {
        
        return "";
    }

  

}
