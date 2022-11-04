package blockchain;


import java.util.Date;

public class BlockCreator {
    public static Block createNewBlock(int numberOfZerosAtBeginning, Block lastBlock) {
        String newHash;
        String hashStartsWith = "";
        long magicNumber;
        long id = lastBlock == null ? 0 : lastBlock.getId();
        long previousTimeStamp = lastBlock == null ? new Date().getTime() : lastBlock.getTimeStamp();
        for (int i = 0; i < numberOfZerosAtBeginning; i++) {
            hashStartsWith = hashStartsWith.concat("0");
        }

        do {
            magicNumber = MagicNumberUtil.randomNumber();
            newHash = StringUtil.applySha256(String.valueOf(magicNumber));
        } while (!newHash.startsWith(hashStartsWith));
        long nowTimeStamp = new Date().getTime();
        long differenceTimeBetweenBlocks = (nowTimeStamp - previousTimeStamp) / 1000;
        Block block = new Block(id + 1, nowTimeStamp, magicNumber, newHash, differenceTimeBetweenBlocks);
        return block;
    }
}
