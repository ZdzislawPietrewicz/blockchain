package blockchain;




import java.io.Serializable;

public class Block implements Serializable {
    private static final long serialVersionUID = 2L;
    private long id;
    private long timeStamp;
    private transient long  magicNumber;
    private String hash;
    private long generatedIn;

    public Block(long id, long timeStamp, long magicNumber, String hash, long generatedIn) {
        this.id = id;
        this.timeStamp = timeStamp;
        this.magicNumber = magicNumber;
        this.hash = hash;
        this.generatedIn = generatedIn;
    }

    public Block() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public long getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(long magicNumber) {
        this.magicNumber = magicNumber;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public long getGeneratedIn() {
        return generatedIn;
    }

    public void setGeneratedIn(long generatedIn) {
        this.generatedIn = generatedIn;
    }

    @Override
    public String toString() {
        return "Block{" +
                "id=" + id +
                ", timeStamp=" + timeStamp +
                ", magicNumber=" + magicNumber +
                ", hash='" + hash + '\'' +
                ", generatedIn=" + generatedIn +
                '}';
    }
}
