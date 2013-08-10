package Flyweight_Sample;
import java.util.HashMap;

public class BigCharFactory {
    // �̹� ������� BigChar�� �ν��Ͻ��� ��
    private HashMap pool = new HashMap();
    // Singleton ����
    private static BigCharFactory singleton = new BigCharFactory();
    // ����
    private BigCharFactory() {
    }
    // ������ �ν��Ͻ��� ��´�
    public static BigCharFactory getInstance() {
        return singleton;
    }
    // BigChar�� �ν��Ͻ� ��(����)
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar)pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname); // ���⿡�� BigChar�� �ν��Ͻ��� ��
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
