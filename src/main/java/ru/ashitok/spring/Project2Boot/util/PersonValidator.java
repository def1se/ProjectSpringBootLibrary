package ru.ashitok.spring.Project2Boot.util;//package ru.ashitok.spring.util;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//import ru.ashitok.spring.models.Person;
//import ru.ashitok.spring.services.PeopleService;
//
//@Component
//public class PersonValidator implements Validator {
//
//    private final PeopleService peopleService;
//
//    @Autowired
//    public PersonValidator(PeopleService peopleService) {
//        this.peopleService = peopleService;
//    }
//
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return Person.class.equals(clazz);
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        Person person = (Person) target;
//
//        if (peopleService.findPersonByFio(person.getFio()).isPresent()) {
//            errors.rejectValue("fio", "", "Человек с таким ФИО уже существует!");
//        }
//    }
//}
