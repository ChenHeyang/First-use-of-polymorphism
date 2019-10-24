package List;

import Animal.Animal;

/**
 * @author chenheyang
 * @date 2019/10/22 - 1:41 下午
 */
public class AnimalList {
    private Animal[] animals = new Animal[5];
    private int index = 0;

    public void add(Animal a) {
        //多态参数
        if (index < animals.length) {
            animals[index] = a;
            System.out.println("Aniamal added at " + index);
            index++;
        }
    }

    public Animal get(int a){

        return animals[a];
    }
}