package com.zhanghui4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexContrller {

    @GetMapping
    public String index() {
        return "github action test";
    }
}
