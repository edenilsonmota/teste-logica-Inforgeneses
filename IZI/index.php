<?php
/**
 * Escreva um programa que imprima os números de 1 a 50. Mas, para múltiplos de 3, em vez do número, imprima "Fizz", e para múltiplos de 5, imprima "Buzz". Para números que são múltiplos de ambos, imprima "FizzBuzz".
 */



for($i = 1; $i <= 50; $i++){
    $num = $i;
    
    //multiplos de 3 e 5
    if($num % 3 == 0 && $num % 5 == 0){
        echo "FizzBuzz\n";
    //multiplos 3
    }elseif($num % 3 == 0){
        echo "Fizz\n";
    //multiplos 5    
    }elseif($num % 5 == 0){
        echo "Buzz\n";
    //numeros restantes    
    }else{
        echo $num . "\n";
    }
    
}