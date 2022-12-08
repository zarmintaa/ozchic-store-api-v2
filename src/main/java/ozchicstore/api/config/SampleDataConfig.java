/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ozchicstore.api.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Luthfi
 */

@Configuration
public class SampleDataConfig {
    @Bean
    Faker faker() {
        return new Faker();
    }
}
