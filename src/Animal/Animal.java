package Animal;

/**
 * @author chenheyang
 * @date 2019/10/21 - 9:32 下午
 */
public abstract class Animal {
    public abstract void makeNoise();
    public abstract void roam();

    public void sleep(){
        System.out.println("Go to sleep.");
    }
}
