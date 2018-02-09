package com.soumen.SpringWSClient;

import com.soumen.config.QuoteConfiguration;
import com.soumen.wsclient.QuoteClient;
import hello.wsdl.GetQuoteResponse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SoapClientNonBoot {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(QuoteConfiguration.class);
        ctx.refresh();
        QuoteClient quoteClient = ctx.getBean(QuoteClient.class);
        GetQuoteResponse msft = quoteClient.getQuote("MSFT");
        System.out.println("MICROSOFT VALUE IS :-"+msft.getGetQuoteResult());


    }
}
