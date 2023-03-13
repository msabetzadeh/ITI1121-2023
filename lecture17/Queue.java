public interface Queue<E> {
    boolean isEmpty();
    void enqueue(E value);
    E dequeue();
}

