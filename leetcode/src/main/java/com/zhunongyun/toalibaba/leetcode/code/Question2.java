package com.zhunongyun.toalibaba.leetcode.code;

public class Question2 {
    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 示例：
     * <p>
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return handler(l1, l2, 0);
    }

    public ListNode handler(ListNode l1, ListNode l2, int i) {
        if (l1 == null && l2 == null && i == 0) {
            return null;
        }

        int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + i;
        ListNode node = new ListNode(sum % 10);
        node.next = handler(l1 != null ? l1.next : null, l2 != null ? l2.next : null, sum / 10);
        return node;
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();

        ListNode listNode11 = new ListNode(2);
        ListNode listNode12 = new ListNode(4);
        ListNode listNode13 = new ListNode(3);
        listNode12.next = listNode13;
        listNode11.next = listNode12;

        ListNode listNode21 = new ListNode(5);
        ListNode listNode22 = new ListNode(6);
        ListNode listNode23 = new ListNode(4);
        listNode22.next = listNode23;
        listNode21.next = listNode22;

        ListNode result = question2.addTwoNumbers(listNode11, listNode21);
        System.out.println("结束");
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}
