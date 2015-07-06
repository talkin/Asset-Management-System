package com.tw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tw.domain.Asset;

@RestController
@RequestMapping("/asset")
public class AssetController
{

    @RequestMapping(method = RequestMethod.GET)
    public Asset getAsset()
    {
        return new Asset(1, "my asset");
    }

}
