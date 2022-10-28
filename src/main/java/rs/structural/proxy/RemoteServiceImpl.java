package rs.structural.proxy;

import rs.structural.adapter.RemoteStudent;

import java.util.List;

public class RemoteServiceImpl implements RemoteService {

    @Override
    public List<Developer> getAllDevelopers() {
        return List.of(
                new Developer("Foo", "Bar", 32),
                new Developer("Adam", "Savage", 55)
        );
    }
}
