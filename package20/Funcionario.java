package package20;

public class Funcionario {
double CargaHoraria;
double Salario;
public Funcionario(double cargaHoraria, double salario) {
	super();
	setCargaHoraria(cargaHoraria);
	setSalario(salario);
}
public double getCargaHoraria() {
	return CargaHoraria;
}
public void setCargaHoraria(double cargaHoraria) {
	CargaHoraria = cargaHoraria;
}
public double getSalario() {
	return Salario;
}
public void setSalario(double salario) {
	Salario = salario;
}
}
