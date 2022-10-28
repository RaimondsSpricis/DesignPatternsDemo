package rs.structural.adapter;

import java.util.List;

public class LocalServiceImpl implements LocalService {

    @Override
    public List<Student> getAllStudents() {
        return List.of(
                new Student("Janett Fox", "janett.fox@qwerty.com"),
                new Student("Jane Wolf", "jane.wolf@ytrewq.com"),
                new Student("Jennifer Thornton", "jennifer.thornton@dsa.com")
        );
    }
}
