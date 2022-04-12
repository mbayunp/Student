package uin.ac.id.student.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uin.ac.id.student.student.entity.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // Query method
    Optional<Student> findByEmail(String email);
}