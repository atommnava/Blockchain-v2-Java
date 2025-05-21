package Blockchain;

import java.util.Arrays;

public class Block {
    private int prevHash;
    private String[] transactions; // In a real blockchain a Transaction would be their own objects
    private int blockHash;

    public Block(int prevHash, String[] transactions)
    {
        this.prevHash = prevHash;
        this.transactions = transactions;
        Object[] contens = {Arrays.hashCode(transactions), prevHash};
        this.blockHash = Arrays.hashCode(contens);
    }

    public int getPrevHash()
    {
        return prevHash;
    }
    public String[] getTransactions()
    {
        return transactions;
    }
    public int getBlockHash(){
        return blockHash;
    }
}