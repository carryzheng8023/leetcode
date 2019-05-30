package xin.carryzheng.utils;

/**
 * @author zhengxin
 * @date 2018-04-04 09:09:27
 */
public class Node implements Comparable<Node> {

    public Comparable data;
    public Node left;
    public Node right;

    public Node(Comparable data){
        this.data = data;
    }

    public Node(){}

    @Override
    public int compareTo(Node o) {
        return this.data.compareTo(o.data);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
