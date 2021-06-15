package com.zen.moviecatalog.controller;

import com.zen.moviecatalog.model.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
    @RequestMapping("/{userId}")
    List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        return Collections.singletonList(
            new CatalogItem("Matrix", "living in the matrix", 9)
        );
    }
}
