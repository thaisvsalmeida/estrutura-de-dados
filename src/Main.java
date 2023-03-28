import java.util.*;

class Main {
    public static void main(String args[]) {
        List<Integer> lista = new ArrayList<>(5);
        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> fila = new LinkedList<>();

        System.out.println("Passo 1: Inserir os números [1, 2, 3, 4 e 5] na lista com 5 células");
        adicionaLista(lista, 1, 5);

        System.out.println("Passo 2: Remover todos os dados da lista e inserir em uma pilha");
        removeListaEAdicionaPilha(lista, pilha);

        System.out.println("Passo 3: Remover os dados da pilha e inserir em uma fila");
        removePilhaEAdicionaFila(pilha, fila);

        System.out.println("Passo 4: Inserir os números [6, 7, 8, 9 e 10] na lista");
        adicionaLista(lista, 6, 10);

        System.out.println("Passo 5: Repita os passos 2 e 3");
        removeListaEAdicionaPilha(lista, pilha);
        removePilhaEAdicionaFila(pilha, fila);

        System.out.println("Passo 6: Exiba todos os números que foram inseridos na fila");
        System.out.println("Fila: " + fila);
    }

    private static void removePilhaEAdicionaFila(Stack<Integer> pilha, Queue<Integer> fila) {
        int pilhaSize = pilha.size();
        for (int i = 0; i < pilhaSize; i++) {
            int item = pilha.pop();
            fila.add(item);
        }
        System.out.println("Pilha: " + pilha);
        System.out.println("Fila: " + fila);
        System.out.println();
    }

    private static void removeListaEAdicionaPilha(List<Integer> lista, Stack<Integer> pilha) {
        int listaSize = lista.size();
        for (int i = 0; i < listaSize; i++) {
            int item = lista.remove(0);
            pilha.push(item);
        }
        System.out.println("Lista: " + lista);
        System.out.println("Pilha: " + pilha);
        System.out.println();
    }

    private static void adicionaLista(List<Integer> lista, int primeiroIndex, int ultimoIndex) {
        for (int i = primeiroIndex; i <= ultimoIndex; i++) {
            lista.add(i);
        }
        System.out.println("Lista: " + lista);
        System.out.println();
    }
}