package com.ljh.clientdemo.utils;

import java.io.*;

public class IOUtils {

    private static final String TOKEN_FILE = "src/main/resources/data/token.txt";

    public static String readToken(){
        BufferedReader reader = null;
        String token = "";

        try {
            reader = new BufferedReader(new FileReader(TOKEN_FILE));
            token = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null){
                    reader.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return token;
    }


    public static void writeToken(String token){
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(TOKEN_FILE));
            writer.write("");
            writer.flush();

            writer.write(token);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (writer != null){
                    writer.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(readToken());
    }
}
