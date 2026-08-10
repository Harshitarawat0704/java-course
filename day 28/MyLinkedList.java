public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }

    public boolean addItem(ListItem item) {
        if (root == null) {
            root = item;
            return true;
        }

        ListItem current = root;

        while (true) {
            int c = current.compareTo(item);

            if (c == 0) return false;

            if (c > 0) {
                item.setNext(current);
                item.setPrevious(current.previous());

                if (current.previous() != null)
                    current.previous().setNext(item);
                else
                    root = item;

                current.setPrevious(item);
                return true;
            }

            if (current.next() == null) {
                current.setNext(item);
                item.setPrevious(current);
                return true;
            }

            current = current.next();
        }
    }

    public boolean removeItem(ListItem item) {
        ListItem current = root;

        while (current != null) {
            int c = current.compareTo(item);

            if (c == 0) {
                if (current.previous() != null)
                    current.previous().setNext(current.next());
                else
                    root = current.next();

                if (current.next() != null)
                    current.next().setPrevious(current.previous());

                return true;
            }

            if (c > 0) return false;
            current = current.next();
        }

        return false;
    }

    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }

        while (root != null) {
            System.out.println(root.getValue());
            root = root.next();
        }
    }
}
