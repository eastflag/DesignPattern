package Flyweight_Sample;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    // ������ �̸�
    private char charname;
    // ū ���ڸ� ǥ���ϴ� ���ڿ� ('#' '.' '\n'�� ��)
    private String fontdata;
    // ����
    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("big" + charname + ".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }
    // ū ���ڸ� ǥ���Ѵ�
    public void print() {
        System.out.print(fontdata);
    }
}
