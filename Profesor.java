public class Profesor extends Persona {
    private String area;
    private double salarioBase;
    private int horasCatedra;

    public Profesor(String nombre, int edad, String documento,
                    String area, double salarioBase, int horasCatedra) {
        super(nombre, edad, documento);
        this.area = area;
        this.salarioBase = salarioBase;
        this.horasCatedra = horasCatedra;
    }

    public double calcularSalario() {
        return salarioBase * horasCatedra;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: " + getRol());
        System.out.println("Area: " + area);
        System.out.println("Salario base por hora: " + salarioBase);
        System.out.println("Horas catedra: " + horasCatedra);
        System.out.println("Salario total: " + calcularSalario());
    }

    @Override
    public String getRol() {
        return "Profesor";
    }
}
