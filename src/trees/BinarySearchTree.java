package trees;

class Node {
	int value;
	Node left;
	Node right;
	public Node(int value){
		this.value = value;
	}
}

public class BinarySearchTree {
	Node root;
	
	//recursive
	Node searchR(int item, Node node){
		if(node == null || node.value == item){
			return node;
		} else if (item < node.value) {
			return searchR(item, node.left);
		} else {
			return searchR(item, node.right);
		}
	}
	
	//iterative
	Node search(int item, Node node){
		Node cur = node;
		while(cur != null){
			if(item == cur.value){
				return cur;
			} else if(item < cur.value){
				cur = cur.left;
			} else { // item > cur.value
				cur = cur.right;
			}
		}
		return null;
	}
	
	//recursive
	Node insertR (Node root, int value){
		if(root == null){
			root = new Node(value);
		} else if (value < root.value){
			root.left = insertR(root.left, value);
		} else { //value > root.value
			root.right = insertR(root.right, value);
		}
		return root;
	}
	
	//iterative
	Node insert(Node node, int value){
		Node cur = node;
		while(cur != null){
			if(cur == null){
				cur = new Node(value);
				return cur;
			} else if (value == cur.value){
				return cur;
			} else if (value < cur.value){
				cur = cur.left;
			} else { //value > cur.value
				cur = cur.right;
			}
		}
		return null;
		
	}
}
