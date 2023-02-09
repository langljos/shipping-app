package edu.wctc.shipping.impl.SalesInputImpl;
import edu.wctc.shipping.iface.SalesInput;
import edu.wctc.shipping.impl.Sale;
import org.springframework.context.annotation.Bean;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSalesInput implements SalesInput {

    @Bean
    public List<Sale> getSales() {
        List<Sale> salesList = new ArrayList<>();
        Sale salesItem;
        try{
            Path salesFile = Paths.get("sales.txt").toAbsolutePath();
            Scanner scanner = new Scanner(salesFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
            String[] saleItem = line.split(",");
                salesItem = new Sale(saleItem[0], saleItem[1], Double.parseDouble(saleItem[2]), Double.parseDouble(saleItem[3]), 0);
                salesList.add(salesItem);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return salesList;
    }
}
