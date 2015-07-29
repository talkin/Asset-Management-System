package com.tw.controller;

import com.tw.domain.Asset;
import com.tw.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/asset")
public class AssetController
{
    @Autowired
    private AssetService assetService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Asset> findAssets()
    {
        return assetService.findAll();
    }

}
