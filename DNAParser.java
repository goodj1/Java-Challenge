package com.spartaglobal.challenge2;

class Main {
    public static void main(String[] args) {
        String str = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";

        int countA = 0;
        int countG = 0;
        int countT = 0;
        int countC = 0;

        final int len = str.length();
        for (int i = 0; i < len; i++) {

            char c = str.charAt(i);

            switch (c) 
            { 
              case 'A':  
                countA++;
                break;
              case 'G':  
                countG++;
                break;

              case 'T':  
                countT++;
                break;
              
              case 'C':  
                countC++;
                break;
            }
        }

        System.out.println("A count: " + countA + " G count: "  + countG + " C count: " + countC + " T count: " + countT);
    }
}
