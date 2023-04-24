import com.sun.jdi.IntegerValue;

import java.util.Stack;

/**
 * 二叉树
 */
public class BinaryTree<T> {
    T val;            // 值
    BinaryTree<T> right;   // 右孩子
    BinaryTree<T> left;    // 左孩子
    BinaryTree() {}
    BinaryTree(T val) {
        this.val = val;
    }
    BinaryTree(T val, BinaryTree<T> right, BinaryTree<T> left) {
        this.val = val;
        this.right = right;
        this.left = left;
    }

    public int getVal() {
        if (this.val == null) throw new NullPointerException("节点值为空");
        String index = this.val.toString();
        if (index.length() <= 4) {
            return Integer.parseInt(index);
        } else {
            return Integer.parseInt(index.substring(0,4));
        }
    }

    /**
     * 非递归 —— 二叉树读取（前序，中序，后序）
     */
    public static void readBinaryTree(BinaryTree root) {
        System.out.println("二叉树读取：");
        System.out.print("前序遍历：");
        getFrontRead(root);
        System.out.print("\n中序遍历：");
        getMiddleRead(root);
        System.out.print("\n后序遍历：");
        getEndRead(root);
        System.out.println();
    }

    // 非递归格式——前序遍历
    private static void getFrontRead(BinaryTree root) {
        if (root == null) return;
        Stack<BinaryTree> stack = new Stack<>();  // 用栈模拟，但需注意出栈入栈顺序
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTree cur = stack.pop();
            System.out.printf("%d  ", cur.getVal());
            if (cur.right != null) stack.push(cur.right);
            if (cur.left != null) stack.push(cur.left);
        }
    }

    // 非递归格式——中序遍历
    private static void getMiddleRead(BinaryTree root) {
        if (root == null) return;
        Stack<BinaryTree> stack = new Stack<>();
        BinaryTree cur = root;
        while (cur != null || !stack.isEmpty()) {  // 左 中 右
            if (cur != null) {   // 左探一直到没有
                stack.push(cur);
                cur = cur.left;
            } else {  // 再出到 中 右
                cur = stack.pop();
                System.out.printf("%d  ", cur.getVal());
                cur = cur.right;
            }
        }
    }

    // 非递归格式——后序遍历
    private static void getEndRead(BinaryTree root) {
        if (root == null) return;
        Stack<Integer> res = new Stack<>();
        Stack<BinaryTree> stack = new Stack<>();
        stack.push(root);
        // 入栈下左后右，使右的节点先被遍历，那么在res栈中顺序正好相反（左 右 中），读出即可
        while (!stack.isEmpty()) {
            BinaryTree point = stack.pop();
            res.push(point.getVal());
            if (point.left != null) stack.push(point.left);
            if (point.right != null) stack.push(point.right);
        }
        while (!res.isEmpty()) {
            System.out.printf("%d  ", res.pop());
        }
    }


    /**
     * 递归 —— 二叉树读取（前序，中序，后序）
     */
    public static void readBinaryTree_(BinaryTree root) {
        System.out.println("二叉树读取：");
        System.out.print("前序遍历：");
        getFrontRead_(root);
        System.out.print("\n中序遍历：");
        getMiddleRead_(root);
        System.out.print("\n后序遍历：");
        getEndRead_(root);

        System.out.println();
    }

    // 递归格式——前序遍历（中左右）
    private static void getFrontRead_(BinaryTree root) {
        if (root == null) return;
        System.out.printf("%d  ", root.getVal());
        getFrontRead_(root.left);
        getFrontRead_(root.right);
    }

    // 递归格式——中序遍历（左中右）
    private static void getMiddleRead_(BinaryTree root) {
        if (root == null) return;
        getMiddleRead_(root.left);
        System.out.printf("%d  ", root.getVal());
        getMiddleRead_(root.right);
    }

    // 递归格式——后序遍历（左右中）
    private static void getEndRead_(BinaryTree root) {
        if (root == null) return;
        getEndRead_(root.left);
        getEndRead_(root.right);
        System.out.printf("%d  ", root.getVal());
    }

}
