import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TrieNode {

    TrieNode[] arr;
    boolean isEnd;
    int children;

    public TrieNode() {
        this.arr = new TrieNode[26];
        this.children = 0;
    }

}
