package application.form;
/*
	블루클리닝 / 체험학습 신청
 */
/*
DTO(Data Transfer Object)
	: JSP와 Java파일간에 데이터를 전달하기 위한 객체.
	  자바빈 규약에 의해 제작한다.
 */
public class appFormDTO {
	// 공통 멤버변수
	private String id;		 // 아이디
	private String name;	 // 고객명/회사명
	private String phone_num;// 연락처
	private String email;	 // 이메일
	private int regi_type;	 //접수종류 구분
	private String note;	 //기타 특이사항
	// 블루클리닝 멤버변수
    private int bt_postcode;	// 우편번호
    private String bt_basicadd;	// 기본주소
    private String bt_detailadd;// 상세주소
    private String bc_type;		// 청소종류
    private int bc_space;		// 평수
    private String bc_date;		// 청소 희망날짜
    // 체험학습 멤버변수
    private int ft_cake;	//케익체험 인원수
    private int ft_cookie;	//쿠키체험 인원수
    private String ft_date;	//체험 희망날짜

    // getter / setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRegi_type() {
		return regi_type;
	}
	public void setRegi_type(int regi_type) {
		this.regi_type = regi_type;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getBt_postcode() {
		return bt_postcode;
	}
	public void setBt_postcode(int bt_postcode) {
		this.bt_postcode = bt_postcode;
	}
	public String getBt_basicadd() {
		return bt_basicadd;
	}
	public void setBt_basicadd(String bt_basicadd) {
		this.bt_basicadd = bt_basicadd;
	}
	public String getBt_detailadd() {
		return bt_detailadd;
	}
	public void setBt_detailadd(String bt_detailadd) {
		this.bt_detailadd = bt_detailadd;
	}
	public String getBc_type() {
		return bc_type;
	}
	public void setBc_type(String bc_type) {
		this.bc_type = bc_type;
	}
	public int getBc_space() {
		return bc_space;
	}
	public void setBc_space(int bc_space) {
		this.bc_space = bc_space;
	}
	public String getBc_date() {
		return bc_date;
	}
	public void setBc_date(String bc_date) {
		this.bc_date = bc_date;
	}
	public int getFt_cake() {
		return ft_cake;
	}
	public void setFt_cake(int ft_cake) {
		this.ft_cake = ft_cake;
	}
	public int getFt_cookie() {
		return ft_cookie;
	}
	public void setFt_cookie(int ft_cookie) {
		this.ft_cookie = ft_cookie;
	}
	public String getFt_date() {
		return ft_date;
	}
	public void setFt_date(String ft_date) {
		this.ft_date = ft_date;
	}
}
