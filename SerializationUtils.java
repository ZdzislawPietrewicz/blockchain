package blockchain;

import java.io.*;
import java.util.Deque;

public class SerializationUtils implements Serializable{
    private static final String filename = "blockchain.txt";

    public static void serialize(Deque<Block>hashBlocks) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
        objectOutputStream.writeObject(hashBlocks);
        objectOutputStream.close();
    }

    public static Deque<Block> deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
        Deque<Block> hashblocks= (Deque<Block>) objectInputStream.readObject();
        return hashblocks;
    }
}
