import static org.junit.Assert.*;

import org.junit.Test;
/*Paola Fuentes, Byron Mota
*/
public class TestArbol {
	/* Atributos*/
	public ArbolBinario<String> arbol = new ArbolBinario<String>();

	@Test
	public void testAgregarNodo() {

		if (arbol.agregarNodo("Hey!"))
			assertEquals(1, 1);
		else
			fail("error");

	}

	@Test
	public void testSearch() {
		arbol.agregarNodo("Hey!");
		if (arbol.search("Hey!")) {
			assertEquals(1, 1);

		} else {
			fail("error");
		}

	}

}