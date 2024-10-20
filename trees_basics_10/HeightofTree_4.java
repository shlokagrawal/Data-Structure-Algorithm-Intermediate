package intermediate.trees_basics_10;

public class HeightofTree_4 { // refer 24_Trees_Basics.pdf

	public static void main(String[] args) {

		// let's create Tree first given in pdf.

		TreeNode root = new TreeNode(15);
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(8);
		TreeNode node3 = new TreeNode(10);
		TreeNode node4 = new TreeNode(19);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(14);

		// left side of root node.
		root.left = node1;
		node1.left = node3;
		node3.right = new TreeNode(17);

		// right side of root node.
		root.right = node2;
		node2.left = node4;
		node4.left = node6;
		node4.right = new TreeNode(25);
		node6.left = new TreeNode(36);
		node2.right = node5;
		node5.right = new TreeNode(20);

		// calculating height
		System.out.println(height(root));

	}

	public static int height(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}
}
