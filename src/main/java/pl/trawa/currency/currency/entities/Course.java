package pl.trawa.currency.currency.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "table_data")
    private LocalDateTime tableData;

    @Column(name = "currency_name")
    private String currencyName;

    @Column(name = "currency_code")
    private String currencyCode;

    @Column(name = "currency_value")
    private double currencyValue;
}
