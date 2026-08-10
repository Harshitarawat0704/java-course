public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root) {
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
                if (current.previous() == null) {
                    current.setPrevious(item);
                    return true;
                }
                current = current.previous();
            } else {
                if (current.next() == null) {
                    current.setNext(item);
                    return true;
                }
                current = current.next();
            }
        }
    }

    public boolean removeItem(ListItem item) {
        ListItem current = root, parent = null;

        while (current != null) {
            int c = current.compareTo(item);

            if (c == 0) {
                performRemoval(current, parent);
                return true;
            }

            parent = current;
            current = c > 0 ? current.previous() : current.next();
        }

        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        ListItem child;

        if (item.previous() != null && item.next() != null) {
            ListItem successor = item.next();

            while (successor.previous() != null)
                successor = successor.previous();

            item.setValue(successor.getValue());
            removeItem(successor);
            return;
        }

        child = item.previous() != null ? item.previous() : item.next();

        if (parent == null)
            root = child;
        else if (parent.previous() == item)
            parent.setPrevious(child);
        else
            parent.setNext(child);
    }

    public void traverse(ListItem root) {
        if (root == null) return;

        traverse(root.previous());
        System.out.println(root.getValue());
        traverse(root.next());
    }
}