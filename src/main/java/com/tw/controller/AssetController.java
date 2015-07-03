package com.tw.controller;

import com.tw.domain.Asset;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/asset")
public class AssetController {

    private final AtomicLong counter = new AtomicLong();

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Asset getAsset() {
        return new Asset(counter.incrementAndGet(), "my asset");
    }
}
