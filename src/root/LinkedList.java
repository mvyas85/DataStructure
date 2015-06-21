package root;
public class LinkedList{
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