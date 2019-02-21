package com.rhiodamuthie.springboot2restservicebasic.repository;

import com.rhiodamuthie.springboot2restservicebasic.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student , Long> {
}
