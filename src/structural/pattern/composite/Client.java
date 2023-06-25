package structural.pattern.composite;

public class Client {
    public static void main(String[] args) {
        Composite computer = new Composite("PC");

        Equipment cpu = new Equipment("CPU", 1000);
        Equipment hardDrive = new Equipment("Hard Drive", 250);

        Composite memory = new Composite("Memory");
        Equipment rom = new Equipment("Read Only Memory", 75);
        Equipment ram = new Equipment("Random Access Memory", 100);

        memory.add(rom).add(ram);
        computer.add(cpu).add(hardDrive).add(memory);

        System.out.println("PC Price: " + computer.getPrice());
    }
}
