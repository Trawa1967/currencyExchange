package pl.trawa.currency.currency.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.trawa.currency.currency.dtos.CourseDto;
import pl.trawa.currency.currency.dtos.CourseListDto;
import pl.trawa.currency.currency.repositories.CourseRepository;

@Service
public class CourseService {

    final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    //tworzenie nowej encji Coruse na podstawie danych z formularza courseForm
//    public boolean saveCours(CourseForm courseForm) {
////        return courseRepository.save(new Course(courseForm)) !=null;
////    }

    public CourseDto getCourse(String currencyCode) {
        RestTemplate restTemplate = getRestTemplate();
        return restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/"+currencyCode+"/?format=json", CourseDto.class);

    }

    public CourseListDto getListCourse(String currencyCode) {
        RestTemplate restTemplate = getRestTemplate();
        return restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/"+currencyCode+"/last/10/?format=json", CourseListDto.class);

//        http://api.nbp.pl/api/exchangerates/rates/a/gbp/last/10/?format=json
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
