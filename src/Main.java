//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WasteManagementChain wasteChain = new WasteManagementChain();

        // Simulate waste containers that need disposal
        WasteContainer organic    = new WasteContainer("organic", 90);
        WasteContainer recyclable = new WasteContainer("recyclable", 75);
        WasteContainer hazardous  = new WasteContainer("hazardous", 60);
        WasteContainer unknown    = new WasteContainer("general", 50);

        System.out.println("Waste Collection Process Started \n");

        wasteChain.collect(organic);
        System.out.println();

        wasteChain.collect(recyclable);
        System.out.println();

        wasteChain.collect(hazardous);
        System.out.println();

        wasteChain.collect(unknown);

    }
}