package DataStuctures.Stack;

public class Item <T>{

    private Item<T> previous;
    private Item<T> next;
    private T name;

    public Item(T name) {
        this.name = name;
    }

    public Item getPrevious() {
        return previous;
    }

    public void setPrevious(Item<T> previous) {
        this.previous = previous;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item<T> next) {
        this.next = next;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}

