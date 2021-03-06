package br.ce.wcaquino.servicos;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.servicos.LocacaoService;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {
	
	@Test
	public void testeLocacoService() {
		
		 //cen?rio
			LocacaoService service = new LocacaoService();
			Usuario usurio = new Usuario("Serjao");
			Filme filme = new Filme("Filme-01", 1 ,  5.0 );
		
		//A??o	
			Locacao locacao =	service.alugarFilme(usurio, filme);
			
		//Valida??o		
			Assert.assertTrue(locacao.getValor() == 5.0);
			Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
			Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
					
		}

}
