
public class BST {
Node root;
	public BST() {
		root=null;
	}
	
	public void add(Node start,Node newNode) {
		if(root==null) {
			root=newNode;
			return;
		}
		
		if(newNode.value<start.value) {
			if(start.left==null) {
				start.left=newNode;
			}
			add(start.left,newNode);
		}
		if(newNode.value>start.value) {
			if(start.right==null) {
				start.right=newNode;
			}
			add(start.right,newNode);
		}
		
	}
	
	public Node createNode(int value) {
		Node node=new Node(value,null,null);
		return node;
	}
	
	public void Search(int value, Node start) {
		if(start==null) {
			System.out.println("Element is not found");
			return;
		}
		if(value==start.value) {
			System.out.println("Element is found");
			return;
		}
		if(value<start.value) {
			Search(value, start.left);
		}
		if(value>start.value) {
			Search(value, start.right);
		}
	}
	
	public void preOrder(Node root) {
		if(root!=null) {
		System.out.print(root.value);
		preOrder(root.left);
		preOrder(root.right);
		}
	}
	
	public void inOrder(Node root) {
		if(root!=null) {
		inOrder(root.left);
		System.out.print(root.value);
		inOrder(root.right);
		}
	}
	
	
	public void postOrder(Node root) {
		if(root!=null) {
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.value);
		}
	}
	

}
