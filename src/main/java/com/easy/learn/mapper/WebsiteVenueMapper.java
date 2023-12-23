package com.easy.learn.mapper;

import com.easy.learn.dto.WebsiteVenueDTO;
import com.easy.learn.entity.WebsiteVenue;

public class WebsiteVenueMapper extends AbstractMapper<WebsiteVenue, WebsiteVenueDTO>{
    public WebsiteVenueMapper(){
        super(WebsiteVenue.class, WebsiteVenueDTO.class);
    }
}
