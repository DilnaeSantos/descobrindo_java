package primeiropacote; // e o nome da pasta onde o arquivo esta salvo (nome de pacote tem que ser tudo minúsculo porque?? porque alguem bem mais velho que vc decidiu assim)
/** PACKAGE: é um mecanismo que permite definir a qual pacote/pasta uma classe pertence, evitando conflitos de nomes, e o nome do pacote é escrito em letras minúsculas por convenção da linguagem Java. porque?? não faço ideia!!!
*/

public class PrimeiroPrograma { // e o nome do arquivo (nome de classe começa com letra maiúscula estilo CamelCase primeira letra maiúscula em cada palavra, sempre!!)
    /** PUBLIC: significa que a classe/método pode ser acessado de qualquer lugar da aplicação (dss outras pastas e arquivos)
        CLASS: é um modelo para criar objetos aonde você pode passar métodos e atributos (e como uma pré-definição tipo um carro tem 4 rodas 4 portas 1 motor etc, e depois vc pega esse modelo e define as características de cada um as rodas vai ser de tal polegada o motor vai ser de tal potência etc.) */
    public static void main(String[] args) {
    // esse é o MÉTODO principal, onde a aplicação começa a ser executada
    // se vc escrever psvm e apertar 'tab' o próprio ide (VScode) ja escreve o comando completo pra vc
    /** MÉTODO: é uma sequência de instruções que realiza uma tarefa específica
        STATIC: diz ao java que este método pertence a classe, e não a um objeto de classe dessa forma
        a classe recebe os argumentos diretamente da linha de comando de saída
        VOID: significa que o método não retorna nenhum valor
        MAIN: é o nome do método que é executado quando a aplicação é iniciada
        STRING[] ARGS: é um array de strings que recebe os argumentos da linha de comando de saída (um array é um espaço na memória que armazena vários valores do mesmo tipo, nesse caso strings=letras)
    */
        System.out.println("Hello, World!"); // só se preocupa em entender essa linha aqui
        // esse e a linha de comando de saída que imprime a mensagem na tela
        // se vc escrever sout e apertar 'tab' o próprio ide (VScode) ja escreve o comando completo pra vc
        /** SYSTEM: é uma classe do Java que você usa para acessar comandos do sistema, como exemplo entrada e saída
            OUT: é um objeto da classe System que representa a saída padrão do console (esse e o comando que imprime alguma coisa no terminal mas não sozinho, se vc sabe o básico OUT é saída em inglês)
            PRINTLN: é um método do objeto OUT que imprime a mensagem passada como argumento e pula para a próxima linha
            ou
            PRINT: é um método do objeto OUT que imprime a mensagem passada como argumento sem pular para a próxima linha
        */
    }
}

/**
sobre case sensitive:
    Java é uma linguagem case sensitive, ou seja, diferencia maiúsculas de minúsculas.
    Por exemplo, as palavras "Classe", "classe" e "CLASSE" seriam consideradas diferentes em Java.

    padrões de nomenclatura:
    Pacotes: São escritos em letras minúsculas (exemplo: meu_pacote_exemplo ou primeiropacote)

    Classes ou Interfaces: Iniciam com letra maiúscula e seguem o estilo CamelCase (exemplo: MinhaClasseExemplo)

    Métodos ou variáveis ou atributos: Iniciam com letra minúscula e seguem o estilo camelCase (exemplo: metodo, variavel, meuMetodoExemplo e meuAtributoExemplo)

    CONSTANTES: São escritas em letras maiúsculas com palavras separadas por sublinhados (exemplo: MINHA_CONSTANTE_EXEMPLO, tipo PI, MAX_VALUE etc, valores que não mudam)
 */

// código não comentado
/* OBS: só pode existir UMA public class por arquivo, e isso é uma regra obrigatória da linguagem, porque a class
e o próprio arquivo por isso tem o mesmo nome.
nesse caso, eu criei porque quis, foi pra ver o código por inteiro estava muito separado lá em cima.
*/
public class PrimeiroPrograma2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// saída esperada
/*
D:\Rennan\descobrindo-java\descobrindojava> cmd /C ""C:\Program Files\Java\jdk-25\bin\java.exe" --enable-preview -XX:+ShowCodeDetailsInExceptionMessages -cp D:\Rennan\descobrindo-java\descobrindojava\bin primeiropacote.PrimeiroPrograma "
Hello, World!

*/