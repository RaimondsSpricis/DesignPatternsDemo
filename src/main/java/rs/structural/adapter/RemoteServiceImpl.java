package rs.structural.adapter;

import java.util.List;

public class RemoteServiceImpl {

    public List<RemoteStudent> getAllStudents() {
        return List.of(
                new RemoteStudent("John", "Smith", "john.smith@abc.com"),
                new RemoteStudent("Jane", "Eastwood", "jane.eastwood@qwerty.com")
        );
    }
}
