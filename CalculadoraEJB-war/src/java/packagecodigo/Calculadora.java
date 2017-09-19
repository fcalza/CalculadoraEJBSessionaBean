/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagecodigo;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pacotecodigo.CalculadoraSessionBeanLocal;

@ManagedBean(name = "calculadora")
@RequestScoped
/**
 *
 * @author Calza
 */
public class Calculadora {

    @EJB
    CalculadoraSessionBeanLocal calcBeanLocal;
    String valor1, valor2, resultado;

    public Calculadora() {

    }

    public String somar() {
        Double valor = calcBeanLocal.somar(new Double(this.valor1), new Double(this.valor2));
        this.resultado = valor.toString();
        //this.setResultado(resultado);
        return "faces/index.xhtml";
    }

    public String subtrair() {
        Double valor = calcBeanLocal.subtrair(new Double(this.valor1), new Double(this.valor2));
        this.resultado = valor.toString();
        //this.setResultado(resultado);
        return "faces/index.xhtml";
    }

    public String dividir() {
        Double valor = calcBeanLocal.dividir(new Double(this.valor1), new Double(this.valor2));
        this.resultado = valor.toString();
        //this.setResultado(resultado);
        return "faces/index.xhtml";
    }

    public String limpar() {
        this.resultado = "";
        this.valor1 = "";
        this.valor2 = "";
        return "faces/index.xhtml";
    }

    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}
