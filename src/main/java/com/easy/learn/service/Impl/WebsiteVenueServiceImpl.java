package com.easy.learn.service.Impl;

import com.easy.learn.dto.WebsiteVenueDTO;
import com.easy.learn.mapper.TrainerSalaryPaidMapper;
import com.easy.learn.repository.WebsiteVenueRepository;
import com.easy.learn.service.WebsiteVenueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class WebsiteVenueServiceImpl implements WebsiteVenueService {
    @Autowired
    WebsiteVenueRepository repository;

    @Autowired
    TrainerSalaryPaidMapper mapper;
    @Override
    public WebsiteVenueDTO create(WebsiteVenueDTO websiteVenueDTO) {
        return null;
    }

    @Override
    public boolean update(WebsiteVenueDTO websiteVenueDTO) {
        return false;
    }

    @Override
    public List<WebsiteVenueDTO> findAll() {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public WebsiteVenueDTO findById(Long id) {
        return null;
    }
}
