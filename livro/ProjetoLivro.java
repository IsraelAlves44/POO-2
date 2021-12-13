package livro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "Masculino");
        p[1] = new Pessoa("Ana", 15, "Feminino");

        l[0] = new Livro("Aprendendo Java", "Jose da silva", 3000, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 400, p[1]);
        l[0] = new Livro("Interistellar", "Joseph Nollan", 400, p[1]);

        l[0].abrir();
        l[0].folhear(10);
        System.out.println(l[0].detalhes());
    }
}
