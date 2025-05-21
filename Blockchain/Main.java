package Blockchain;

import java.util.ArrayList;

public class Main {
    /*
     * Hash = digital signature
     */
    ArrayList<Block> blockchain = new ArrayList<>();
    public static void main(String[] args) {

        String[] genesisTrans = {
            "Satoshi sent Ivan 1 BC",
            "Atom sent 10 BC to Ivan"
        };
        Block genesisBlock = new Block(0, genesisTrans);

        String[] secondTrans = {
                "Ivan sent Sathoshi 1000 BC",
                "Satoshi sent 100 BC to Starbucks"
        };
        Block secondBlock = new Block(genesisBlock.getBlockHash(), secondTrans);

        String[] thirdTrans = {
            "Bob sent Sathoshi 100 BC",
            "Satoshi sent 10 BC to Apple"
        };
        Block thirdsBlock = new Block(secondBlock.getBlockHash(), thirdTrans);
        System.out.println("Hash of genesis block: ");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2: ");
        System.out.println(secondBlock.getBlockHash());

        System.out.println("Hash of block 3: ");
        System.out.println(thirdsBlock.getBlockHash());
    }
}

