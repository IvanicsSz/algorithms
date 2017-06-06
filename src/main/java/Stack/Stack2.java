package DataStuctures.Stack;

public class Stack2 <T>{

    private Item<T> lastItem =null;

    public Stack2() {

    }

    public void put(T name){
        Item<T> item = new Item<>(name);
        if (lastItem == null){
            item.setPrevious(null);
            lastItem = item;
        } else{
            item.setPrevious(lastItem);
            lastItem.setNext(item);
            lastItem = item;
        }
    }

    public T popItem() {
        T lastName = lastItem.getName();
        lastItem = lastItem.getPrevious();
        return lastName;
    }

}

