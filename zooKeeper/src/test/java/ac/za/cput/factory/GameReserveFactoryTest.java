package ac.za.cput.factory;

import ac.za.cput.domain.GameReserve.GameReserve;
import org.junit.Assert;
import org.junit.Test;

public class GameReserveFactoryTest {

    @Test
    public void getZoo() {
        String name = "App Dev Play House";
        GameReserve z = GameReserveFactory.getZoo(name);
        System.out.println(z);
        Assert.assertNotNull(z.getZooName());
    }
}