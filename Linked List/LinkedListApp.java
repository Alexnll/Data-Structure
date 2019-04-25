// test file
class LinkedListApp{
    public static void main(String[] args){
        List listTest = new List();
        System.out.println(listTest.isEmpty());
        listTest.insertFirst(1);
        listTest.insertFirst(2);
        listTest.insertFirst(3);
        listTest.insertFirst(4);
        System.out.println(listTest.isEmpty());
        listTest.displayList();
        listTest.deleteFirst();
        listTest.deleteFirst();
        listTest.deleteFirst();
        System.out.println(listTest.isEmpty());
        listTest.displayList();
    }
}