package com.example.java.gettingstarted.util;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by xuchun on 2017/6/4.
 */
@Data
@ToString
@ConfigurationProperties(prefix = "LocalConfig")
public class LocalConfig {
	Boolean live;
}
