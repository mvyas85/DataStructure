import java.util.Iterator;


public class LikedListExample {
    
    public static void main(String args[]){
    	
    	Contacts john = new Contacts("John",123345);
    	Contacts mona = new Contacts("Mona", 234456);
    	Contacts dolly = new Contacts("dolly",346745);
    	Contacts lola = new Contacts("lola", 374456);
    	Contacts pinky = new Contacts("pinky",203345);
    	Contacts sweety = new Contacts("sweety", 457456);
    	LinkedList ll = new LinkedList();
    	
    	ll.printList();
    	
    	ll.add(john);
    	ll.add(mona);
    	ll.add(dolly);
    	ll.add(lola);
    	ll.add(pinky);
    	
    	ll.remove(3);
    	ll.add(sweety,3);
    	
    	ll.printList();
    	
    	
    }
}

class LinkedList{
	private Node head;
    private int listCount;
 
    LinkedList() {
        head = new Node(null);
        listCount = 0;
    }
    
    public void add(Object data){
    	
    	Node newNode = new Node(data);
    	Node temp = head;
    	
    	while(temp.getNext() !=null){
    		temp = temp.getNext();
    	}
    	temp.setNext(newNode);
    	listCount++;
    }
    
    public void add(Object data, int index){
    	Node newNode = new Node(data);
    	Node temp = head;
    	
    	for(int i=1;i<index && temp.getNext() !=null;i++){
    		temp = temp.getNext();
    	}
    	newNode.setNext(temp.getNext());
    	temp.setNext(newNode);
    	listCount++;
    }
    
    public Node get(int index){
    	Node temp = head;
    	
    	for(int i=1;i<index && temp.getNext() !=null;i++){
    		temp = temp.getNext();
    	}
    	temp.getData();
    	return temp;
    }
    
    public void remove(){
    	Node temp = head;
    	
    	while(temp.getNext() !=null){
    		temp = temp.getNext();
    	}
    	temp.setNext(null);
    	temp.setData(null);
    	listCount--;
    }
    
    public void remove(int index){
    	Node temp = head;
    	
    	for(int i=1;i<index && temp.getNext() !=null;i++){
    		temp = temp.getNext();
    	}
    	Node tempnext = temp.getNext();
    	temp.setNext(tempnext.getNext());
    	tempnext.setNext(null);
    	tempnext.setData(null);
    	listCount--;
    }
    
    public int size()
    {
        return listCount;
    }
    
    public void printList(){
    	System.out.print("\nLinked List:");
    	Node temp = head;
    	
    	int i =1;
    	while(temp.getNext() !=null){
    		temp = temp.getNext();
    		System.out.print("|  "+i+"  | "+temp.toString()+"  |-->");
    		i++;
    	}
    	
    }
    
    
}

class Node{
	
	private Node next;
    private Object data;
     
	Node(Object dataValue){
		next = null;
		data = dataValue;
	}
	
	Node(Object dataValue, Node nextNode){
		data = dataValue;
	}
	
	Object getData() {
        return data;
    }
	
	void setData(Object dataValue) {
        data = dataValue;
    }
	
	Node getNext() {
        return next;
    }

    void setNext(Node nextValue) {
        next = nextValue;
    }
    @Override
    public String toString(){
    	return data.toString();
    }
}

class Contacts{
	private String name;
	private int phone;
	
	public Contacts(String name, int phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public int getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
    public String toString(){
    	return name;
    }
	
}