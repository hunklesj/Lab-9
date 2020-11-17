import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


  class Main {
  static ArrayList<Person> people;
  static String filename;
  static FileReader myFile;

public static void main(String[] args) {
Person person1 = new Person("Sam", 21, "Green");
Person person2 = new Person("Kellie", 36, "Yellow");
Person person3 = new Person("Brad", 45, "Blue");
Person person4 = new Person("Max", 21, "Orange");
Person person5 = new Person("Nick", 22, "Purple");

people = new ArrayList<Person>();
people.add(person1);
people.add(person2);
people.add(person3);
people.add(person4);
people.add(person5);

String name;
String age;
String color;

FileWriter toWriteFile;
try {
toWriteFile = new FileWriter("data.txt");
BufferedWriter output = new BufferedWriter(toWriteFile); 
for(int i=0; i<people.size(); i++) {
output.write(people.get(i).getName()); 
output.newLine();
output.write(Integer.toString(people.get(i).getAge())); 
output.newLine();
output.write(people.get(i).getColor()); 
output.newLine();
output.flush();
}
output.close();
  }
catch (IOException exception) {
System.out.println("An error occurred: " + exception);
}

try {
myFile = new FileReader("data.txt");
BufferedReader reader = new BufferedReader(myFile);
while (reader.ready()) {
name = reader.readLine();
age = reader.readLine();
color = reader.readLine();
System.out.printf("%-10s %-10s %-10s %n", name, age, color);
}
reader.close();
} 
catch (IOException exception) {
System.out.println("An error occurred: " + exception);

}
}
  }





