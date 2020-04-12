import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Trie {
    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode p = root;
        //splits it into characters
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            //gets the character value.
            int index = c-'a';

            //if it doesnt exist, create it and set our root to it to move on.
            if(p.arr[index]==null){
                TrieNode temp = new TrieNode();
                p.arr[index]=temp;
                p = temp;
                p.children++;
            }else{
                //if it does exist set us to the root.
                p=p.arr[index];
                p.children++;
            }
        }
        //once you reached the end, set it to true.
        p.isEnd=true;
    }

    public boolean search(String word) {
        TrieNode p = searchNode(word);
        if(p==null){
            return false;
        }else{
            if(p.isEnd)
                return true;
        }

        return false;
    }

    public TrieNode searchNode(String s){
        TrieNode p = root;
        for(int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            int index = check - 'a';
            if (p.arr[index] != null) {
                p = p.arr[index];
            } else {
                return null;
            }
        }

            if(p == root){
                return null;
            }

            return p;

    }

    public int prefix(String s){
        TrieNode p = root;
        for(char c : s.toCharArray()){
            int index = c - 'a';
            if(p.arr[index] != null){
                p = p.arr[index];
            } else {
                return 0;
            }
        }
        return p.children;
    }




}
