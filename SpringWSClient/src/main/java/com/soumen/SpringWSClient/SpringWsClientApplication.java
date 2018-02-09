/*
package com.soumen.SpringWSClient;

import com.soumen.wsclient.QuoteClient;
import hello.wsdl.GetQuoteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWsClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWsClientApplication.class, args);

    }

    @Bean
    CommandLineRunner lookup(QuoteClient quoteClient) {
        return args -> {
            String ticker = "MSFT";

            if (args.length > 0) {
                ticker = args[0];
            }
            GetQuoteResponse response = quoteClient.getQuote(ticker);
            System.out.println("Quote Value -> " + response.getGetQuoteResult());
        };
    }
}
*/
