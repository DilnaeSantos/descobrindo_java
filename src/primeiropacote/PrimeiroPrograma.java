package primeiropacote;
/** PACKAGE: é um mecanismo que permite definir a qual pacote/pasta uma classe pertence, evitando conflitos de nomes e oome do pacote e escrito em letras minúsculas por convenção da linguagem Java.
*/

public class PrimeiroPrograma {
    /** PUBLIC: significa que a classe/método pode ser acessado de qualquer lugar da aplicação
        CLASS: é um modelo para criar objetos aonde você pode passar métodos e atributos */
    public static void main(String[] args) {
    // esse é o MÉTODO principal, onde a aplicação começa a ser executada
    /** MÉTODO: é uma sequência de instruções que realiza uma tarefa específica
        STATIC: diz ao java que este método pertence a classe, e não a um objeto de classe dessa forma
        a classe recebe os argumentos diretamente da linha de comando de saída
        VOID: significa que o método não retorna nenhum valor
        MAIN: é o nome do método que é executado quando a aplicação é iniciada
        STRING[] ARGS: é um array de strings que recebe os argumentos da linha de comando de saída
    */
        System.out.println("Hello, World!");
        // esse e a linha de comando de saída que imprime a mensagem na tela
        /** SYSTEM: é uma classe do Java que fornece acesso a recursos do sistema, como exemplo entrada e saída
            OUT: é um objeto da classe System que representa a saída padrão do console
            PRINTLN: é um método do objeto OUT que imprime a mensagem passada como argumento e pula para a próxima linha
        */
    }
}

// código não comentado
/* OBS: só pode existir UMA public class por arquivo, e isso é uma regra obrigatória da linguagem, porque a class
e o proprio arquivo por isso tem o mesmo nome.
nesse caso, para exemplificar, criamos uma segunda classe pública em um mesmo arquivo.
*/
public class PrimeiroPrograma2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}