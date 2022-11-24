import org.junit.Test;
import vip.epss.pojo.Business;

public class LombokTest {
    public static void main(String[] args) {
        Business business = new Business();
        business.setId(2);
        System.out.println(business);
    }

    @Test
    public void testLombok(){
        Business business = new Business();
        business.setId(2);
        System.out.println(business);
    }
}
