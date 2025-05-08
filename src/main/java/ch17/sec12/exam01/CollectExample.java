package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList< >();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        List<Student> studentList = new ArrayList< >();
        for (Student student : totalList) {
            if (student.getSex().equals("남")) {
                studentList.add(student);
            }
        }

        List<Student> maleList = totalList.stream()
                .filter(s->s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(s->{
                    System.out.println(s.getName());
                });

        maleList.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        //성적으로 내림차순하고 상위 두명을 추출해보세요
        List<Student> scoreList = totalList.stream()
                .sorted((a, b) -> Integer.compare(b.getScore(), a.getScore()))
                .limit(2)
                .toList();

        scoreList.forEach(System.out::println);

        Map<String, Integer> map = totalList.stream()
                .collect(Collectors.toMap(Student::getName, Student::getScore));
        System.out.println(map);
    }
}
