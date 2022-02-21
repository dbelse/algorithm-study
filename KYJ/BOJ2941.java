import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2941
{
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    char[] croatiaStr = br.readLine().toCharArray();
	    int cnt = 0;
	    for(int i = 0; i < croatiaStr.length; i++) {
            if(i < croatiaStr.length - 1) {
    	        switch(croatiaStr[i]) {
    	            case 'c':
    	                if(croatiaStr[i+1] == '=' | croatiaStr[i+1] == '-') {
    	                    i++;
    	                }
    	                break;
    	            case 'd':
    	                if(croatiaStr[i+1] == '-') {
    	                    i++;
    	                } else if(i < croatiaStr.length - 2 && croatiaStr[i+1] == 'z' && croatiaStr[i+2] == '=') {
    	                    i += 2;
    	                }
    	                break;
    	            case 'l':
    	                if(croatiaStr[i+1] == 'j') {
    	                    i++;
    	                }
    	                break;
    	            case 'n':
    	                if(croatiaStr[i+1] == 'j') {
    	                    i++;
    	                }
    	                break;
                    case 's':
                        if(croatiaStr[i+1] == '=') {
    	                    i++;
    	                }
                        break;
                    case 'z':
                        if(croatiaStr[i+1] == '=') {
    	                    i++;
    	                }
                        break;
    	        }
            }
	        cnt++;
	    }
	    System.out.println(cnt);
	}
}
