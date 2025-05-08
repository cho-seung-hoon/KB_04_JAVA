package ch17.sec04.exam01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {
    private int pno;
    private String name;
    private String company;
    private int price;
}
