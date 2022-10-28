package rs.structural.adapter;

import java.util.List;

public class RemoteServiceAdapter implements LocalService {
    private RemoteServiceImpl service;

    public RemoteServiceAdapter(RemoteServiceImpl service) {
        this.service = service;
    }

    @Override
    public List<Student> getAllStudents() {
        var results = service.getAllStudents();
        return results.stream()
                .map(s -> new Student(s.firstName() + " " + s.surname(), s.email()))
                .toList();
    }
}
