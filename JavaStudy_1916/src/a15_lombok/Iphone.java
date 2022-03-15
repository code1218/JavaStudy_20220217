package a15_lombok;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Iphone {
	private int series;
	private String model;
	private String color;
	private int memorySize;
	private int releaseYear;
	
}
