# 项目说明

---

[toc]

## 导入方法（IDEA）
1. 依次点击`File` -> `New` -> `Project from Version Control` -> `Git`
1. 输入`https://github.com/scyking/subject.git`，点击`clone`
1. 依次点击`File` -> `Project Structure`
1. 在`Project`中设置jdk、out路径
1. 在`Modules`中设置`src/main/java`为`Sources`
1. 在`Modules`中设置`src/test/java`为`Tests`

## 项目目录结构

## 编程题目录

### [题目来源](https://www.nowcoder.com/ta/coding-interviews)

> 没有特殊说明不考虑特殊输入，如非法值。

1. [二维数组中的查找](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution01.java)
1. [从尾到头打印链表](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution02.java)
1. [重建二叉树](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution03.java)
1. [用两个栈实现队列](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution04.java)
1. [旋转数组的最小数字](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution05.java)
1. [斐波那契数列](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution06.java)
1. [跳台阶](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution07.java)
1. [变态跳台阶](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution08.java)
1. [矩形覆盖](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution09.java)
1. [二进制中1的个数](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution10.java)
1. [数值的整数次方](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution11.java)
1. [调整数组顺序使奇数位于偶数前面](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution12.java)
1. [链表中倒数第k个结点](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution13.java)
1. [反转链表](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution14.java)
1. [合并两个排序的链表](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution15.java)
1. [树的子结构](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution16.java)
1. [二叉树的镜像](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution17.java)
1. [顺时针打印矩阵](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution18.java)
1. [包含min函数的栈](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution19.java)
1. [栈的压入、弹出序列](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution20.java)
1. [从上往下打印二叉树](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution21.java)
1. [二叉搜索树的后序遍历序列](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution22.java)
1. [二叉树中和为某一值的路径](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution23.java)
1. [复杂链表的复制](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution24.java)
1. [二叉搜索树与双向链表](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution25.java)
1. [字符串的排列](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution26.java)
1. [数组中出现次数超过一半的数字](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution27.java)
1. [最小的K个数](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution28.java)
1. [连续子数组的最大和](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution29.java)
1. 整数中1出现的次数（从1到n整数中1出现的次数）

    求出`1~13`的整数中1出现的次数,并算出`100~1300`的整数中1出现的次数？为此他特别数了一下`1~13`中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
    
1. 把数组排成最小的数

    输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
    
1. 丑数

    把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
    
1. 第一个只出现一次的字符

    在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
    
1. 数组中的逆序对

    在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
    
    输入描述:
    
    > 题目保证输入的数组中没有的相同的数字
    
    数据范围：
    
    - 对于%50的数据,size<=10^4
    - 对于%75的数据,size<=10^5
    - 对于%100的数据,size<=2*10^5
    
1. 两个链表的第一个公共结点

    输入两个链表，找出它们的第一个公共结点。
    
1. 数字在排序数组中出现的次数

    统计一个数字在排序数组中出现的次数。
    
1. 二叉树的深度

    输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
    
1. 平衡二叉树

    输入一棵二叉树，判断该二叉树是否是平衡二叉树。
    
1. 数组中只出现一次的数字

    一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
    
1. 和为S的连续正数序列

    小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
    
    输出描述:
    
    > 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
    
1. 和为S的两个数字

    输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
    
    输出描述:
    
    > 对应每个测试案例，输出两个数，小的先输出。
    
1. 左旋转字符串

    汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
    
1. 翻转单词顺序列

    牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
    
1. 扑克牌顺子

    LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！“红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何， 如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
    
1. 孩子们的游戏(圆圈中最后剩下的数)

    每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
    
1. [求1+2+3+...+n](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution46.java)

    求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

1. [不用加减乘除做加法](https://github.com/scyking/subject/blob/master/src/main/java/jzoffer/Solution47.java)

    写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
    
1. 把字符串转换成整数

    将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
    
    输入描述:
    
    > 输入一个字符串,包括数字字母符号,可以为空
    
    输出描述:
    
    > 如果是合法的数值表达则返回该数字，否则返回0
    
1. 数组中重复的数字

    在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
    
1. 构建乘积数组

    给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
    
1. 正则表达式匹配

    请实现一个函数用来匹配包括`.`和`*`的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
    
1. 表示数值的字符串

    请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
    
1. 字符流中第一个不重复的字符

    请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
    
    输出描述:
    
    > 如果当前字符流没有存在出现一次的字符，返回#字符。
    
1. 链表中环的入口结点

    给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
    
1. 删除链表中重复的结点

    在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    
1. 二叉树的下一个结点
    
    给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
    
1. 对称的二叉树
    
    请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
    
1. 按之字形顺序打印二叉树

    请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
    
1. 把二叉树打印成多行

    从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
    
1. 序列化二叉树

    请实现两个函数，分别用来序列化和反序列化二叉树
    
1. 二叉搜索树的第k个结点

    给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
    
1. 数据流中的中位数

    如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数
    
1. 滑动窗口的最大值

    给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
    
1. 矩阵中的路径

    请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。 例如 a b c e s f c s a d e e 这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子
    
1. 机器人的运动范围

    地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
    








