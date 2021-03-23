import java.util.HashMap;
import java.util.Map;

public class JaizNQRTest {

    private static class Mango{
        private Map<String, String> mainDetails;
        private Map<String, String> subDetails;
        private Double woman;

        private Mango(){

        }
    }


    public static void main(String[] args) throws Exception {

        Mango mango = new Mango();

        String qrCode1 = "0002010102121531**999166**999166****M000000000126720019NG.COM.NIBSS-PLC.QR0111S000000000102309991662005210922520163783561015204000053035665402105802NG5913Test Merchant6007Nigeria6304A54A";
        String qrCode2 = "0002010102111531**999166**999166****M000000093926370018NG.COM.NIBSSPLC.QR0111S0000000695520400005303566540440005802NG5925Merchant A Test Jaiz Bank6007Nigeria63049DF0";
        Map<String, String> subDetails = null;
        Map<String, String> initialDetails = decodeString(qrCode1);

            subDetails = decodeString(initialDetails.get("tag26"));
            String infoWithMerchant = initialDetails.get("tag15");
        mango.mainDetails = initialDetails;
        mango.subDetails = subDetails;

        System.out.println(initialDetails);
        System.out.println(subDetails);
        System.out.println(mango.subDetails.get("tag09"));
//        mango.woman = Double.valueOf("41");
        System.out.println(infoWithMerchant.substring(infoWithMerchant.indexOf("M")));
        System.out.println(mango.woman);
        System.out.println("11".substring(1));
    }


    public static Map<String, String> decodeString(String stringToDecode) {
        Map<String, String> information = new HashMap<>();
        while(stringToDecode.length() > 0){
            String tag = stringToDecode.substring(0,2);
            int length = Integer.parseInt(stringToDecode.substring(2,4));
            String value = stringToDecode.substring(4, 4+length);
            information.put("tag"+tag, value);
            stringToDecode = stringToDecode.substring(4+length);
        }
        return information;
    }

}

