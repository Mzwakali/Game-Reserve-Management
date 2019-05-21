package ac.za.cput.factory.gameReserve;

import ac.za.cput.domain.gameReserve.GameReserve;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameReserveFactoryTest {

    @Test
    public void getZoo() {
        GameReserve gameReserve = GameReserveFactory.getZoo("Transkei");

        Assert.assertNotNull(gameReserve);
        }
    }