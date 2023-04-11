package OOP2;
public class ServiceStation {
    public void check(Transport transport) {
        transport.service();
    }

    public void check(Car car) {
        car.service();
    }
}
