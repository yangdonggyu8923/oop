package view;

public class PhoneInheritance {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println("====== 집 전화 ======");
        phone.setCompany("금성");
        phone.setCall("제임스");
        System.out.println(phone);
        System.out.println("====== 휴대전화 ======");
        CelPhone cp = new CelPhone();
        cp.setCompany("노키아");
        cp.setCall("에릭");
        cp.setPortable(true);
        System.out.println(cp);
        System.out.println("====== 아이폰 ======");
        IPhone ip = new IPhone();
        ip.setCompany("애플");
        ip.setCall("톰");
        ip.setPortable(true);
        ip.setData("애플 아이폰으로 톰에게 폰을 휴대할 수 있음 데이터를 전송하다.");
        System.out.println(ip); // 애플 아이폰으로 톰에게 폰을 휴대할 수 있음 데이터를 전송하다.
        System.out.println("====== 갤럭시노트 ======");
        AndroidPhone ap = new AndroidPhone();
        ap.setCompany("삼성");
        ap.setCall("이재용");
        ap.setPortable(true);
        ap.setSize("10인치");
        ap.setData("삼성 갤럭시 노트로 제인에게 10인치 폰을 휴대할 수 있음 데이터를 전송하다.");
        System.out.println(ap); // 삼성 갤럭시 노트로 제인에게 10인치 폰을 휴대할 수 있음 데이터를 전송하다.

    }
}
class AndroidPhone extends IPhone{
    private String size;
    public static String BRAND = "갤럭시노트";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "휴대폰" +
                "\n제조사 : " + company + " " + BRAND +
                "\n수신자 : " + call +
                "\n이동성 : " + portable +
                "\n이동유무 : " + move +
                "\n사이즈 : " + size +
                "\n데이터 전송 : " + data;
    }


}
class IPhone extends CelPhone{
    protected String data;
    public static String BRAND = "iPhone";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data ;
    }


    @Override
    public String toString() {
        return "휴대폰" +
                "\n제조사 : " + super.company + " " + BRAND +
                "\n수신자 : " + super.call +
                "\n이동성 : " + super.portable +
                "\n이동유무 : " + super.move +
                "\n데이터 전송 : " + data;
    }
}
class CelPhone extends Phone{
    protected boolean portable; // 이동성, 휴대가능성
    protected String move;

    public boolean isPortable() { // boolean은 get이 아닌 is를 사용한다.
        return portable;
    }

    public void setPortable(boolean portable) {
        if(portable){
            this.setMove("폰을 휴대할 수 있음");
        }else{
            this.setMove("폰을 휴대할 수 없음");
        }
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "휴대폰" +
                "\n제조사 : " + super.company +
                "\n수신자 : " + super.call +
                "\n이동성 : " + portable +
                "\n이동유무 : " + move;
    }
}
class Phone{ // 클래스는 여러개 있어도 되지만 public class는 하나만 있어야한다
    protected String company, call; // 인스턴스 변수 = 멤버변수 => 힙 영역
    static final double TAX_RATE = 0.095; // 스태틱 변수 = 전역변수 => 스태틱 영역
                                          // 상수는 변할 수 있기 때문에 final을 붙여 불변으로 만듬

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company + "에서 제작하다.";
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call + "에게 전화를 걸다.";
    }

    @Override
    public String toString() {
        return "집전화" +
                "\n제조사 : " + company +
                "\n수신자 : " + call;
    }
}
