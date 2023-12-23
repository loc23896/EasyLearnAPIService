package com.easy.learn.mapper;

import com.easy.learn.dto.WebsiteVenueDTO;
import com.easy.learn.entity.WebsiteVenue;

public class WebsiteFinancesMapper extends AbstractMapper<WebsiteVenue, WebsiteVenueDTO>{
    public WebsiteFinancesMapper(){
        super(WebsiteVenue.class,WebsiteVenueDTO.class);
    }
}
