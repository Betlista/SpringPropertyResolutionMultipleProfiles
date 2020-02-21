package betlista.springBootConsoleApp;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class Configuration {

    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    String label;

}
