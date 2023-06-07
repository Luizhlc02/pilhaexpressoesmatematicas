import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T> {
    private List<T> pilha;

    public Pilha() {
        pilha = new ArrayList<>();
    }

    public void push(T item) {
        pilha.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.remove(pilha.size() - 1);
    }

    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.get(pilha.size() - 1);
    }

    public boolean isEmpty() {
        return pilha.isEmpty();
    }

    public void clear() {
        pilha.clear();
    }
}




























