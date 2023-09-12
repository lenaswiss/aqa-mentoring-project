package education.rxjava;

import java.util.Objects;

public class Client {

    String name;
    int sum;
    boolean isActive;

    public Client(String name, int sum, boolean isActive) {
        this.name = name;
        this.sum = sum;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return sum == client.sum && isActive == client.isActive && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sum, isActive);
    }

    @Override
    public String
    toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                ", isActive=" + isActive +
                '}';
    }
}
