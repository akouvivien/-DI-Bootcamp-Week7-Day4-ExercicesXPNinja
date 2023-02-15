/**
 * Linked list Node.
 * @author ETOUMI Aristide
 * @param <E>
 */
class Node<E> {
    E data;
    Node<E> next;

    int index;

    public Node(E d) {
        data = d;
        next = null;
        index = 0;
    }

}
