# demo
学习demo

# 0.0.1 升级说明
学习 浅克隆(ShallowClone)和深克隆(DeepClone)。

在Java语言中，数据类型分为值类型（基本数据类型）和引用类型，值类型包括int、double、byte、boolean、char等简单数据类型，引用类型包括类、接口、数组等复杂类型。浅克隆和深克隆的主要区别在于是否支持引用类型的成员变量的复制。

实现对象克隆有两种方式：
  1). 实现Cloneable接口并重写Object类中的clone()方法；
  2). 实现Serializable接口，通过对象的序列化和反序列化实现克隆，可以实现真正的深度克隆。 