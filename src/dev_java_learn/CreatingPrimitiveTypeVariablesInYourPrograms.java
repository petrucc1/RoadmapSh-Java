package dev_java_learn;

public class CreatingPrimitiveTypeVariablesInYourPrograms {
    // Os oito tipos de dados primitivos suportados pela linguagem de programação Java são:

    // Byte - aceita números inteiros com até 8 bits entre -128 e 127, pode ajudar a economizar memória em matrizes grandes, em situações em que a economia de memória realmente importa.
    byte exemplo1 = 127;

    // Short - aceita números inteiros com até 16 bits entre -32.768 e 32.767, pode ajudar a economizar memória em matrizes grandes, em situações em que a economia de memória realmente importa.
    short exemplo2 = 32767;

    // Int - aceita números inteiros com até 32 bits entre -2^31 e 2^31-1.
    int exemplo3 = 65535;

    // Long - aceita números inteiros com até 64 bits entre -2^63 e 2^63-1.
    long exemplo4 = 1234567890;

    // Float - é um tipo de dados de ponto flutuante com até 32 bits. Tal como acontece com as recomendações para byte e short, use um float (em vez de double) se você precisar economizar memória em grandes matrizes de números de ponto flutuante. Este tipo de dados nunca deve ser usado para valores precisos, como moeda. Para isso, você precisará usar a classe java.math.BigDecimal em vez disso.
    float exemplo5 = 3.14f;

    // Double - é um tipo de dados de ponto flutuante com até 64 bits. Para valores decimais, esse tipo de dado é geralmente a escolha padrão. Como mencionado acima, este tipo de dados nunca deve ser utilizado para valores precisos, como moeda.
    double exemplo6 = 1.23456789;

    // Boolean - é um tipo de dados que tem apenas dois valores possíveis: true e false. Use este tipo de dados para sinalizadores simples que rastreiam condições verdadeiras/falsas. Esse tipo de dado representa um bit de informação, mas seu "tamanho" não é algo definido com precisão.
    boolean exemplo7 = true;

    // Char - é um tipo de dados é um único character Unicode de 16 bits. Tem um valor mínimo de \u0000 (ou 0) e um valor máximo de \uffff (ou 65.535 inclusive).
    char exemplo8 = 'a';

    // Em Java, além dos tipos primitivos, existe a classe String, usada para representar textos. Sempre que você escreve algo entre aspas duplas, como:
    String s = "this is a string"; // o Java cria automaticamente um novo objeto String.
    // As Strings são imutáveis, ou seja: depois que uma String é criada, o seu conteúdo não pode ser alterado. Se você “modifica” uma String, na verdade, um novo objeto é criado e a variável passa a apontar para ele. Isso aumenta a segurança, possibilita otimizações como o String Pool e evita que dados sensíveis sejam modificados por outras partes do código.
    // A classe String não é um tipo primitivo, mas recebe tratamento especial pelo Java, fazendo muita gente pensar nela como se fosse.
    // Para manipulações de texto que exigem mudança real do conteúdo, usam-se classes mutáveis, como StringBuilder e StringBuffer. A diferença entre elas é que StringBuffer é thread-safe, ou seja: ela é segura para uso em ambientes com múltiplas threads ao mesmo tempo, pois os seus métodos são sincronizados, evitando que duas threads modifiquem o mesmo objeto simultaneamente e causem inconsistências.
    // Já StringBuilder não é thread-safe, mas é mais rápido quando não há concorrência entre threads.

    // Uma String é um objeto em Java, mas raramente devemos criá-la usando new, porque isso sempre gera um novo objeto desnecessário e não aproveita o String Pool. O jeito recomendado é usar literais (texto entre aspas), que são mais rápidos, economizam memória e permitem reaproveitamento automático de Strings iguais.

    // Exemplo recomendado (literal):
    String nome1 = "Maria";

    // Exemplo não recomendado (usando new):
    String nome2 = new String("Maria");

