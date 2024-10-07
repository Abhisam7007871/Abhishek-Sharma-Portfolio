package com.avshek.abhishek_portfolio.repository;

import com.avshek.abhishek_portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository<Project, Long> {
}
