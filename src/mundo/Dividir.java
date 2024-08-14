/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author ACER
 */
public class Dividir {

    int dividendo, divisor, operador;

    public Dividir() {

    }

    public float dividir(int[] operandos, int operador) {
        this.dividendo = operandos[0];
        this.divisor = operandos[1];

        this.operador = operador;

        if (this.operador == 0) {
            return (float) dividendo / divisor;
        }
        if (this.operador == 1) {
            return dividendo % divisor;
        }
        if (this.operador == 2) {
            return (int) dividendo / divisor;
        }
        return -1;
    }

}
