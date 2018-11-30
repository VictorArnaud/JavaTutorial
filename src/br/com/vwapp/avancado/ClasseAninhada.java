package br.com.vwapp.avancado;

/**
 * Classes ou interfaces aninhadas podem acessar os elementos dentro de suas classes envolventes
 *
 * Muito utilizadas em frameworks baseados em eventos como swing para interfaces gráficas.
 *
 * As classes aninhadas podem acessar atributos da sua classe envolvente, no caso a classe ListenerAninhado
 * pode acessar atributos e métodos da classe Aninhamento.
 *
 * Classe Anônima é uma classe sem nome criada dentro de um método diretamente ou passando como parâmetro.
 *
 */
public class ClasseAninhada {

    String texto = "Ola Mundo!";

    public class Aninhamento {
        public void imprimeTexto() {
            System.out.println(texto);
        }
    }

    public Aninhamento pegaAninhado() {
        Aninhamento aninhado = new Aninhamento();
        return aninhado;
    }

    public Aninhamento pegaAnonimo() {
        Aninhamento aninhado = new Aninhamento() {
            public void imprimeTexto() {
                System.out.println("Ola Mundo Anonimo!");
            }
        };
        return aninhado;
    }

    public static void main(String[] args) {
        ClasseAninhada aninhamento = new ClasseAninhada();

        Aninhamento aninhado = aninhamento.pegaAninhado();
        aninhado.imprimeTexto();

        Aninhamento anonimo = aninhamento.pegaAnonimo();
        anonimo.imprimeTexto();
    }

}
