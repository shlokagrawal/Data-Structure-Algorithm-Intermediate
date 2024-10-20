package intermediate.trees_basics_10;

public class PreorderTraversal_2 { // refer 24_Trees_Basics.pdf

	public static void main(String[] args) {

		// let's create Tree first given in pdf.

		TreeNode root = new TreeNode(7);
		TreeNode node1 = new TreeNode(8);
		TreeNode node2 = new TreeNode(11);
		TreeNode node3 = new TreeNode(15);
		TreeNode node4 = new TreeNode(16);

		// left side of root node.
		root.left = node1;
		node1.left = new TreeNode(9);
		node1.right = node3;
		node3.left = new TreeNode(19);

		// right side of root node.
		root.right = node2;
		node2.left = new TreeNode(4);
		node2.right = node4;
		node4.left = new TreeNode(20);
		node4.right = new TreeNode(17);

		preorder(root);

	}

	// Preorder traversal method.
	public static void preorder(TreeNode root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

}
