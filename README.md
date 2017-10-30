# ObjectMaze
Ejercicio de generación de laberintos aplicando orientación a objetos. 
Se trata de generar un laberinto en con, con un tesoro en su interior y un punto de partida en alguno de los extremos. 
El punto de partida viene representado por "o", el tesoro a encontrar viene representado por "*".  Las paredes del laberinto vendrán representadas por carácteres '/' y '\' elegidos aleatoriamente. Las paredes extremas se representarán con los caracteres "|" para los laterales y "_" para el techo y el suelo
Ejemplo:
```
___o_____________________________________
|\//\//\\//\///\\/\/\/\/\\///\\\/////\\\|
|\\\\\//////\/\//\/\\\\\\\////\\/\\///\/|
|////\//\/\/\\//\/\/\\\/\//\\////\//\/\/|
|\/\\///\/\/\\\/\/\\\//\//\\\\\\/\\\\\\/|
|////\///\////////\\///\\\/////\////\\//|
|\///\\\/\/\////\\/\\\\///\*/\/\\/\/\/\\|
|/\\////\//////\\///\\/\//\/\//\\\\/////|
|//\\\///\/////\////\/\/\\\/\\\//\/\\///|
|/\\/////\////\\//\\/\\\\\////\\//\\\\\\|
|\/\\\\\/\////\\\\\\\\\\\\//\/\\\////\\/|
|\\\/\\\\/////\/\///\/\\\/\/\\\\//\\\\\\|
|\\\\\\\//\\//\/\/\////\/\/\\\//\\/\\\//|
|////\\\\\\/\\//\\\\\\\\//\///\\\\/\\\\\|
|\/\/\\\\\/\/\\/\\\\\/\\//\\\//\\\\\\///|
|/\//\//\\//\/\\\///\/\\///\\\\///\//\\\|
|\\///\\/\/\\\\/////\\\\///\\\\\\/\\/\/\|
|\/\\\/\//\/\//\\/////////\////\/\\\///\|
|//\\\///\\/\\//////////\/\//\///\\\\\\\|
|\/\/\\/\\\\//\//\\/\//\///\\//\\//\//\/|
|//\\/\\/\///\////\//\/\//\\/\\\/\\/\///|
|\//\/\/\/////\\//\///\\\\//\////\\/\\\\|
|///\/\///\\/\//\//\\\\\\\\//\\\\\\\/\/\|
|//\///\//\\////\\\/\/\/\//\//\\//\\\\\\|
|\///\\\///\\/\\/\\///\\\\/\////\\\////\|
|//\/\\/\\\\/\////\\\\\\/\/\\//\\\\\\\/\|
|//\\//\//\/\\////\\//\/\/\\//\/\\\\//\\|
|\//\\//\\//\//\\//\\\\//\\\\\//\\//\\//|
|\//\\\/\/\//\///\\//\////\///\//\\/\\//|
|\\/\////\/\\\\\/\\//\\\\/////\/\/\////\|
|\\//\\//\\//\//\////\\/\\//\\//\//\\/\/|
|//////////\\\/\////\\////\/\/\//\/\\\//|
|\/\///\\/\///\\/\/////\//\/\//\/\\\//\/|
|//////\/\\///\/\//\\//\\/\\\////\\\/\\\|
|\\/\///\\\\\\/\/\\/////////\\\\/\//\//\|
|\/\\/\\/\/\\/\//\\\\///\\\\\\//\\//////|
|///\/\\\/\/\\///\\\/\/\////\\\\\\\///\\|
|/\//\/\\/\\\\\\\\\\\/\\/\\//\/\\/\/\\/\|
|/\\/\\/\\\\\/\/\//\/\////////\\\\/\///\|
|\\\\\/\////\/\/\//\\//\\\\\/\\////\\///|
_________________________________________
```
Una vez conseguida la generación del laberinto por consola, ampliar la complejidad del mismo dando soporte a otros caracteres ascii para la representación de las paredes ("|","_"," ") y grabar el laberinto en un fichero de texto (codificación utf-8) a su elección. 

Es importante destacar que pretendemos hacer una versión online del generador que use gráficos reales y la nueva clase canvas en un futuro, por lo que conviene representar adecuadamente los elementos del problema como objetos, que en un futuro habrá que pintar gráficamente...
