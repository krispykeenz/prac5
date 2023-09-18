public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.append("peep");
        list.append("car");
        list.append("rat");
        list.append("otto");

        System.out.println(list.isPalindrome());
    }

}

