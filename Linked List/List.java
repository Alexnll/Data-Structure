class List{
    private Link first;

    public List(){
        this.first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(Link thing){
        Link newLink = first;
        first = thing;
        thing.next = newLink;
    }

    public Link deleteFirst(){
        Link newLink = first;
        first = first.next;
        return newLink;
    }

    public void displayList(){
        Link current = first;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}