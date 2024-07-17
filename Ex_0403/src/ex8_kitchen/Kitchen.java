package ex8_kitchen;

// 인터페이스의 다중 구현
public class Kitchen implements Menu1{

	@Override
	public String boggembab() {
		// TODO Auto-generated method stub
		return "밥 + 춘장 + 계란";
	}

	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "돼지고기 + 당근 + 양념";
	}

	@Override
	public String jajang() {
		// TODO Auto-generated method stub
		return "중면 + 춘장 + 완두콩";
	}
}
