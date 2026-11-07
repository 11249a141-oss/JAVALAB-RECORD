Experiment 4: User-Defined Packages
Program 4a: Package hospital.details and Import
Aim: To create a user-defined package and use its class in another program.
Scenario: A hospital keeps patient information in a package named hospital.details.
Program:
// File: Project/hospital/details/Patient.java
package hospital.details;
 
public class Patient {
    public void displayDetails() {
        System.out.println("Patient Name: Sneha");
        System.out.println("Age: 34");
        System.out.println("Ward: General");
    }
}
 
// File: Project/HospitalMain.java
import hospital.details.Patient;
 
public class HospitalMain {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.displayDetails();
    }
}
 
// Commands (run inside Project folder)
// javac -d . hospital/details/Patient.java
// javac HospitalMain.java
// java HospitalMain
Sample Output:
Patient Name: Sneha
Age: 34
Ward: General
Result: The package was created, compiled and imported successfully, and the method output was displayed.
Program 4b: Package tools and Filter Class
Aim: To create a package tools and import its class to apply a filter.
Scenario: A photo editor applies filters from a separate tools package.
Program:
// File: Project/tools/Filter.java
package tools;
 
public class Filter {
    public void applyFilter(String filterName) {
        System.out.println(filterName + " filter applied successfully.");
    }
}
 
// File: Project/PhotoEditor.java
import tools.Filter;
 
public class PhotoEditor {
    public static void main(String[] args) {
        Filter f = new Filter();
        f.applyFilter("Sepia");
    }
}
 
// Commands (run inside Project folder)
// javac -d . tools/Filter.java
// javac PhotoEditor.java
// java PhotoEditor
Sample Output:
Sepia filter applied successfully.
Result: The user-defined package was used successfully from another program through import.
