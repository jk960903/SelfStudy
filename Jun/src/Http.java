import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.net.*;
class Result {

    /*
     * Complete the 'avgRotorSpeed' function below.
     *
     * URL for cut and paste
     * https://jsonmock.hackerrank.com/api/iot_devices/search?status={statusQuery}&page={number}
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING statusQuery
     *  2. INTEGER parentId
     */

    public static int avgRotorSpeed(String statusQuery, int parentId) {
        HttpURLConnection conn=null;
        try {
        URL url=new URL("https://jsonmock.hackerrank.com/api/iot_devices/search?status="+statusQuery+"&page=1");
        conn=(HttpURLConnection)url.openConnection();
        BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
        conn.setConnectTimeout(5000);
        conn.setReadTimeout(5000);
        String temp;
        String[] temp1 = null;
        while((temp=br.readLine())!=null) {
        	temp1=temp.split("\"data\":");
        }
        System.out.println(temp1);
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
        return 0;
        
    }

}
public class Http {
	public static void main(String[] args) throws IOException {

        String statusQuery = "Running";

        int parentId = 7;

        int result = Result.avgRotorSpeed(statusQuery, parentId);

        String.valueOf(result);
    }
}
