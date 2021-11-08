# Conceitos iniciais Java
Oii pessoal, hoje vou fazer um breve resumo de alguns conceitos iniciais do `Java`.

# Algorítmos
## Estrutura de dados

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
 
## Nomes de Variáveis
  * O nome de uma variável deve ser único dentro de um mesmo algoritmo.
  * Deve começar por uma letra, podendo-se incluir após esta letra outras letras, dígitos ou o sinal de        underline ( _ ). Este tipo de nome é conhecido como identificador.
  * O identificador não pode possuir acentos, nem ser igual ao nome de um comando.

# Estrutura do código

Antes de começar a programar, devemos entender um pouco sobre a estrutura do código.

Todas as linguagens de programação precisam ser convertidas para o código binário, que é a linguagem que a máquina entende, para isso, 
utilizamos a IDE (Ambiente de desenvolvimento integrado), ela funciona como um tradutor/conversor, converte o que estamos escrevendo 
para uma linguagem que o computador entenda, nesse caso, o código binário. No caso do Java, quando compilamos o código um novo 
arquivo é criado, esse arquivo tem terminação `.class`, se trata do binário do java. Temos que declarar esse binário para que possamos 
rodar o código, fazemos isso da seguinte forma:

    public class <nome do arquivo>{
        public static void main(String[] args){
            <código...>
        }
    }

# ATRIBUIÇÃO
   Atribuição, como o próprio nome já diz, atribui ou associa um valor a uma variável ou constante.

        nome = "josé";
        media = (nota1 + nota2)/2;
        <nomefunção> (<parâmetro1>, <parâmetro2>, ...)

# Comando de entrada de dados
Para fazer a leitura de dados do teclado em programas Java, utilizaremos o objeto Scanner:

    Scanner s = new Scanner(System.in);
    int numero = s.nextInt();
    double numero = s.nextdouble();
`s é o nome dado ao Scanner, pode ser qualquer outro nome da sua preferência `

O objeto Scanner pode ser usado com variáveis numéricas, lógicas e do tipo texto.

Obs. Para o Scanner funcionar, devemos importar ele, fazemos isso digitando o seguinte comando no começo do código: 

    import java.util.Scanner;

# Comando de saída de dados

* Para escrevermos na tela, usaremos a função println, disponível no Java.
* Para concatenar uma variável com um texto, usamos o sinal +.

        System.out.println(variável ou expressão ou mensagem);
        System.out.println("O saldo atual é:" + saldo);


# Exemplo de código com entrada e saida de dados
    import java.util.Scanner;
    
    public class exercicio{
        public static void main(String[] args){
            int numero1, numero2;
            double media = 0;

        System.out.println("digite dois numeros");
        Scanner s = new Scanner(System.in);
        numero1 = s.nextInt();
        numero2 = s.nextInt();

        media = (numero1 + numero2)/ 2;
        System.out.println("a média é:" + media);
        }
    }