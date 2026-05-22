# 🚀 LeetCode-Journey (Java 刷题备战笔记)

这里是我的 Java 算法以战养战基地。基于《代码随想录》的顺序进行成体系的刷题与语法查漏补缺，目标是在 2028 年毕业前斩获心仪的 Offer！

---

## 📊 刷题进度面板

| 章节目录 | 核心算法/数据结构 | 已通关题数 | 状态 |
| :--- | :--- | :---: | :---: |
| [01_数组](./01_Array/) | 二分查找、双指针、滑动窗口、模拟 | 1 | 🟡 攻坚中 |
| [02_链表](./02_LinkedList/) | 单链表、双指针、环形链表 | 0 | ⚪ 未开始 |
| [03_哈希表](./03_HashTable/) | HashMap、HashSet、数组映射 | 0 | ⚪ 未开始 |
| [04_字符串](./04_String/) | 双指针、KMP算法 | 0 | ⚪ 未开始 |

---

## 🏆 战绩通关打卡表

每完成一道题，就在这里留下脚印。坚持就是胜利！

| 题号 | 题目名称 | 难度 | 核心解法 | 复习打卡 |
| :---: | :--- | :---: | :--- | :---: |
| 704 | [二分查找](./01_Array/704_BinarySearch.md) | Easy | 闭区间双指针防溢出 | 🟢 First Pass |
| 35 | [搜索插入位置](./01_Array/35_SearchInsertPosition.md) | Easy | 闭区间二分，理解循环结束时 `left` 的含义 | 🟢 First Pass |
| 34 | [在排序数组中查找元素的第一个和最后一个位置](./01_Array/34_FindFirstAndLastPositionOfElementInSortedArray.md) | Medium | 边界压迫法，拆分左右两个二分查找函数 | 🟢 First Pass |

---

## 🛠️ Java 刷题高频 API 备忘录

*(这里可以记录你刷题时经常忘、或者频繁查阅的 Java 基础语法，方便快速看一眼)*
* 获取数组长度：`nums.length` (属性，无括号)
* 防止整型溢出：`int mid = left + (right - left) / 2;`
* 位运算右移（除以2且高效）：`int mid = left + ((right - left) >> 1);`（注意：`>>` 优先级低，必须加括号）