package practiceproblems;

public class BinaryTree {
	Node root;
	public BinaryTree() {
		root=null;
	}
	
	public void add(Node start,Node newNode) {
		if(root==null) {
			root=newNode;
			System.out.println("root"+ root+" start"+start);
			return;
		}
		if(start!=null) {
			if(start.left==null) {
				start.left=newNode;
				return;
			}
			if(start.right==null) {
				start.right=newNode;
				return;
			}
			//Previous logic: 
			if(start.right==null)
			//if(start.left!=null){
				add(start.right,newNode);
			}else {
				add(start.left,newNode);

			}
		}
		
//		if(node==null) {
//			node=new Node(value);
//		}
//		else {
//			if(node.left==null) { 
//				node.left=add(node.left,value);
//			}
//			else {
//				node.right=add(node.right,value);
//			}
//		}
//		return node;
	}
	
	public Node createNode(int value) {
		Node node=new Node(value);
		return node;
	}
	
	public void search(Node node,int value) {
		if(node.value==value) {
			System.out.println(value+"is found !");
		}
		
		if(node.left!=null) {
			search(node.left,value);
		}
		
		if(node.right!=null) {
			search(node.right,value);
		}
		//return false;
		
	}
	
	public void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.value+" ");
			inOrder(root.right);
			
		}
	}
	
	public void postOrder(Node root) {
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.value+" ");
			
		}
	}
	
	public void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.value+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public static void main(String args[]) {
		BinaryTree bt = new BinaryTree();
		//Node root = bt.create(1);
		System.out.println("Is 0 created ?"+bt.createNode(0).value+"left"+bt.createNode(0).left+"right:"
				+bt.createNode(0).right);

		bt.add(bt.root, bt.createNode(3));
		bt.add(bt.root, bt.createNode(9));
		bt.add(bt.root, bt.createNode(10));
		bt.add(bt.root, bt.createNode(1));
		bt.add(bt.root, bt.createNode(11));
		bt.add(bt.root, bt.createNode(12));
		bt.add(bt.root, bt.createNode(21));
		
//		bt.add(root, 9);		
//		//root=bt.add(root, 10);
//		root=bt.add(root, 1);
//		root=bt.add(root, 11);
//		root=bt.add(root, 12);
//		root=bt.add(root, 21);
		
		bt.search(bt.root, 0);
		bt.search(bt.root, 21);
		bt.search(bt.root, 36);
		bt.search(bt.root, 1);
		
		System.out.println("preorder");
		bt.preOrder(bt.root);
		System.out.println("postorder");
		bt.postOrder(bt.root);
		System.out.println("inorder");
		bt.inOrder(bt.root);

		



	}
	
	

}
