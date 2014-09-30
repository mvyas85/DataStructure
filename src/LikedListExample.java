
public class LikedListExample {
    
    public static void main(String args[]){
    	
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
    	temp.setNext(newNode);
    	listCount++;
    }
    
    public int size()
    {
        return listCount;
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
	
}