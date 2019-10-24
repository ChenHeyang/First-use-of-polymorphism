package Main;

import Animal.Dog;
import Animal.Hippo;
import Animal.Lion;
import List.AnimalList;

/**
 * @author chenheyang
 * @date 2019/10/22 - 2:19 下午
 */
public class Main {
    public static void main(String[] args) {
        AnimalList myAnimalList = new AnimalList();

        Lion lionA = new Lion();
        Dog dogA = new Dog();
        Hippo hippoA = new Hippo();

        myAnimalList.add(lionA);
        myAnimalList.add(dogA);
        myAnimalList.add(hippoA);
        //Object类型的多态引用的代价--编译器根据引用类型来判断可调用的method，而不是确实类型

        Object o1 = myAnimalList.get(1);
        if (o1 instanceof Dog){
            //判断是不是Dog
            Dog myDogA = (Dog) o1;
            //转换为原类型
            myDogA.beFrendlyA();
            myDogA.makeNoise();
        }
    }
}
