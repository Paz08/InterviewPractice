package Questions;

//chapter 2

public class Node {
	
		Node next = null;
		int data;
		
		public Node(int d){
			data=d;
		}
		
		void appendToTail(int d){
			Node end = new Node(d);
			Node n = this;
			while(n.next != null){
				n = n.next;
			}
			n.next= end;
		}
		  public static void printDups(Node startNode){
			  if (startNode == null){
				  return;
			  }
			  System.out.println(startNode.data);
			  printDups(startNode.next);
		  }
		  
		  public static void deleteDups(Node startNode){
			    if (startNode == null){
			    	return;
			    }
			    Node previous = startNode;
			    Node currentNode = previous.next;
			    
			    while(currentNode != null){
			    	if(startNode.data == currentNode.data){
			    		previous.next = currentNode.next;
			    		currentNode =currentNode.next;
			    	}
			    	else{
			    		previous = previous.next;
			    		currentNode = currentNode.next;
			    	}
			    }
			    
			    deleteDups(startNode.next);
			    
			    }
		
}
	

