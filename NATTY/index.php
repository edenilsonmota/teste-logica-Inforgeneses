<?php

$itens = array(0, 1); //Valores iniciais - Entrada
$i = 0; 
$j = 1;
$registros = 39; //tamanho 40(0-39) do array

while($i < $registros){
    $soma = $itens[$i] + $itens[$j]; //$soma representa a soma dos dois últimos valores do array 
    array_push($itens, $soma); //valor da $soma, sendo empilhado no array

    //incrementando valor $i e $j para percorrer todos os indices.
    $i++; 
    $j++;
}

echo implode(", ", $itens); //SAIDA


?>