package Decorator_Sample;
public class Main {
	//핵심기능과 부가기능을 분리
	//핵심기능 : 스트링 표시
	//부가기능 : 스트링 꾸미기
	//핵심 인스턴스에 동적으로 부가기능을 추가한다.
	//예: 슈퍼마리오가 아이템을 먹으면 레이저를 쏘고, 점프를 더 높이 하고 등.
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 = 
                    new SideBorder(
                        new FullBorder(
                            new FullBorder(
                                new SideBorder(
                                    new FullBorder(
                                    		new StringDisplay("안녕하세요.")
                                    ),
                                    '*'
                                )
                            )
                        ),
                        '/'
                    );
        b4.show();
    }
}
