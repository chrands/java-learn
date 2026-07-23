# Java
project start：2026/7/23/  15:02

## 第一个项目：GuessNumberPro

- 项目背景：1-50电脑随机生成数字，然后用户有三次机会猜数字。

- 遇到卡点：最开始写的是`while(count < 4)`，然后下面写的`if(count <= 3)`，这样的话就会进入四次循环，
后来发现直接用`while(count < 3)`，就可以实现完整的流程。

