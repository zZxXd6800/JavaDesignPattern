package day1_design_principles;

/**
 * UML（Unified Modeling Language，统一建模语言）类图：类、接口、继承、实现、依赖、关联、聚合
 * 用于描述系统中类（对象）本身的组成和类（对象）之间的各种静态关系
 */
public class ClassDiagram {
    /**
     * 继承（Generalization）：（三角实线）
     * 实现（Realization）：（三角虚线）
     * 依赖（Dependency）：只要在类中用到了对方（成员变量、方法参数、返回值、局部变量），那么他们之间就存在依赖关系（箭头虚线）
     * 关联（Association）：单向/双向  一对一/一对多/多对多（箭头实线）
     * 聚合（Aggregation）：表示部分和整体的关系，整体和部分可以分开，是关联关系的一种特例，具有导航型和多重性（空心菱形）
     * 组合（Composition）：表示部分和整体的关系，但整体和部分不能分开，级联删除也是一种组合关系（实心菱形）
     */
}
