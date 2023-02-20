package com.erdipeker.springrecipeproject.controllers;

import com.erdipeker.springrecipeproject.domain.Category;
import com.erdipeker.springrecipeproject.domain.UnitOfMeasure;
import com.erdipeker.springrecipeproject.repositories.CategoryRepository;
import com.erdipeker.springrecipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional=categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional= unitOfMeasureRepository.findByDescription("Tablespoon");

        System.out.println("Cat id is " + categoryOptional.get().getId());
        System.out.println("UOM id is " + unitOfMeasureOptional.get().getId());
        return "index";
    }
}
