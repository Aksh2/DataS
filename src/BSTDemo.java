
public class BSTDemo {

	
		public static void main(String args[]) {
			BST bt = new BST();
//			bt.add(bt.root, bt.createNode(10));
//			bt.add(bt.root, bt.createNode(12));
//			bt.add(bt.root, bt.createNode(11));
//			bt.add(bt.root, bt.createNode(13));
//			bt.add(bt.root, bt.createNode(6));
//			bt.Search(11, bt.root);
			
			bt.add(bt.root, bt.createNode(6));
			bt.add(bt.root, bt.createNode(4));
			bt.add(bt.root, bt.createNode(8));
			bt.add(bt.root, bt.createNode(3));
			bt.add(bt.root, bt.createNode(5));
			bt.add(bt.root, bt.createNode(7));
			bt.add(bt.root, bt.createNode(9));
		
			
			bt.preOrder(bt.root);
			System.out.println();
			bt.inOrder(bt.root);
			System.out.println();
			bt.postOrder(bt.root);
		}
		
		
	

}
