package blockchain;

public class PrintingInfo {
    public static void printBlock(Block block, String lastHash){
        System.out.println("Block: ");
        System.out.println("Id: " + (block.getId()));
        System.out.printf("Timestamp: %s \n", block.getTimeStamp());
        System.out.printf("Magic number: %d\n", block.getMagicNumber());
        System.out.println("Hash of the previous block:");
        if (block.getId() == 1) {
            System.out.println("0");
        } else {
            System.out.println(lastHash);
        }
        System.out.printf("Hash of the block:\n%s \n", block.getHash());
        System.out.printf("Block was generating for %s second\n", block.getGeneratedIn());
        System.out.println("");
    }
}
