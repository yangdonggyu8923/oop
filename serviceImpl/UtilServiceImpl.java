package serviceImpl;

import service.UtilService;

public class UtilServiceImpl implements UtilService {

    private static UtilService instance = new UtilServiceImpl();

    private UtilServiceImpl(){}

    public static UtilService getInstance(){
        return instance;
    }

    @Override
    public int createdRandomInteger(int start, int gapBetweenStartAndEnd) {
        return start + (int)(Math.random() * gapBetweenStartAndEnd);
    }

    @Override
    public double createdRandomDouble(double start, double gapBetweenStartAndEnd) {
        return Double.parseDouble
                (String.format("%.1f",
                        start + (int)(Math.random() * gapBetweenStartAndEnd)));
    }

    @Override
    public String createdRandomName() {
        String[] names = {"이정재", "마동석", "송강호", "윤여정",
                "황정민", "정우성", "이병헌", "현 빈", "유해진",
                "손석구", "전도연", "손예진", "하지원", "김하늘",
                "송중기", "하정우", "장동건", "원 빈", "박해일", "소지섭", "김혜수"};
        return names[createdRandomInteger(0, 20)];
    }

    @Override
    public String createdRandomContent() {
        String[] contents = {"국가는 농수산물의 수급균형과 유통구조의 개선에 노력하여 가격안정을 도모함으로써 농·어민의 이익을 보호한다.",
                "헌법개정안은 국회가 의결한 후 30일 이내에 국민투표에 붙여 국회의원선거권자 과반수의 투표와 투표자 과반수의 찬성을 얻어야 한다.",
                "사법권은 법관으로 구성된 법원에 속한다. 법관은 헌법과 법률에 의하여 그 양심에 따라 독립하여 심판한다.",
        "헌법재판소 재판관은 탄핵 또는 금고 이상의 형의 선고에 의하지 아니하고는 파면되지 아니한다.",
        "국회는 의장 1인과 부의장 2인을 선출한다. 국회에 제출된 법률안 기타의 의안은 회기중에 의결되지 못한 이유로 폐기되지 아니한다. 다만, 국회의원의 임기가 만료된 때에는 그러하지 아니하다.",
        "국교는 인정되지 아니하며, 종교와 정치는 분리된다. 대통령은 국무회의의 의장이 되고, 국무총리는 부의장이 된다.",
                "누구든지 체포 또는 구속을 당한 때에는 적부의 심사를 법원에 청구할 권리를 가진다.",
                "환경권의 내용과 행사에 관하여는 법률로 정한다. 정당의 목적이나 활동이 민주적 기본질서에 위배될 때에는 정부는 헌법재판소에 그 해산을 제소할 수 있고, 정당은 헌법재판소의 심판에 의하여 해산된다.",
        "법관은 탄핵 또는 금고 이상의 형의 선고에 의하지 아니하고는 파면되지 아니하며, 징계처분에 의하지 아니하고는 정직·감봉 기타 불리한 처분을 받지 아니한다.",
                "국무총리는 국회의 동의를 얻어 대통령이 임명한다. 대통령은 내우·외환·천재·지변 또는 중대한 재정·경제상의 위기에 있어서 국가의 안전보장 또는 공공의 안녕질서를 유지하기 위하여 긴급한 조치가 필요하다",
                };
        return contents[createdRandomInteger(0,9)];
    }

    @Override
    public String createdRandomTitle() {
        String[] titles = {"국가","헌법개정안","사법권","헌법재판소",
                "국회","국교","법관","국무총리","환경권","체포"};
        return titles[createdRandomInteger(0,9)];
    }

    @Override
    public String createdRandomCompany() {
        String[] companies = {"구글", "엔비디아", "메타", "삼성", "LG", "애플"};
        return companies[createdRandomInteger(0,5)];
    }
}
