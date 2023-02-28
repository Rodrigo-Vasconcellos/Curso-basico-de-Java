package senac;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<String> listaContatos = new ArrayList<>();

    public void incluir(String nomeContato) {
        listaContatos.add(nomeContato);
    }

    public ArrayList<String> todosContados() {
        return listaContatos;
    }

    public void excluir (String contato) {
        listaContatos.remove(contato);
    }
    public boolean pesquisa(String contato) {
        var indice = listaContatos.indexOf(contato);
        return indice >= 0;
    }
}
