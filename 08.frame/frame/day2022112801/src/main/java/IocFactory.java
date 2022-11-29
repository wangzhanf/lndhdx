import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vip.epss.dao.BusinessMapper;

@Configuration
public class IocFactory {

    @Bean
    public BusinessMapper businessMapper(){
        return new BusinessMapper();
    }
}
