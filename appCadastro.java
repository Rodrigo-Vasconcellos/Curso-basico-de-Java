package senac;

public class appCadastro {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.incluir("rodrigo");
        agenda.incluir("rafa");

        System.out.println(agenda.todosContados());

        agenda.excluir("rodrigo");
        System.out.println(agenda.todosContados());

        agenda.pesquisa("rafa");
        if (agenda.pesquisa("rafa")) {
            System.out.println("existe na lista");
        }else {
            System.out.println("nao esta na lista");
        }
    }
}
