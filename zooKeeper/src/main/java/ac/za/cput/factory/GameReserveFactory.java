package ac.za.cput.factory;

import ac.za.cput.domain.GameReserve.GameReserve;
import ac.za.cput.util.Misc;

public class GameReserveFactory {
    public static GameReserve getZoo(String zooName) {
        return new GameReserve.Builder().zooAddress(Misc.generateId())
                .zooName(zooName)
                .build();
    }
}
