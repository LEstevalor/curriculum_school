import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;


/**
 * 二叉树搜索树的生成、插入、删除
 * 应用两个类：
 * 二叉树类BinaryTree（生成二叉树、前中后序读取二叉树）
 * 二叉搜索树操作类BinarySearchTreeTest（二叉搜索树的创建、插入、删除、单节点删除）
 */
public class BinarySearchTreeMain {
    public static void main(String[] args) {
        // 生成
        System.out.println("生成：");
        BinarySearchTree<Integer> binarySearchTreeTest = new BinarySearchTree<>();
        BinaryTree<Integer> root = binarySearchTreeTest.createIntBinarySearchTree();
        BinaryTree.readBinaryTree(root);
        System.out.println("手动遍历验证：");
        System.out.printf("%d\t", root.val);
        System.out.printf("%d\t", root.right.val);
        System.out.printf("%d\t", root.right.right.val);
        System.out.printf("%d\t", root.right.right.left.val);
        System.out.printf("%d\n\n", root.right.right.left.left.val);

        binarySearchTreeTest.showTree(root);

        // 插入
        System.out.println("插入：");
        binarySearchTreeTest.insertIntBinarySearchPoint(root, 2);
        binarySearchTreeTest.insertIntBinarySearchPoint(root, 100);
        BinaryTree.readBinaryTree_(root);

        // 删除
        System.out.println("\n删除：");
        System.out.println("删除根节点：");
        root = binarySearchTreeTest.deleteBinarySearchPoint(root, 10);
        BinaryTree.readBinaryTree_(root);
        System.out.println("再删除一个中间节点：");
        root = binarySearchTreeTest.deleteBinarySearchPoint(root, 90);
        BinaryTree.readBinaryTree_(root);

        /*
        System.out.println("——————————指定10个同学进行测试————————————————");

        Student stu1 = new Student("0005", "小明", 95);
        Student stu2 = new Student("0002", "小一", 90);
        Student stu3 = new Student("0003", "小二", 80);
        Student stu4 = new Student("0008", "小三", 32);
        Student stu5 = new Student("0007", "小四", 45);
        Student stu6 = new Student("0001", "小五", 57);
        Student stu7 = new Student("0004", "小liu", 23);
        Student stu8 = new Student("0006", "小八", 34);
        Student stu9 = new Student("0000", "小七", 73);
        Student stu10 = new Student("0009", "小哈", 60);
        BinarySearchTree<Student> test = new BinarySearchTree<>();
        BinaryTree<Student> root2 = test.createBinarySearchTree(stu1);

        test.insertBinarySearchPoint(root2, stu2, stu2.getStu_id());
        test.insertBinarySearchPoint(root2, stu3, stu3.getStu_id());
        test.insertBinarySearchPoint(root2, stu4, stu4.getStu_id());
        test.insertBinarySearchPoint(root2, stu5, stu5.getStu_id());
        test.insertBinarySearchPoint(root2, stu6, stu6.getStu_id());
        test.insertBinarySearchPoint(root2, stu7, stu7.getStu_id());
        test.insertBinarySearchPoint(root2, stu8, stu8.getStu_id());
        test.insertBinarySearchPoint(root2, stu9, stu9.getStu_id());
        test.insertBinarySearchPoint(root2, stu10, stu10.getStu_id());
        BinaryTree.readBinaryTree(root2);
        System.out.println();

        System.out.println("用随机1千次查找比较二叉搜索树与数组的查找速率");
        int n = 1000;   // 一百万次测试
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        System.out.println("二叉搜索树查找时间前：" + format.format(new Date()));

        for (int i = 0; i < n; i++) {
            int a = (int) Math.floor(Math.random() * 9);
            String string = "000" + a;
            test.researchVal(root2, string);
        }

        System.out.println("后时间：" + format.format(new Date()));


        Student[] array = new Student[10];
        array[0] = stu1;
        array[1] = stu2;
        array[2] = stu3;
        array[3] = stu4;
        array[4] = stu5;
        array[5] = stu6;
        array[6] = stu7;
        array[7] = stu8;
        array[8] = stu9;
        array[9] = stu10;
        
        System.out.println("数组查找时间前：" + format.format(new Date()));

        for (int i = 0; i < n; i++) {
            int a = (int) Math.floor(Math.random() * 10);
            String string = "000" + a;
            for (int j = 0; j < array.length; j++) {
                if (array[j].getStu_id().equals(string)) {
                    break;
                }
            }
        }

        System.out.println("后时间：" + format.format(new Date()));

        System.out.println("\n——————————随机生成100个同学进行1百万次测试：————————————————");
        n = 1000000;
        Student[] arr = new Student[100];
        BinarySearchTree<Student> res = new BinarySearchTree<>();
        Student st1 = new Student("0000", "张00", 80);
        BinaryTree<Student> ree = res.createBinarySearchTree(st1);
        arr[0] = st1;

        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for (int i = 1; i < 100; ) {
            // 0 - 99
            int randomInt = (int) Math.floor(Math.random() * 100);
            // 如果集合中没有便加入
            if (set.add(randomInt)) {
                String num = randomInt < 10 ? "0" + randomInt : "" + randomInt;
                String val_ = "00" + num;
                Student student = new Student(val_, num, randomInt);
                arr[i] = student;
                res.insertBinarySearchPoint(ree, student, val_);
                i++;
            }
        }

        System.out.println("二叉搜索树查找时间前：" + format.format(new Date()));
        for (int i = 0; i < n; i++) {
            int a = (int) Math.floor(Math.random() * 100);
            String string = a < 10 ? "000" + a : "00" + a;
            Student stud = res.researchVal(ree, string);
        }
        System.out.println("后时间：" + format.format(new Date()));


        System.out.println("数组查找时间前：" + format.format(new Date()));
        for (int i = 0; i < n; i++) {
            int a = (int) Math.floor(Math.random() * 100);
            String string = a < 10 ? "000" + a : "00" + a;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].getStu_id().equals(string)) {
                    Student stud_ = arr[j];
                    break;
                }
            }
        }
        System.out.println("后时间：" + format.format(new Date()));
         */
    }
}

class Student {
    private String stu_id;
    private String name;
    private double grade;

    Student(String stu_id, String name, double grade) {
        this.stu_id = stu_id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return stu_id + " " + name + " " + grade;
    }

    public String getStu_id() {
        return stu_id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}