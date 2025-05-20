import java.util.Arrays;

public class Block {
    private int prevHash;
    private String[] transactions; // In a real blockchain a Transaction would be their own objects
    private int blockChain;
    public Block(int prevHash, String[] transactions)
    {
        this.prevHash = prevHash;
        this.transactions = transactions;
        Object[] content = {Arrays.hashCode(transactions)};
    }
    public static void main(String[] args) {
        /*
         * Hash = digital signature
         * Each block will have:
         * List of transactions
         * Prev Hash
         */
    }
}