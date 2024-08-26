package epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapImpl {
    public static void main(String[] args) {
        List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
        List<String>  productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");
        List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
        List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");
        List<List<String>> allproducts = new ArrayList<>();
        allproducts.add(productlist1);
        allproducts.add(productlist2);
        allproducts.add(productlist3);
        allproducts.add(productlist4);
        List<String> string=allproducts.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(string.size());
    }
}
