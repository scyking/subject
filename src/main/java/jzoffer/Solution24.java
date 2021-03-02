package jzoffer;

import structure.RandomListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 复杂链表的复制
 * <p>
 *         输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * </p>
 */
public class Solution24 {

    public RandomListNode clone(RandomListNode pHead) {
        RandomListNode result = null;
        if (pHead != null) {
            List<RandomListNode> tmp = new ArrayList<RandomListNode>();
            result = nextClone(pHead, tmp);
            randomClone(pHead, result, tmp);
        }
        return result;
    }

    private RandomListNode nextClone(RandomListNode pHead,
                                     List<RandomListNode> tmp) {
        RandomListNode result = new RandomListNode(pHead.label);
        RandomListNode tmpListNode = result;
        tmpListNode.random = pHead.random;
        tmp.add(pHead.random);
        pHead.random = tmpListNode;
        pHead = pHead.next;
        while (pHead != null) {
            RandomListNode node = new RandomListNode(pHead.label);
            node.random = pHead.random;
            tmp.add(pHead.random);
            pHead.random = node;
            tmpListNode.next = node;
            tmpListNode = node;
            pHead = pHead.next;
        }
        return result;
    }

    private void randomClone(RandomListNode pHead, RandomListNode result,
                             List<RandomListNode> tmp) {
        while (result != null) {
            if (result.random != null) {
                result.random = result.random.random;
            }
            result = result.next;
        }
        int index = 0;
        int size = tmp.size();
        while (index < size) {
            pHead.random = tmp.get(index);
            pHead = pHead.next;
            index++;
        }
    }
}
