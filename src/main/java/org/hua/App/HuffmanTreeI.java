package org.hua.App;

public interface HuffmanTreeI<Node> {
    
    //creating the structure of the tree 
    Node Huffman();
    //reads fequencies from our file in an array so they can be inserted in the min heap
    int[] ReadFrequencies();


}