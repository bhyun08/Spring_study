package com.example.gs.service;

import com.example.gs.Student;
import com.example.gs.dto.StudentRespone;
import com.example.gs.repository.StudentRepository;
import com.example.gs.dto.StudentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public void sign(StudentRequest request) {
        studentRepository.save(new Student(request.getName(), request.getAge())); //name과 age를 db에 저장
    }

    @Transactional
    public void update(StudentRequest request, int studentId) {
        Student student = studentRepository.findById(studentId).orElseThrow(RuntimeException::new); //id를 조회해서 만약 찾는 id값이 없다면 런타임에러를 발생시키고, 존재한다면 id를 통해 값을 찾는다
        student.update(request.getName(), request.getAge());
    }

    public void delete(StudentRequest request, int studentId) {
        Student student = studentRepository.findById(studentId).orElseThrow(RuntimeException::new);
        studentRepository.delete(student);
    }

    public StudentRespone read(int studentId) {
        Student student = studentRepository.findById(studentId).orElseThrow(RuntimeException::new);
        return new StudentRespone( // id로 조회한 학생의 id,name,age를 get한다
                student.getId(),
                student.getName(),
                student.getAge()
        );
    }
}
