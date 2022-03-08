
public class App {

	public Node head = null;
	public Node tail = null;

	class Node {

		String data;
		Node next;

		Node(String data) {

			this.data= data;
			
		}

		
		
		

	}

	public void push(String n) {

		Node pnode = new Node(n);

		if (head == null) {
			head = pnode;
			
			tail = pnode;
			
			pnode.next= head;
			

		} else {

			tail.next = pnode;
			
			tail=pnode;
			
			tail.next= head;
			
			

		}

	}
	
	

	public void display() {

		Node tnode = head;
		do {

			System.out.println(tnode.data +" " +tnode.next);

			tnode = tnode.next;

		}while(tnode != head);
	}

	public static void main(String[] args) {
		
		
		App ap = new App();
		ap.push("1");
		
		
		
		
		ap.display();
		
		

	}

}
