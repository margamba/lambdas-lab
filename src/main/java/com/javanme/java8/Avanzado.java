package com.javanme.java8;

import java.util.List;
import java.util.stream.Collectors;


/**
 * Clase con ejercicios nivel avanzado
 * Created by aalopez on 18/08/15.
 */
public class Avanzado {

    /**
     * Realice la suma de los números pasados por param.
     * Use la API Stream y el método {@code +reduce(T, BinaryOperator<T>):T} para definir la forma en la cual se va
     * a reducir el stream a un solo valor (la suma de todos sus números).
     *
     * @param numeros Listado de números a sumar.
     * @return Suma de los números pasados por param.
     */
    public int ejercicio1(List<Integer> numeros) throws UnsupportedOperationException{
       return  numeros.stream().reduce( 0, (x, y) -> x +y );
    }

    /**
     * Obtenga el máximo de los números pasados por param
     * Use la API Stream y el método {@code +reduce(BinaryOperator<T>):Optional<T>} para definir la forma en la cual se va
     * a reducir el stream a un solo valor (el máximo de los números).
     *
     * @param numeros Listado de números.
     * @return El máximo de los números pasados por param.
     */
    public long ejercicio2(List<Long> numeros) throws UnsupportedOperationException{
        //Dos versiones
       //return numeros.stream().collect(Collectors.summarizingLong(Long::longValue)).getMax();
       return numeros.stream().collect(Collectors.reducing(Long::max)).get();
    }
}
