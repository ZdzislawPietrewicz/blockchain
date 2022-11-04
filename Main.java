package blockchain;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        Deque<Block>hashBlocks = SerializationUtils.deserialize();
        System.out.println("How many zeros the hash must start with: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfZerosAtBeginning = scanner.nextInt();
        for (int i = 1; i <= 5; i++) {
            Block lastHashBlock = null;
            if (!hashBlocks.isEmpty()) {
                lastHashBlock = hashBlocks.peekLast();
            }
            Block block = BlockCreator.createNewBlock(numberOfZerosAtBeginning, hashBlocks.isEmpty() ? null : lastHashBlock);
            PrintingInfo.printBlock(block, hashBlocks.isEmpty() ? "0" : lastHashBlock.getHash());
            hashBlocks.add(block);
            SerializationUtils.serialize( hashBlocks);
        }
        Deque<Block> block=SerializationUtils.deserialize();
        System.out.println(block);
    }
}
