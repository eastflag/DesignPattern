package Builder_Sample;
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();           // �ʵ��� ������ �����Ѵ�.
    public void makeTitle(String title) {                       // �Ϲ� �ؽ�Ʈ�� ����
        buffer.append("==============================\n");     // ��ļ�
        buffer.append("" + title + "\n");                   // ���� ����� Ÿ��Ʋ
        buffer.append("\n");                                // ����
    }
    public void makeString(String str) {                       // �Ϲ� �ؽ�Ʈ������ ���ڿ�
        buffer.append('c' + str + "\n");                     // �� �۸Ӹ� ��ȣ ���� ���ڿ�
        buffer.append("\n");                                // �� ��
    }
    public void makeItems(String[] items) {                   // �Ϲ� �ؽ�Ʈ������ �����׸�
        for (int i = 0; i < items.length; i++) {
            buffer.append(" ��" + items[i] + "\n");            // �� �۸Ӹ� ��ȣ ���� �׸�
        }
        buffer.append("\n");                               // �� ��
    }
    public void close() {                                   // ������ �ϼ�
        buffer.append("==============================\n");     // ��ļ�
    }
    public String getResult() {                              // �ϼ��� ����
        return buffer.toString();                             // StringBuffer�� String���� ��ȯ
    }
}
