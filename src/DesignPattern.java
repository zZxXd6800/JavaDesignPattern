/**
 * 本质：提高软件的可维护性、通用性、拓展性，降低复杂度
 * 分类：（3类23种）
 *      a.创建型：描述怎样创建对象，将对象的创建与使用分离
 *          - 单例：某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例
 *          - 简单工厂：定义一个创建产品的类，由这个类来封装实例化对象的行为
 *          - 工厂方法：定义一个用于创建产品的接口，由子类决定生产什么产品
 *          - 抽象工厂：提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品
 *          - 原型：将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例
 *          - 建造者：将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成该复杂对象
 *      b.结构型：描述如何将类或对象按某种布局组成更大的结构
 *          - 适配器：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作
 *          - 桥接：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度
 *          - 装饰：在不改变现有对象结构的情况下，动态的给对象增加一些职责，即增加其额外的功能
 *          - 组合：将对象组合成树状层次结构，使得客户端代码可以一致地处理单个对象和组合对象
 *          - 外观：为多个复杂的子系统提供一个一致的接口，使这些子系统更加容易被访问，对外有一个统一接口，外部应用程序不用关心内部子系统的具体的细节
 *          - 享元：运用共享技术来有效地支持大量细粒度对象的复用，通过共享已经存在的对象大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率
 *          - 代理：为某对象提供一种代理以控制对该对象的访问。即客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性
 *      c.行为型：用于描述程序在运行时复杂的流程控制；即描述多个类或对象之间怎样相互协作共同完成单个对象都无法单独完成的任务，它涉及算法与对象间职责的分配
 *          - 模板方法：定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤；封装了不变部分，扩展可变部分
 *          - 命令：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开
 *          - 访问者：在不改变集合元素的前提下，为一个集合中的每个元素提供多种访问方式，即每个元素有多个访问者对象访问（将对数据的操作与数据结构进行分离）
 *                  将作用于某种数据结构中的各元素的操作分离出来封装成独立的类，使其在不改变数据结构的前提下可以添加作用于这些元素的新的操作，为数据结构中的每个元素提供多种访问方式
 *          - 迭代器：提供一种方法来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示
 *          - 观察者：多个对象间存在一对多关系，当一个对象发生改变时，把这种改变通知给其他多个对象，从而影响其他对象的行为
 *                  具体目标对象和具体观察者对象之间不能直接调用，否则将使两者之间紧密耦合起来
 *          - 中介者：定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互（网状结构改为星形结构）
 *          - 备忘录：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便以后当需要时能将该对象恢复到原先保存的状态
 *          - 解释器：提供如何定义语言的文法，以及对语言句子的解释方法
 *          - 状态：对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为
 *          - 策略：定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户；使算法的使用和实现分离
 *          - 职责链：为了避免请求发送者与多个请求处理者耦合在一起，将所有请求的处理者通过前一对象记住其下一个对象的引用而连成一条链
 *                  当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止
 *                  客户只需要将请求发送到责任链上即可，无须关心请求的处理细节和请求的传递过程，将请求的发送者和请求的处理者解耦
 *
 *      1. 类模式：用于处理类与子类之间的关系，这些关系通过继承来建立，是静态的，在编译时刻便确定下来了(工厂方法、类适配器、模板方法、解释器)
 *      2. 对象模式：用于处理对象之间的关系，这些关系可以通过组合或聚合来实现，在运行时刻是可以变化的，更具动态性(其余19种)
 */
public class DesignPattern {
}
