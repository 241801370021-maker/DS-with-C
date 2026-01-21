// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next;
    
    // constructor
    Node(int a){
        data=a;
        next=null;
        

    }
    
    public void getdata(){
        System.out.println(data);
    }  
    public void getnext(){
        System.out.println(next);
    }  
}
    
    
class Main {
    public static void main(String[] args) {
    Node a = new Node(20);
    Node b = new Node(40);
      a.getdata();
      a.getnext();
        System.out.println(a);
         b.getdata();    
        b.getnext();
    }  
}
