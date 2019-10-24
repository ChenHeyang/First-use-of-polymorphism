package Animal;

import Interface.PetA;
import Interface.PetB;

/**
 * @author chenheyang
 * @date 2019/10/23 - 8:30 下午
 */
public class Dog extends Canine implements PetA,PetB {
    //继承与接口的实现

    @Override
    public void makeNoise() {
        System.out.println("Wang!Wang!Wang!");
        super.from();
        //调用父类的method
    }

    @Override
    public void beFrendlyA() {
        System.out.print("Pet dog!");
    }

    @Override
    public void playA() {

    }

    @Override
    public void beFrendlyB() {

    }

    @Override
    public void playB() {

    }
}
