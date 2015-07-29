package com.tw.service.impl;

import com.tw.domain.Asset;
import com.tw.repository.AssetRepository;
import com.tw.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service ("AssetService")
@Repository
@Transactional
public class AssetServiceImpl implements AssetService
{

    @Autowired
    private AssetRepository assetRepository;

    @Override
    public List<Asset> findAll()
    {
        return assetRepository.findAll();
    }
}
