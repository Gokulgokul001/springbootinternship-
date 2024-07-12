package spring.boot_poc_curd;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class Rtbasics {
    private int[] id={10,20,30,40,50};
    @GetMapping("/get")
    public int[] getId() {
        return id;
    }

    @GetMapping("/go/{index}")
    public int getid_per(@PathVariable("index") int index){
        return id[index];
    }

    @DeleteMapping("/del/{index}")
    public int del(@PathVariable("index") int index){
        int[] id={10,20,30,40,50};
        int rest =index;
        int new_=id[index]= 0;
        System.out.println("the value is :"+ Arrays.toString(id));
        return rest;
    }
}

