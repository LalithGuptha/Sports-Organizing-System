package Players;

import java.io.IOException;

public interface Salary {
    final double BASIC_PAY = 2500;
    void calcSalary() throws IOException;
    void write() throws IOException;
}
