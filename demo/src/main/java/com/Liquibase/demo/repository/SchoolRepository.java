package com.Liquibase.demo.repository;

import com.Liquibase.demo.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Long> {
}
