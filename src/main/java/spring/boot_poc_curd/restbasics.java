package spring.boot_poc_curd;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Arrays;
public class restbasics {
    int[] balance = {20000, 5000, 7000, 6000, 3000, 7000, 3000, 9000, 4000, 2000};

    @GetMapping("/details")
    public int[] customer_details() {
        System.out.println("The get method is working");
        return balance;
    }

    @GetMapping("/det/{index}")
    public int get_balance(@PathVariable("index") int index){
        return balance[index];
    }


    @PutMapping("/grow/{position}")
    public String  Customer_checking(@PathVariable("position") int position) {

        if (balance[position]<5000 && balance[position]>=8000) {
            System.out.println("Bank balance :"+ Arrays.toString(balance));
            float percentage= (float)  3/100;
            System.out.println(percentage);
            float cal=(balance[position]*percentage);
            System.out.println(cal);
            balance[position]= balance[position]-(int)cal;
            System.out.println("the position "+position+" is updated,where it have the amount of below 10000 "+"["+balance[position]+"]");
        }
        else if(balance[position]<1000 && balance[position]>=3000){
            System.out.println("Bank balance :"+Arrays.toString(balance));
            float percentage= (float) 5/100;
            System.out.println(percentage);
            float cal=(balance[position]*percentage);
            System.out.println(cal);
            balance[position]= balance[position]-(int)cal;
            System.out.println("the position "+position+" is updated is updated,where it have the amount of below 5000 :"+"["+balance[position]+"]");
        }
        else {
            return "The index values that you choose,That have amount greater than 20,000";
        }
        return "gorw operation is successfully";
    }


}

