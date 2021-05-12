package toyproject;

import wsdl.BoxOfficeAPIServiceImplService;
import wsdl.DailyBoxOffice;
import wsdl.DailyBoxOfficeResult;
import wsdl.OpenAPIFault;

import java.util.List;

public class App {
    public static void main( String[] args ) throws OpenAPIFault {

        // https://kobis.or.kr/kobisopenapi/homepg/apikey/ckUser/findApikeyList.do
        String key = "";

        DailyBoxOfficeResult dailyBoxOfficeResult = new BoxOfficeAPIServiceImplService()
                .getBoxOfficeAPIServiceImplPort().searchDailyBoxOfficeList(key, "20210511", "10", "", "", "");

        DailyBoxOfficeResult.DailyBoxOfficeList list = dailyBoxOfficeResult.getDailyBoxOfficeList();

        List<DailyBoxOffice> listBoxOffice = list.getDailyBoxOffice();

        for (DailyBoxOffice bo : listBoxOffice) {
            System.out.println(bo.getMovieNm() + "\t" + bo.getAudiCnt());
        }

    }
}
