package com.college.directory.repositories;

import com.college.directory.models.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentProfileRepository extends JpaRepository<StudentProfile,Long> {

}
