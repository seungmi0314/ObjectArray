package edu.kh.oarr.model.vo;

public class Member {
	//필드(== 멤버변수)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region; // 지역(서울, 경기, 충북, 전남,,,)
	
	
	
	//생성자
	// 1. 생성자 이름은 클래스 명과 같아야한다
	// 2. 반환형이 없다
	public Member() {} // 기본생성자, 매개변수 생성자 있을경우 우리가 직접 써 줘야함
	
	// 매개변수 생성자  // 함수의 정의에서 전달받은 인수를 함수 내부로 전달하기위해 사용
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
	
	this.memberId = memberId;
	this.memberPw = memberPw;
	this.memberName = memberName;
	this.memberAge = memberAge;
	this.region = region;
}

	
	//메소드
	//getter / setter
	public String getMemberId() {
		return memberId;
	}
	// 왜 퍼블릭인가 - 외부클래스에서 다 접근 가능하도록
	// 왜 스트링인가 - 스트링 자료형을 돌려보내려고
	// 뭘 리턴하겠다는게 아니여서 ()안에 아무것도 안써있음
	// getMemberId를 호출하는 곳으로 돌려 보냄
	// 얘는 왜 this가 없어도 되는가 겹치는게 없어서
	/*
	 * 다 접근 가능하도록 public
	 * String 자료형 돌려보내겠다
	 * 매개변수가 없어서 중복된 이름의 memberId가 없기 때문에 memberId라고만 써도 ok
	 * */
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
		// 모든 메서드는 종료 시 호출한 곳으로 돌아가는
		// return 구문이 작성되어야 하지만 단, void일 경우 생략 가능하다
		// -> 생략 시 컴파일러가 자동추가해줌( 우리 눈에만 안보일 뿐 ) => return
	}
	// 공공의 접근제한자 퍼블릭
	// 매개변수로 외부에서 무언가 받아오기 때문에 퍼블릭
	// 보이드인 이유 매개변수에서 값을 받아오기만 하고 딱히 돌려줄데는 없어서
	// 매개변수로 받아온 값을 디스로 저장 해 주는 용도,,, 뭐라는거
	// 얘는 겹치는게 있음 () 안의 memberId, this = 에 memberId
	/*
	 * setter는 말 그대로 셋팅하는 애.
	 * 무엇을 셋팅할지 전달받아올 해가 필요합니다 ==> 매개변수
	 * setter는 *보통* 반환 값은 없음 반환값이 있는 경우도 있음
	 */
	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
}
