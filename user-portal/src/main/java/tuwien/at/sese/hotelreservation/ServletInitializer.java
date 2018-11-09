package tuwien.at.sese.hotelreservation;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import tuwien.at.sese.hotelreservation.application.HotelApplication;

/**
 * @see SpringBootServletInitializer
 */
public class ServletInitializer extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(HotelApplication.class);
    }
}
