package com.easy.learn;

import com.easy.learn.Enum.Gender;
import com.easy.learn.Enum.Status;
import com.easy.learn.entity.*;
import com.easy.learn.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private AdminTrainerRepository repository;

    @Autowired
    private CourseEditRepository courseRepository;

    @Autowired
    private VideoEditRepository videoEditRepository;

    @Autowired
    private TestEditRepository testEditRepository;

    @Autowired
    private LessonEditRepository lessonEditRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//        System.out.println("Spring start!!!");
    }

    @Override
    public void run(String... args) throws Exception {
        //add new adminTrainer
//        AdminTrainer trainer1 = new AdminTrainer();
//        trainer1.setFirstName("lOC");
//        trainer1.setLastName("qUANG");
//        trainer1.setCountry("EN");
//        trainer1.setStatus(Status.ACTIVE);
//        trainer1.setDob(LocalDate.of(1996, 8, 23));
//        trainer1.setEmail("loc23896@gmail.com");
//        trainer1.setGender(Gender.MALE);
//        trainer1.setPhoneNumber("0909080909");
//        trainer1.setCardNumber("123123123123123");
//        // Lưu đối tượng AdminTrainer vào cơ sở dữ liệu
//        repository.save(trainer1);
//
        //add new course
//        CourseEdit courseEdit1 = new CourseEdit();
//        courseEdit1.setStatus(Status.ACTIVE);
//        courseEdit1.setTitle("toesc 123");
//        courseEdit1.setDescription("khoa hoc vui ve");
//        courseEdit1.setAdminTrainer(trainer1);
//        courseRepository.save(courseEdit1);

        //edit course check lastupdate
//        CourseEdit course2 = courseRepository.findById(1L).get();
//        course2.setTitle("không học nữa");
//        courseRepository.save(course2);

        //add lesson
        LessonEdit lessonEdit1 = new LessonEdit();
        lessonEdit1.setName("Bài học đầu tiên dui dẻ");
        lessonEdit1.setCourseEdit(courseRepository.findById(1L).get());
        lessonEditRepository.save(lessonEdit1);


//        //add list test
//        TestEdit test1 = new TestEdit();
//        test1.setDiffLevel("1");
//        test1.setQuestion("Ai là giáo viên của FJB01");
//        test1.setOp1("Anh Ni");
//        test1.setOp2("Anh Trung");
//        test1.setOp3("Anh Vinh");
//        test1.setOp4("Anh Tèo");
//        test1.setRightAnswer("Anh Ni");
//        test1.setTitle("Đây là bài test cho lesson 1");
//        testEditRepository.save(test1);
//
//        //add video test
//        VideoEdit videoEdit = new VideoEdit();
//        videoEdit.setVideoURL("youtube.com/easyLearnIT");
//        videoEdit.setName("Video bài 1");










    }
}
