package exemplocucumber;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ApoliceTestePassos {

	private Apolice apolice;
	private int coberturas;
	private double premios;

	@Dado("^que as coberturas sao da \"(.*?)\"$")
	public void que_as_coberturas_sao_da(String nome, DataTable table) throws Throwable {

		List<Map<String, String>> rows = table.asMaps(String.class, String.class);

		// Definição do apolice e associando as coberturas
		apolice = new Apolice(nome, rows);

	}

	@Dado("^o calculo do total de coberturas criadas$")
	public void o_calculo_do_total_de_coberturas_criadas() throws Throwable {
		coberturas = apolice.getCoberturas().size();
	}

	@Entao("^o total de coberturas e de (\\d+)$")
	public void o_total_de_coberturas_e_de(int totalCoberturas) throws Throwable {
		assertEquals("O cálculo do total de coberturas está incorreto", totalCoberturas, coberturas);
	}

	@Dado("^o calculo do total de premio$")
	public void o_calculo_do_total_de_premio() throws Throwable {

		Iterator<Map<String, String>> itens = apolice.getCoberturas().iterator();
		
		while (itens.hasNext())
			premios += Double.parseDouble(itens.next().get("premio"));

	}

	@Entao("^o total de premio na apolice e de (.+)$")
	public void o_total_de_premio_na_apolice_e_de(double totalPremio) throws Throwable {
		assertEquals("O cálculo do total de premio na apolice " + apolice.getCodigo() + " encontra-se errado.",
				totalPremio, premios, 0.001);

	}

}