    // Um literal inteiro é simplesmente um número escrito diretamente no código. Por padrão, um literal inteiro é do tipo int, a menos que termine com L (maiúsculo recomendado), indicando que é do tipo long. Primitivos integrais (byte, short, int e long) podem receber valores vindos de literais int, desde que caibam no seu intervalo; já valores maiores que int devem ser escritos como literais long. Literais inteiros podem ser escritos em diferentes sistemas numéricos: decimal (base 10), hexadecimal (base 16, prefixo 0x), e binário (base 2, prefixo 0b, disponível desde Java 7).

    // 26 em decimal
    int decimalValue = 26;

    // 26 em hexadecimal (0x indica hexadecimal)
    int hexadecimalValue = 0x1a;

    // 26 em binário (0b indica binário)
    int binaryValue = 0b11010;

    // literal long (nota: L maiúsculo é recomendado)
    long bigNumber = 1234567890123L;
    // O L serve para dizer ao compilador:
    // "Este número é um literal do tipo long, não tente tratá-lo como int."

    // Um literal de ponto flutuante é um número com casas decimais escrito diretamente no código. Por padrão ele é tratado como double, e só se torna float quando termina com f ou F. A notação científica com E ou e também pode ser usada. Na prática, double deve ser usado na maioria das situações porque oferece maior precisão, melhor estabilidade nos cálculos e é o tipo mais utilizado pelas bibliotecas padrões de Java. Float deve ser escolhido apenas quando há necessidade real de economizar memória ou quando se trabalha em contextos específicos, como programação gráfica, jogos ou sistemas embarcados, onde o tamanho reduzido do tipo pode fazer diferença.

    // Exemplo literal double padrão:
    double a = 12.5;

    // Exemplo double em notação científica:
    double b = 1.25e1;

    // Exemplo literal float obrigatório com f:
    float c = 12.5f;

    //Literais de caracteres e literais de String representam texto diretamente no código e podem conter qualquer caractere Unicode. Um literal char usa aspas simples e um literal String usa aspas duplas. Caso o editor não suporte certos caracteres, é possível usar escapes Unicode como \u00F1. Java também fornece escapes especiais como \n para nova linha, \t para tabulação e \ para barra invertida. O literal null pode ser usado para indicar ausência de objeto e só pode ser atribuído a tipos por referência. Há ainda o literal de classe, escrito com o nome do tipo seguido de .class, que representa o objeto Class correspondente ao tipo.

    // Exemplo de literal char:
    char letra = 'A';

    // Exemplo com escape Unicode:
    char especial = '\u00E1';

    // Exemplo de literal String com character Unicode embutido:
    String frase = "S\u00ED Se\u00F1or";

    // Exemplo com sequência de escape:
    String texto = "Linha 1\nLinha 2";

    // Exemplo de uso de null:
    String nome = null;

    // Exemplo de literal de classe:
    Class<?> c1 = String.class;

    // Literais numéricos podem conter sublinhados a partir do Java 7 para melhorar a legibilidade de números longos. O sublinhado pode aparecer entre dígitos em literais decimais, hexadecimais, binários e em literais de ponto flutuante, desde que não esteja no início ou no final do número, nem encostado ao ponto decimal, nem antes dos sufixos F ou L, nem dentro dos prefixos 0x ou 0b. O objetivo é tornar valores extensos mais fáceis de ler sem alterar o valor numérico.

    // Exemplo válido separando grupos de dígitos:
    long numero = 1_234_567_890L;

    // Exemplo válido em hexadecimal:
    int cor = 0xFF_A0_00;

    // Exemplo válido em binário:
    byte mascara = 0b0011_1100;

    // Exemplo inválido no final do literal:
    int x = 52_; // inválido

    // Exemplo inválido próximo ao ponto decimal:
    float pi = 3_.14f; // inválido

    // Exemplo inválido dentro do prefixo:
    int h = 0_x52; // inválido

    // Referência: https://dev.java/learn/language-basics/primitive-types/
}
