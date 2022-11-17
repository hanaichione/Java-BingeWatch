
/*클래스의 구성요소 3가지
 * 인스턴스 변수 : 멤버변수
	- [접근지정자] 데이터형 변수명;
 * 메소드 : 멤버 메소드
 * 생성자
*/

/*지정자
 * 일반 지정자(modifier)
 	- static
 	- final
 	- abstract
 * 접근 지정자(access modifier)
 	- public
 	- protected
 	- private
*/

/*클래스 이름
 * 명사형으로 지정
 * 첫 글자는 대문자
 * 클래스명.java 형식으로 저장
*/

/*변수 종류
 * 로컬 변수
	- 메소드 안에서 선언된 변수
	- 메소드 호출 시 생성, 메소드 종료 시 제거
	- stack 메모리에 저장, 임시적으로 사용
	- 접근 지정자 사용 불가
	- 사용전 반드시  초기화
 * 인스턴스 변수
	- 메소드 밖에서 선언된 변수
	- 객체 생성 시 생성, 객체 제거 시 삭제
	- heap 메모리에 저장, 클래스의 인스턴스 정보(속성) 저장 용도
	- 초기화하지 않을 경우 기본값으로 자동 설정
 * 클래스 변수
	- 메소드 밖에서 선언된 변수
	- 변수 선언 시 static 키워드 사용
	-- static int age;
	- 프로그램 실행 시 자동 생성, 프로그램 종료 시 삭제
	- 객체 생성 전 단 한번만 생성
	- 클래스명.변수 형식으로 접근
	- 데이터 누적용으로 주로 사용
	- Method Area 영역에 저장
	- 초기화하지 않을 경우 기본값으로 자동 설정
*/

/*static 키워드
 * 클래스 용도 : inner 클래스에만 사용 가능
 * 메소드 용도 : 객체 생성 없이 메소드 사용하기 위함(static 메소드 내 인스턴스 변수 사용 불가)
 * 데이터 누적용
 * 
 * final 키워드
 * 클래스 용도 : 상속 불가
 * 메소드 용도 : overriding 불가
 * 변수 용도 : 값 변경 불가(상수)
*/
public class Hello_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
	}

}
