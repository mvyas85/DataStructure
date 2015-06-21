package root;

public class Main {
    
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

