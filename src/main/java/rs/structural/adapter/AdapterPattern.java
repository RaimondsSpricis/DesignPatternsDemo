package rs.structural.adapter;

public class AdapterPattern {

    public static void run() {
        System.out.println("=== Adapter Pattern ===");
        var localService = new LocalServiceImpl();
        var remoteService = new RemoteServiceImpl();
        var adapter = new RemoteServiceAdapter(remoteService);
        var localResults = localService.getAllStudents();
        System.out.println("Local service students:");
        for (var x : localResults)
            System.out.println(x);
        var remoteResults = adapter.getAllStudents();
        System.out.println("Remote service students:");
        for (var x : remoteResults)
            System.out.println(x);
        System.out.println();
    }
}
