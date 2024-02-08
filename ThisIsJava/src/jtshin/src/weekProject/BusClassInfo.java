package weekProject;

public class BusClassInfo { //다음 창으로 넘어갈때 데이터를 넘겨주는용
	public static String bus1; //스윙에서 다른 창으로 넘어갈때 변수값이 저장이 불가능함으로 정적변수에 따로 저장하고 창 새로 띄움
	public static int price; //데이터베이스에서 내부에 있는 버스 요금을 따로 저장
	public static int totalPrice; //최종적인 버스 요금을 창 넘어가기 전에 정적 변수로 저장
	public static String selectDate;
	public static String selectTime;
	public static String selectEndRegion;
}
