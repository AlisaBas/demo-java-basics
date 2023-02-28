import by.itacademy.habasaraba.javabasics.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void testSquare(){
        Circle circle =new Circle();
        double square= circle.square(0);
        Assert.assertEquals(0,square,0);
    }


}
