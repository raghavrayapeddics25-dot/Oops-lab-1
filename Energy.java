abstract class Energy_source { 
    int source_id; 
    String source_name; // 'String' must be capitalized in Java
    int energy_generated; 

    // Constructor
    Energy_source(int source_id, String source_name, int energy_generated) {
        this.source_id = source_id; 
        this.source_name = source_name; 
        this.energy_generated = energy_generated; 
    } 

    // Corrected printing syntax and integrated efficiency calculation
    void display() {
        System.out.println("Source ID: " + source_id); 
        System.out.println("Source Name: " + source_name); 
        System.out.println("Energy Generated: " + energy_generated); 
        System.out.println("Efficiency: " + calc_efficiency() + "%");
        System.out.println("---------------------------");
    } 

    abstract double calc_efficiency(); 
} 

class solar_energy extends Energy_source { 
    // Added data types to constructor parameters
    solar_energy(int source_id, String source_name, int energy_generated) {
        super(source_id, source_name, energy_generated); 
    } 

    // Used 5000.0 to prevent integer division (which strips decimals)
    double calc_efficiency() {
        return ((double) energy_generated / 5000.0) * 100;
    }
} 

class wind_energy extends Energy_source { 
    // Added data types to constructor parameters
    wind_energy(int source_id, String source_name, int energy_generated) {
        super(source_id, source_name, energy_generated); 
    } 

    // Used 8000.0 to prevent integer division
    double calc_efficiency() {
        return ((double) energy_generated / 8000.0) * 100;
    }
} 

// The main class name cannot contain spaces and must use valid syntax
public class Energy { 
    public static void main(String[] args) { 
        // Correct reference declaration and added missing semicolons
        Energy_source source = new solar_energy(10, "sun", 1000); 
        source.display(); 

        source = new wind_energy(20, "wind", 2000); 
        source.display();
    }
}
