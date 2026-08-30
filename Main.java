public class Main {
    public static void main(String[] args) {
        estudiante e1 = new estudiante("Ana García", 1001, 16.5);
        estudiante e2 = new estudiante("Luis Torres", 1002, 14.0);
        estudiante e3 = new estudiante("Rosa Díaz",  1003, 18.0);
 
        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();
 
        System.out.println("Total estudiantes: " + estudiante.getTotalEstudiantes());
    }
}