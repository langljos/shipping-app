package edu.wctc.shipping.impl.SalesInputImpl;
import edu.wctc.shipping.iface.SalesInput;
import edu.wctc.shipping.impl.Sale;
import org.springframework.context.annotation.Bean;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleSalesInput implements SalesInput {
    private Scanner scanner = new Scanner(System.in);

    @Bean
    public List<Sale> getSales() {
        List<Sale> salesList = new ArrayList<>();
        String addAnother = "y";
        while (addAnother.equals("y")){
            salesList.add(addItem());

            while(true){
                System.out.println("Add another? Y/N");
                addAnother = scanner.nextLine().toLowerCase();

                if (addAnother.equals("y") || addAnother.equals("n")){
                    break;
                } else {
                    System.out.println("Please enter a valid response.");
                }
            }
        }
        return salesList;
    }

    private Sale addItem(){
        String customerName = getResponse("Enter Customer Name: ");
        String countryName = getResponse("Enter Country: ");
        Double saleAmount = handleDoubles("Sale");
        Double saleTax = handleDoubles("Tax");

        return new Sale(customerName, countryName, saleAmount, saleTax, 0);
    }

    private String getResponse(String prompt){
        String response = "";
        boolean passed = false;
        // loops until passed is true when a response is not blank
        while (true){
            if(!passed){
                System.out.print(prompt);
                try {
                    response = scanner.nextLine();
                    if (!response.equals("")){
                        passed = true;
                    } else {
                        System.out.println("Entries cannot be blank.");
                    }
                } catch (Exception e) {
//                    e.printStackTrace();
                    System.out.println("Please enter a valid response.");
                }
            } else {
                return response;
            }
        }
    }

    private double handleDoubles(String type){
        DecimalFormat decimalformat = new DecimalFormat("#.00");
        double response = 0.0;
        boolean passed = false;

        while(true){
            if(!passed){
                try {
                    response = Double.parseDouble(getResponse("Enter " + type + " Amount: "));
                    response = Double.parseDouble(decimalformat.format(response));
                    passed = true;
                } catch (NumberFormatException e) {
//                    System.out.println(e);
                    System.out.println("Please enter a valid number or decimal.");
                }
            } else {
                return response;
            }
        }
    }
}
