package br.ce.wcaquino.servicos;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;



public class AssertTest {

	
	@Test
	public void teste() {
		
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
	    Assert.assertEquals(1, 1);
	    
	    //QUANDO TRABALHAMOS COM DOBLE PRECISAMOS ADD MAIS UM PARAMETRO DE PRECISÃO
	    Assert.assertEquals(0.51, 0.51, 0.01);
	    
	    //COM ESSES EXEMPLOS DA ERRO
	    // Assert.assertEquals(0.51, 0.51);
	    //Assert.assertEquals(0.511, 0.512, 0.001);
	    
	    
	}
	
	
}
