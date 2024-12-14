package be.ipeters.cp_first.web.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/* carlpeters created on 13/12/2024 inside the package - be.ipeters.cp_first.web.client */
@Component
@ConfigurationProperties(value = "ipeters.cp", ignoreUnknownFields = false)
public class CpClient {
    public final String CP_PATH_V1 = "api/v1/cp";
    private String apiHost;

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }
}
