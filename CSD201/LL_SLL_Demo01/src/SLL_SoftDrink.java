/*  Class for a list of soft drinks- Using singly linked list
    Operations are implemented including Add/ Search/ Remove/ Traversals
 */
import java.io.File; // for ascending file managed by operating system
import java.io.RandomAccessFile; // for writing data from binary file
import java.io.FileReader; // for reading text file
import java.io.BufferedReader; // for reading text file
import java.io.PrintWriter; // for writing data to text file
import java.util.StringTokenizer; // for splitting a string
public class SLL_SoftDrink {
    SLL_Node head, tail; // 2 references
    //constructor: Initiating an empty singly linked list
    public SLL_SoftDrink() {
        head = tail = null;
    }
    // Checking whether the list is empty or not
    public boolean Empty() {
        return head == null;
    }
    // add a soft drink to the beginning of the list. O(1)
    public void addFirst(SoftDrink aSD) {
        SLL_Node newNode = new SLL_Node(aSD); //Wrap the aSD in a node
        if (this.Empty()) head = tail = newNode;
        else {
            newNode.next = head; // link the newNode to the head
            head = newNode; // now, the newNode is the head
        }
    }
    // add a soft drink to the beginning of the list. O(1)
    public void addFirst(String pLine, String company, int volume, int price) {
        addFirst(new SoftDrink(pLine, company, volume, price));
    }
    // add a soft drink to the end of the list. O(1)
    public void addLast(SoftDrink aSD) {
        SLL_Node newNode = new SLL_Node(aSD);
        if (this.Empty()) head = tail = newNode;
        else {
            tail.next = newNode;// link the tail to the newNode
            tail = newNode;// now, the newNode is the tail
        }
    }

    // add a soft drink to the end of the list. O(1)
    public void addLast(String pLine, String company, int volume, int price) {
        addLast(new SoftDrink(pLine, company, volume, price));
    }

    // read data lines in a text file to the list
    // Format: Miranda, Shirinda, 300, 7300
    private SoftDrink createSD(String line) {
        StringTokenizer stk = new StringTokenizer(line, ",");
        String productLine = stk.nextToken().trim();
        String company = stk.nextToken().trim();
        int volume = Integer.parseInt(stk.nextToken().trim());
        int price = Integer.parseInt(stk.nextToken().trim());
        return new SoftDrink(productLine, company, volume, price);
    }

    public void loadFromFile(String fName) throws Exception {
        FileReader fr = new FileReader(fName);
        BufferedReader bf = new BufferedReader(fr);
        String line;
        StringTokenizer stk;
        for (int i = 0; i < 3; i++) {//test the addFirsr method
            line = bf.readLine();
            this.addFirst(createSD(line));
        }
        while ((line = bf.readLine()) != null) {//test the addLast method
            this.addLast(createSD(line));
        }
    }

    //Search operation on productLine - Using linear search. O(n)
    public SoftDrink search(String productLine) {
        if (this.Empty()) {
            return null;
        }
        SLL_Node p = head;
        while (p != null) { //O(n)
            if (p.data.productLine.equals(productLine)) {
                return p.data;
            } else {
                p = p.next;
            }
        }
        return null;
    }

    //Reverse the SLL
    public void reverse() {
        if (this.Empty()) {
            return;
        }
        SLL_Node after = null, p = head, before = p.next;
        while (p != null) {
            p.next = after;
            after = p; //shift a step
            p = before;
            if (p != null) {
                before = p.next;
            }
        }
        //Update head and tail
        p = head;
        head = tail;
        tail = p;
    }

    //Remove a soft drink based on it's product Line - Linear search. O(n)
    public SoftDrink remove(String pLine) {
        if (this.Empty()) {
            return null;
        }
        SoftDrink aSoftDrink = new SoftDrink(pLine);
        SoftDrink removeEle = null;
        SLL_Node pAfter = null, pDel = head;
        // Linear search for positioning the node which will be remove
        while (pDel != null && !pDel.data.equals(aSoftDrink)) {//O(n)
            pAfter = pDel; // move to the next node
            pDel = pDel.next;
        }
        // In case of the list contains the node which must be removed
        if (pDel != null) {
            removeEle = pDel.data; // remove value
            if (pDel == head) {//removing the head
                if (head == tail) {
                    head = tail = null; //list contains only one node
                } else {
                    head = head.next;
                }
            } else if (pDel == tail) { //removing the tail
                pAfter.next = null;
                tail = pAfter;
            } else {
                pAfter.next = pDel.next; //removing the middle node
            }
        }
        return removeEle;
    }

    //Traversing for printing elements to monitor
    private void visit(SLL_Node node) {
        System.out.print(node.data + "\n");
    }

    //printing all elements
    public void printAll() {
        if (this.Empty()) {
            System.out.println("EMPTY LIST.");
        } else {
            for (SLL_Node p = head; p != null; p = p.next) {
                visit(p);
            }
        }
    }

    // Traversing for printing all elements of a company
    public void printCompanyBased(String company) {
        if (this.Empty()) {
            System.out.println("EMPTY LIST.");
        } else {
            for (SLL_Node p = head; p != null; p = p.next) {
                if (p.data.company.equals(company)) {
                    visit(p);
                }
            }
        }
    }

    // Ascending sort by soft drink's price then by product line. O(n^2)
    public void ascSort_Price_then_pLine() {
        if (this.Empty()) {
            return;
        }
        SoftDrink t;
        SLL_Node i, j;
        for (i = head; i != tail; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (j.data.compareTo(i.data) < 0) {
                    t = i.data; //moving up smaller daya
                    i.data = j.data;
                    j.data = t;
                }
            }
        }
    }

    // OPERATIONS FOR TRAVERSING A LIST TO BINARY AND TEXT FILES
    // Traversing for printing elements to a opening binary file
    private void visit_binF(RandomAccessFile f, SLL_Node node) throws Exception {
        // write a strinng as a sequence of bytes.
        f.writeBytes(node.data.toString() + "\r\n"); //line-by-line format
    }

    //Traversing for printing all elements to a NEW binary file
    public void printAll_binF(String filename) throws Exception {
        if (this.Empty()) {
            System.out.println("EMPTY LIST.");
        } else {
            File f = new File(filename);
            if (f.exists()) {
                f.delete(); // delete old file
            }
            RandomAccessFile rf = new RandomAccessFile(f, "rw");
            for (SLL_Node p = head; p != null; p = p.next) {
                visit_binF(rf, p);
            }
            rf.close();
        }
    }

    //Traversing for printing elements to a opening text file
    private void visit_txtF(PrintWriter f, SLL_Node node) throws Exception {
        f.println(node.data);// line-by-line format
    }

    //Traversing for printing all elements to a NEW binary file
    public void printAll_txtF(String filename) throws Exception {
        if (this.Empty()) {
            System.out.println("EMPTY LIST.");
        } else {
            PrintWriter pw = new PrintWriter(filename); //overriding mode
            for (SLL_Node p = head; p != null; p = p.next) {
                visit_txtF(pw, p);
            }
            pw.close();
        }
    }
}//SLL_SoftDrink class
