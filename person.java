import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


class Person {
  private String name;
  private int age;
  private String color;

Person () {
  name = "";
  age = 0;
  color = "";
}
	Person (String aName, int anAge, String aColor) 	{
		name = aName;
		age = anAge;
		color = aColor;
  }

  String getName() {
     return name;
  }
  int getAge() {
    return age;
  }

  String getColor() {
    return color;
  }


}
