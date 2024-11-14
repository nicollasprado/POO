/*
* [BEE 1253] Júlio César usava um sistema de criptografia, agora conhecido como Cifra de César, que trocava cada letra pelo equivalente em duas posições adiante no alfabeto (por exemplo, 'A' vira 'C', 'R' vira 'T', etc.). Ao final do alfabeto nós voltamos para o começo, isto é 'Y' vira 'A'. Nós podemos, é claro, tentar trocar as letras com quaisquer número de posições. Coloque um comentário com o texto “TADS”.
Entrada
A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste é composto por duas linhas. A primeira linha contém uma string com até 50 caracteres maiúsculos ('A'-'Z'), que é a sentença após ela ter sido codificada através desta Cifra de César modificada. A segunda linha contém um número que varia de 0 a 25 e que representa quantas posições cada letra foi deslocada para a direita.
Saída
Para cada caso de teste de entrada, imprima uma linha de saída com o texto decodificado (transformado novamente para o texto original) conforme as regras acima e o exemplo abaixo.
* */


import java.util.Scanner;

public class Q3 {

    public static char shiftChar(char letter, int shiftAmount){
        int asciiShifted = letter + shiftAmount;
        if(asciiShifted > 90){
            asciiShifted -= 26;
        }
        char charShifted = (char)asciiShifted;
        return charShifted;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtTests = input.nextInt();
        char[] decodedCharset = new char[qtTests];
        for(int i=0; i < qtTests; i++){
            String rawLetter = input.next();
            int shiftAmount = input.nextInt();
            char letterChar = rawLetter.charAt(0);
            decodedCharset[i] = shiftChar(letterChar, shiftAmount);
        }

        for(int j=0; j < qtTests; j++){
            System.out.print(decodedCharset[j]);
        }
    }
}
