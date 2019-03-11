package pl.trawa.currency.currency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.trawa.currency.currency.entities.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
