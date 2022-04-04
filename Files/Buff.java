package Files;

import java.io.*;

public class Buff {
    public static void main(String[] args){
        try {
            String str = "helo";
        BufferedWriter writer = new BufferedWriter((new FileWriter("buf.txt")));
        writer.write(str);

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
