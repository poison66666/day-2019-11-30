public class Contact {
    public static class Node{
        String name;
        String phone;
        Node left;
        Node right;
        public Node(String name,String phone){
            this.name = name;
            this.phone = phone;
        }
    }

    private Node root = null;

    public boolean insert(String name,String phone){
        if(root == null){
            root = new Node(name,phone);
            return true;
        }
        Node cur = root;
        Node parent = null;
        while(cur != null){
            int r = name.compareTo(cur.name);
            if(r == 0){
                return false;
            }else if(r < 0){
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }
        int r = name.compareTo(parent.name);
        Node node = new Node(name,phone);
        if(r < 0){
            parent.left = node;
        }else{
            parent.right = node;
        }
        return true;
    }

    public String search(String name){
        Node cur = root;
        while(cur != null){
            int r = name.compareTo(cur.name);
            if(r == 0){
                return cur.phone;
            }else if(r < 0){
                cur = cur.left;
            }else{
                cur = cur.right;
            }
        }
        return null;
    }

    public String update(String name,String phone){
        Node cur = root;
        while(cur != null){
            int r = name.compareTo(cur.name);
            if(r == 0){
                String oldPhone = cur.phone;
                cur.phone = phone;
                return cur.phone;
            } else if(r < 0){
                cur = cur.left;
            } else{
                cur = cur.right;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Contact contact = new Contact();
        String[][] cs = {{"a","1"},{"b","2"},{"c","3"}};
        for(String[] c : cs){
            System.out.println(contact.insert(c[0],c[1]));
        }
        System.out.println("插入重复数据");
        System.out.println(contact.insert("a","1"));

        System.out.println(contact.search("a"));
        System.out.println(contact.update("a","4"));
        for(String[] c : cs){
            System.out.println(contact.search(c[0]));
        }
    }
}
