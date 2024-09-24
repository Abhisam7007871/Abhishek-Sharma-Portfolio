package com.avshek.abhishek_portfolio.controller;

import com.avshek.abhishek_portfolio.repository.ProjectRepository;
import com.avshek.abhishek_portfolio.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class PortfolioController {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private SkillRepository skillRepository;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("project", projectRepository.findAll());
        model.addAttribute("skills", skillRepository.findAll());

        return "index"; // This will refer to index.html in the templates folder
    }


}
