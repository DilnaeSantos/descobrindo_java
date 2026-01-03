package pacote_exercicio;

// import java.util.Date;

// public class HoraDoSistema_ex1 { // versão antiga
//     public static void main(String[] args) {
//         Date hora = new Date();
//         System.out.println("Hora do Sistema: ");
//         System.out.println(hora.toString());
//     }
// }

public class HoraDoSistema_ex1 { // versão nova 8.0 ate 25.0 que estou usando
    public static void main(String[] args) {
        System.out.println("Hora do sistema: " + java.time.LocalTime.now());
        /**
            o espaço depois do 'sistema:' e para dar um espaço entre a frase e a hora que vai ser mostrada
            + : olha mas a baixo do arquivo
            JAVA.TIME: é um pacote que fornece classes de data e hora
            LocalTime: é uma classe que representa o formato de hora local
            NOW(): é um método estático que retorna a hora atual do sistema
         */
        System.out.println("idioma do sistema: " + java.util.Locale.getDefault());
        /**
            JAVA.UTIL: é um pacote de classes de utilidades, como coleções, informações do sistema, etc.
            Locale: é uma classe que retorna as informações do sistema idioma e país
            GETDEFAULT(): é um método estático que retorna a localidade padrão do sistema
         */
        System.out.println(
            "Dimensão do sistema: " +
            java.awt.Toolkit.getDefaultToolkit().getScreenSize().width + " x " +
            java.awt.Toolkit.getDefaultToolkit().getScreenSize().height
            /**
                JAVA.AWT: é um pacote que fornece classes para criar interfaces gráficas
                TOOLKIT: é uma classe que acessa recursos do sistema e fornece métodos para interagir com o sistema gráfico
                GETDEFAULTTOOLKIT(): é um método estático que retorna o toolkit(Kit de ferramentas) padrão do sistema
                GETSCREENSIZE(): é um método que retorna o tamanho da tela do sistema como um objeto de dimensão
                WIDTH: é um atributo que representa a largura da tela
                HEIGHT: é um atributo que representa a altura da tela
             */
        );
    }
}

/**
    + : é o operador de concatenação em Java, usado para unir (juntar) strings (textos) ou adicionar valores a strings.
    Quando um dos lados é String, o Java:
        Converte o outro valor para texto
        Junta tudo em uma única String
    O Java faz internamente algo assim:
        1. "Hora do sistema: " → já é String
        2. LocalTime.now() → é um objeto
        3. Java chama automaticamente:
            LocalTime.now().toString() → converte o objeto em String
        4. Depois junta as duas Strings com o operador +
            e fica assim: Hora do sistema: 17:59:32.104834

        .toString(): é um método que converte qualquer objeto em uma representação de string (texto)

    Exemplo com strings:
        saudacao = "Olá, "; → string
        nome = "Maria"; → string
        mensagem = saudacao + nome; // resultado: "Olá, Maria"

    exemplo com número e string:
    idade = 25; → int
    nome = "João"; → string
    mensagemIdade = nome + " tem " + idade + " anos.";
    // resultado: "João tem 25 anos." vira tudo string
 */

// saída esperada
/*
D:\Rennan\descobrindo-java\descobrindojava> d: && cd d:\Rennan\descobrindo-java\descobrindojava && cmd /C ""C:\Program Files\Java\jdk-25\bin\java.exe" --enable-preview -XX:+ShowCodeDetailsInExceptionMessages -cp D:\Rennan\descobrindo-java\descobrindojava\bin pacote_exercicio.HoraDoSistema_ex1 "
Hora do sistema: 19:12:06.272441900
idioma do sistema: pt_BR
Dimensão do sistema: 1280 x 720

*/