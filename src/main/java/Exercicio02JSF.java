import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "somas")
public class Exercicio02JSF {
	int num1;
	int num2;
	int soma;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}

	public String somar() {
		soma = num1 + num2;
		return ("output.xhtml");

	}
	public void limpar() {
		num1 = 0;
		num2 = 0;
	}
	public String voltar() {
		return ("input.xhtml");
	}
}
