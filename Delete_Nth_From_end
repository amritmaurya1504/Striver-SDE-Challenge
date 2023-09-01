/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        Node temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        temp = head;

        int place = length - K;

        if(place == 0){
            return head.next;
        }

        for(int i = 1; i < place; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}