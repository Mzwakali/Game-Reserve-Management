package ac.za.cput.domain.gameReserve;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GameReserve {

    @Id
    private Integer zooId;
    private String zooName;

    public GameReserve() {
    }

    public GameReserve(Builder builder) {
        //this.zooStreetNum = builder.zooStreetNum;
        this.zooName = builder.zooName;
    }

    public static class Builder{

        /*zooStreetNum,*/
        private String zooName;

        public Builder zooAddress(int zooAddress){
            //this.zooStreetNum = zooAddress;
            return this;
        }

        public Builder zooName(String zooName){
            this.zooName = zooName;
            return this;
        }

        public GameReserve build(){
            return new GameReserve(this);
        }

    }

    /*public String getZooStreetNum() {
        return zooStreetNum;
    }*/

    public String getZooName() {
        return zooName;
    }

    @Override
    public String toString() {
        return "gameReserve{" +
                "zooName='" + zooName + '\'' +
                '}';
    }
}
