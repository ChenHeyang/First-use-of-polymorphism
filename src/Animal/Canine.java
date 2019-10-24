package Animal;

/**
 * @author chenheyang
 * @date 2019/10/21 - 9:33 下午
 */
public abstract class Canine extends Animal {
    //抽象类的继承可以不实现所有abstract method

    public void roam(){}

    public void from(){
        System.out.println("--From Canine");
    }
}
