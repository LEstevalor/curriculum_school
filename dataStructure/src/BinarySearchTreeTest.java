import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

final class BinarySearchTree<T> {
    /**
     * 创建二叉搜索树（只适应于整型创建）
     * @return 返回根节点
     */
    BinaryTree<Integer> createIntBinarySearchTree() {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入需要构造的二叉树节点数：");
        int n = scan.nextInt();
        System.out.print("输入二叉树节点值，构建二叉搜索树：");
        BinaryTree<Integer> root = null;
        while (n-- > 0) {
            int val = scan.nextInt();
            if (root == null) {
                root = new BinaryTree<Integer>(val);
            } else {
                insertIntBinarySearchPoint(root, val);
            }
        }
        System.out.println();
        return root;
    }

    /**
     * 插入二叉搜索树（节点值必须为整型）
     * @param root 根节点
     * @param val  插入索引值
     * @return bool表示是否插入成功（是否有重复value）
     */
    boolean insertIntBinarySearchPoint(BinaryTree<Integer> root, int val) {
        // 根节点为空，抛出异常
        if (root == null) {
            throw new NullPointerException("根节点为空");
        }
        BinaryTree<Integer> point = root;
        boolean bo1 = false;
        boolean bo2 = false;
        do {
            bo1 = point.left != null && val < point.getVal();
            bo2 = point.right != null && val > point.getVal();
            if (bo1) point = point.left;
            if (bo2) point = point.right;
        } while(bo1 || bo2);
        // point绝不可能为空，从do while语句中走到最合适的point点
        // 判断是point的左边还是右边，如果point左孩子存在且比它小，那必然会在上面的do while语句继续循环，右边同理
        if (val > point.getVal()) {
            point.right = new BinaryTree<Integer>(val);
        } else if (val < point.getVal()) {
            point.left = new BinaryTree<Integer>(val);
        } else {
            return false;  // 插入失败，有重复值
        }
        // 树显示
        showTree(root);
        return true; // 插入成功
    }

    /**
     * 创建二叉搜索树
     * @param t 根节点对象
     * @return 返回根节点
     */
    BinaryTree<T> createBinarySearchTree(T t) {
        BinaryTree<T> root = new BinaryTree<>(t);
        return root;
    }

    /**
     * 插入二叉搜索树
     * @param root 根节点
     * @param t    插入实例
     * @param val_  插入索引值
     * @return bool表示是否插入成功（是否有重复value）
     */
    boolean insertBinarySearchPoint(BinaryTree<T> root, T t, String val_) {
        int val = Integer.parseInt(val_);
        // 根节点为空，抛出异常
        if (root == null) {
            throw new NullPointerException("根节点为空");
        }
        BinaryTree<T> point = root;
        boolean bo1 = false;
        boolean bo2 = false;
        do {
            bo1 = point.left != null && val < point.getVal();
            bo2 = point.right != null && val > point.getVal();
            if (bo1) point = point.left;
            if (bo2) point = point.right;
        } while(bo1 || bo2);
        // point绝不可能为空，从do while语句中走到最合适的point点
        // 判断是point的左边还是右边，如果point左孩子存在且比它小，那必然会在上面的do while语句继续循环，右边同理
        if (val > point.getVal()) {
            point.right = new BinaryTree<T>(t);
        } else if (val < point.getVal()) {
            point.left = new BinaryTree<T>(t);
        } else {
            return false;  // 插入失败，有重复值
        }
        return true; // 插入成功
    }

