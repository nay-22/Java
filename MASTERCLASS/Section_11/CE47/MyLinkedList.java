package CE47;

import java.util.List;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }
    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (getRoot() == null) {
            root = item;
            return true;
        }
        ListItem curr = getRoot();
        while (curr != null) {
            if (curr.rightLink.compareTo(item) > 1 && curr.compareTo(item) <= 0 ) {
                ListItem temp = curr.rightLink;
                curr.rightLink = item;
                curr.rightLink.rightLink = temp;
                temp = null;
                return true;
            }
            curr = curr.rightLink;
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem curr = getRoot();
        while (curr != null) {
            if (curr.equals(item)) {
                curr.leftLink.rightLink = curr.rightLink;
                curr = null;
                return true;
            }
            curr = curr.rightLink;
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) System.out.println("The list is empty");
        ListItem curr = root;
        while (curr != null) {
            System.out.println(curr.value);
        }
    }
}
