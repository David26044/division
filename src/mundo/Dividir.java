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


    public Dividir() {

    }

    public float dividir(int[] operandos, int operador) {
        int dividendo = operandos[0];
        int divisor = operandos[1];

        if (operador == 0) {
            return (float) dividendo / divisor;
        }
        if (operador == 1) {
            return dividendo % divisor;
        }
        if (operador == 2) {
            return (int) dividendo / divisor;
        }
        return -1;
    }

}
