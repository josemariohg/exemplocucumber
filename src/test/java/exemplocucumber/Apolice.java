package exemplocucumber;

import java.util.List;
import java.util.Map;

public class Apolice {

	private String codigo;

	private List<Map<String, String>> coberturas;

	public Apolice(String codigo, List<Map<String, String>> coberturas) {
		this.codigo = codigo;
		this.coberturas = coberturas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Map<String, String>> getCoberturas() {
		return coberturas;
	}

	public void setCoberturas(List<Map<String, String>> coberturas) {
		this.coberturas = coberturas;
	}

}
