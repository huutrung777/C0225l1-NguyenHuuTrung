package bai_tap.bai11.MyArrayListNangCao;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.addFirst("Trung");
        list.addFirst("Ngân");
        list.addLast("Ki");
        list.add(1, "Liên");

        System.out.print("List: ");
        list.printList();

        list.remove("Liên");
        System.out.print(" ");
        list.printList();

        System.out.println("Contains Ngân? " + list.contains("Ngân"));
        System.out.println("Index of KI: " + list.indexOf("KI"));
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        MyLinkedList<String> cloned = list.clone();
        System.out.print("Cloned list: ");
        cloned.printList();
    }
}
