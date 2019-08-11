package cn.xbmchina.rbtree;

public class Test {

    public static void main(String[] args) {
        RBTree<String> bst = new RBTree<String>();
        bst.addNode("d");
        bst.addNode("d");
        bst.addNode("c");
        bst.addNode("c");
        bst.addNode("b");
        bst.addNode("f");

        bst.addNode("a");
        bst.addNode("e");

        bst.addNode("g");
        bst.addNode("h");


        bst.remove("c");

        bst.printTree(bst.getRoot());

//        代码调试的时候，printTree输出格式如下:
//        d(B)
//        b(B d LE) g(R d RI)
//        a(R b LE) e(B g LE) h(B g RI)
//        f(R e RI)
//
//        括号左边表示元素的内容。括号内的第一个元素表示颜色，B表示black，R表示red；第二个元素表示父元素的值；第三个元素表示左右，LE表示在父元素的左边。RI表示在父元素的右边。
//
//        第一个元素d是root节点，由于它没有父节点，所以括号内只有一个元素。
    }
}
