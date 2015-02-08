package Questions;

//question 1.1 O(n^2)

public class ch1 {
    
    public static void main(String [] args){
        boolean yes = stringCompare("aslkjbkd");
        System.out.println(yes);
        
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(3);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        
        
        Node.printDups(n1);
        Node.deleteDups(n1);
        Node.printDups(n1);
        
    }
    
    public static boolean stringCompare(String strpoop){
        int length = strpoop.length();
        String n = "";
        if(strpoop == null){
            throw new NullPointerException("null");
        } else if(strpoop.isEmpty()){
            return true;
        } else {
            for (int i=0; i<length; i++){
                for (int j=1; j<length-i; j++){
                    if(strpoop.charAt(i)==strpoop.charAt(j+i)){
                        return false;
                    }
                    else{
                        continue;
                    }
                }
            }
            return true;
        }
    }  
    
}


