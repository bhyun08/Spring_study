package com.example.gs;

import com.example.gs.dto.StudentRequest;
import com.example.gs.dto.StudentRespone;
import com.example.gs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor //생성자가 필요한 부분에만 생성자를 주입
public class StudentController {

    private final StudentService studentService; //StudentService 객체를 불러와서 studentService 라는 이름의 변수 선언


    @PostMapping("/sign") //PostMapping 으로 sign 이라는 uri 를 통해 student 생성
    public void sign(@RequestBody StudentRequest request) { //sign 이라는 메서드를 통해 json형식으로 StudentRequest객체의 값을 request로 전달
        studentService.sign(request); //Service클래스에서 sign메서드 호출하여 request를 매개변수로 전달
    }

    @PatchMapping("/{student-id}") //PatchMapping으로 uri에 들어오는 값을 Patch메서드로 실행
    public void update(@RequestBody StudentRequest request, @PathVariable("student-id") int studentId) { //PathVariable 어노테이션을 통해 uri값을 int형 변수 studentId에 전달
        studentService.update(request, studentId); //Service클래스에서 update메서드 호출하여 request,studnetId를 매개변수로 전달
    }

    @DeleteMapping("/{student-id}")
    public void delete(@RequestBody StudentRequest request, @PathVariable("student-id") int studentId) {
        studentService.delete(request, studentId); //Service클래스에서 delete메서드 호출하여 request,studnetId를 매개변수로 전달
    }

    @GetMapping("/{student-id}")
    public StudentRespone get(@PathVariable("student-id") int studentId) {
        return studentService.read(studentId); //Service클래스에서 read메서드에 studentId를 매개변수로 호출하여 반환받은 값을 리턴
    }
}
