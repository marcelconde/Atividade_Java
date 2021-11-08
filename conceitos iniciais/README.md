# Conceitos iniciais Java
Oii pessoal, hoje vou fazer um breve resumo de alguns conceitos iniciais do `Java`.

# Algorítmos
##    Estrutura de dados

* Tipos de Dados;
* Variáveis;
* Constantes;
* Operadores aritméticos, relacionais e lógicos;
* Atribuição;
* Comandos de condição ou seleção;
* Comandos de repetição.

Vamos ver apenas 5 `tipos de dados`
* Inteiro (int) = Para representar números inteiros
* Real (double) = Para representar números que podem ser fracionados
* Lógico (booleano) = Para representar estado ou situação de verdadeiro ou falso
* Caractere (char) = Utilizado para armazenar um único caractere na memória
* Cadeira de caracteres (string) = Utilizado para armazenar uma sequência de caracteres na memória

`As variáveis seram criadas com base nos tipos de dados`

# Operadores
## Operadores aritméticos 
* Adição (+);
* Subtração (-);
* Multiplicação (*);
* Divisão real entre dois números (/);
* Divisão inteira entre dois números inteiros (/);
* Resto da divisão inteira entre dois números inteiros (%).

## Operadores relacionais
* Igual a (==);
* Diferente de (!=);
* Maior que (>);
* Menor que (<);
* Maior ou igual a (>=);
* Menor ou igual a (<=).

## Operadores lógicos
* E (AND);
* OU (OR);
* NÃO (NOT).
 
 `Os símbolos dos operadores booleanos são: (! - não)   (& - E)   (| - ou)`

 Para a montagem de algumas expressões, vamos precisar seguir uma ordem correta dos operadores.
 que é essa na imagem a seguir:
 <img src= "https://media.discordapp.net/attachments/722281505786953749/905953170340057138/Captura_de_tela_de_2021-11-04_19-48-10.png">
 
# CONSTANTES E VARIÁVEIS
## CONSTANTES
 * Possui valor fixo durante execução do programa;
 * Pode ser numérica, lógica ou literal.

## variáveis
 * Um dos conceitos mais importantes na construção de algoritmos.
 *  Representa um espaço de memória reservado para armazenar
 * determinado tipo de dado;
 * Deve receber um nome para referenciação e modificação;
 * Deve possuir um tipo associado;
 * Quando um algoritmo termina sua execução, todas as variáveis são
 * apagadas da memória;
 * Só podem armazenar um dado por vez.
 
 `Nomes de Variáveis`
  * O nome de uma variável deve ser único dentro de um mesmo algoritmo.
  * Deve começar por uma letra, podendo-se incluir após esta letra outras letras, dígitos ou o sinal de        underline ( _ ). Este tipo de nome é conhecido como identificador.
  * O identificador não pode possuir acentos, nem ser igual ao nome de um comando.

  # ATRIBUIÇÃO
   Atribuição, como o próprio nome já diz, atribui ou associa um valor a uma variável ou constante.

        nome = "josé";
        media = (nota1 + nota2)/2;
         <nomefunção> (<parâmetro1>, <parâmetro2>, ...)

# Comando de entrada de dados em
Para fazer a leitura de dados do teclado em programas Java, utilizaremos o objeto Scanner:

    Scanner s = new Scanner(System.in);
    int numero = s.nextInt();

