import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/
// TC - O(N+M) , SC - O(N+M)
// public class Solution {
// 	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        
//         LinkedListNode<Integer> dummy = new LinkedListNode(0);

//         if(first == null && second == null) return null;
//         else if(first == null) return second;
//         else if(second == null) return first;
//         else {
//             LinkedListNode<Integer> head1 = first;
//             LinkedListNode<Integer> head2 = second;
//             LinkedListNode<Integer> temp = dummy;

//             while(head1 != null && head2 != null){
//                 if(head1.data <= head2.data){
//                     temp.next = head1;
//                     head1 = head1.next;
//                 }else if(head1.data >= head2.data){
//                     temp.next = head2;
//                     head2 = head2.next;
//                 }
//                 temp = temp.next;
//             }

//             if(head1 == null) temp.next = head2;
//             else temp.next = head1;
//         }

//         return dummy.next;

// 	}
// }

// TC - O(N+M) SC - O(1)


/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {

        if(first == null && second == null) return null;
        if(first == null) return second;
        if(second == null) return first;

        LinkedListNode<Integer> l1, l2;
        if(first.data < second.data){
            l1 = first;
            l2 = second;
        }else{
            l1 = second;
            l2 = first;
        }

        LinkedListNode<Integer> result = l1;

        while(l1 != null && l2 != null){
            LinkedListNode<Integer> temp = null;
            while(l1 != null && l1.data <= l2.data){
                temp = l1;
                l1 = l1.next;
            }
            temp.next = l2;

            LinkedListNode<Integer> swap = l1;
            l1 = l2;
            l2 = swap;
        }
        
        return result;
	}
}