    /**
     * 删除搜索二叉树节点
     * @param root 根节点
     * @param val 删除的节点值
     * @return 返回删除后的搜索二叉树根节点
     */
    BinaryTree<T> deleteBinarySearchPoint(BinaryTree<T> root, int val) {
        // 删除分两种情况，删根节点，或其他节点（因为返回情况和后续调用情况），
        // 同时这里我们以左子树优先的原则，比如删去的是根节点，那么优先用左子树代替根节点
        // （注意这里不是单单用根节点的左孩子，而是左子树）
        if (root.getVal() == val) {
            return updateDeleteTree(root);
        } else {
            BinaryTree<T> point = root;
            BinaryTree<T> oldPoint = root;
            boolean bo1 = false;
            boolean bo2 = false;
            do {
                bo1 = point.left != null && val < point.getVal();
                bo2 = point.right != null && val > point.getVal();
                if (bo1) {
                    oldPoint = point;
                    point = point.left;
                }
                if (bo2) {
                    oldPoint = point;
                    point = point.right;
                }
            } while(bo1 || bo2);
            // 找到最合适的点
            if (point.getVal() == val) {
                // 判断是左子树还是右子树
                if (oldPoint.left == point) {
                    oldPoint.left = updateDeleteTree(point);
                } else {
                    oldPoint.right = updateDeleteTree(point);
                }
            }
            // 不等则不需处理
            return root;
        }
    }

    /**
     * 删除当前节点，返回节点优化后的子树
     * @param point 删除节点
     * @return 节点优化后的子树
     */
    BinaryTree<T> updateDeleteTree(BinaryTree<T> point) {
        if (point.left == null) return point.right;
        // 遍历到该树的最右节点，在该节点的右节点位置插入point右子树
        BinaryTree<T> po = point.left;
        while (po.right != null) po = po.right;
        po.right = point.right;
        return point.left;
    }

    /**
     * 查找节点
     * @param root 根节点
     * @param val_ 有点索引值的意思
     * @return 返回节点对象
     */
    T researchVal(BinaryTree<T> root, String val_) {
        int val = Integer.parseInt(val_);
        BinaryTree<T> point = root;
        while (point != null) {
            if (point.getVal() == val) {
                return point.val;
            } else if (point.getVal() > val) {
                point = point.left;
            } else {
                point = point.right;
            }
        }
        return null;
    }

    /**
     * 显示排序二叉树（这里只针对整型）
     * @param root 根节点
     */
    public void showTree(BinaryTree root) {
        int depth = getDepth(root);
        Queue<BinaryTree> queue = new LinkedList<>();  // 使用队列
        queue.add(root);
        boolean to = false;  // 标志是否为首行
        String sLeRi = "";   // 树横线
        String s = "";       // 树含数字的行
        while(depth >= 0) {
            boolean isLeft = true;  // 判断左右
            int count = queue.size();
            s = scanVoid(3*((int)Math.pow(2, depth-1)-1));
            sLeRi = scanVoid(3*((int)Math.pow(2, depth-1)-1));
            boolean bo = false;  // 判断是否为首位
            while (count-- > 0) {
                BinaryTree cur = queue.remove();
                if (!bo) {
                    bo = true;
                } else {
                    s += scanVoid(-1+3*((int)Math.pow(2, depth)-1));
                    sLeRi += scanVoid(-1+3*((int)Math.pow(2, depth)-1));
                }
                if (cur != null) {
                    s += scanInt(cur.getVal());
                    sLeRi += isLeft ? "    /" : "  \\";
                    isLeft = !isLeft;
                } else {
                    s += scanVoid(4);
                    sLeRi += scanVoid(4);
                    isLeft = !isLeft;
                }

                if(cur != null && cur.left != null) {
                    queue.add(cur.left);
                } else {
                    queue.add(null);
                }
                if(cur != null && cur.right != null) {
                    queue.add(cur.right);
                } else {
                    queue.add(null);
                }
            }
            if (!to) {
                to = true;
            } else {
                System.out.println(sLeRi);
            }
            System.out.println(s);
            depth--;
        }
    }

    /**
     * 求数深度
     * @param root 树根节点
     * @return
     */
    public int getDepth(BinaryTree<T> root) {
        if (root == null) return 0;
        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }

    /**
     * 输出指定空格数的空格
     * @param k 数目
     */
    public String scanVoid(int k) {
        String s = "";
        for (int i = 0; i < k; i++) {
            s += " ";
        }
        return s;
    }

    /**
     * 输出指定长度数字（假定数字的位数均不超过4）
     * @param num 数字
     */
    public String scanInt(int num) {
        int len = (num + "").length();
        return scanVoid(4-len) + String.valueOf(num);
    }
}
