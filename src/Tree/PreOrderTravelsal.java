package Tree;

import java.util.ArrayList;

public class PreOrderTravelsal {
	ArrayList<Integer> list = new ArrayList<>();

	ArrayList<Integer> inOrder(Node root) {
       if(root==null){
           return list;
       }
       inOrder(root.left);
       list.add(root.key);
       inOrder(root.right);
       return list;
	}    
}
