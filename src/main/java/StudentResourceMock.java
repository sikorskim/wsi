import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@Path("Students")
public class StudentResourceMock {

/*
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public List<Student> getAllStudents()
            public Student test()
    {
        System.out.println("dupa1");
        return null;
    }
*/

    @GET
    @Produces("text/plain")
    public String getHello()
    {
            return "Hello World!";
    }

    @GET
    @Path("{index}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Student getStudent(@PathParam("index") int index)
    {
        Student student01 = new Student();
        student01.setFirstName("Jan");
        student01.setLastName("Kowalski");
        student01.setIndexNumber("PZ0123456");
        return student01;
    }

    @POST
    @Path("Add")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response addStudent(Student student)
    {
        System.out.println(student.getFirstName());
        return Response.ok().build();
    }



//    @POST
//    @Path("commands")
//    public String processCommand(String command) {
//        if (command == null || command.isEmpty()) {
//            throw new BadRequestException("No command specified.");
//        }
//
//        if ("disconnect".equals(command)) {
//            broadcaster.closeAll();
//            return "Disconnected.";
//        } else if (command.length() > "reconnect ".length() && command.startsWith("reconnect ")) {
//            final String when = command.substring("reconnect ".length());
//            try {
//                reconnectDelay = "now".equals(when) ? 0 : Long.parseLong(when);
//                return "Reconnect strategy updated: " + when;
//            } catch (NumberFormatException ignore) {
//                // ignored
//            }
//        }
//
//        throw new BadRequestException("Command not recognized: '" + command + "'");
//    }

}