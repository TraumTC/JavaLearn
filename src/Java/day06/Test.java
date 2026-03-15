package Java.day06;

public class Test {
    static void main(String[] args) {
        Factory factory = new Factory();
        EquipmentA a = new EquipmentA();
        EquipmentB b = new EquipmentB();
        factory.setEquipment(b);
        factory.work();
    }
}
