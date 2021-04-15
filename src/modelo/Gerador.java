package modelo;

import dados.Frase1;
import dados.Frase2;
import dados.Frase3;
import dados.Frase4;

public class Gerador {
	
public Gerador() {
		
	}

	private String[] parte1 = { Frase1.getC0L0(), Frase1.getC0L1(), Frase1.getC0L2(), Frase1.getC0L3(), Frase1.getC0L4(), 
								Frase1.getC0L5(), Frase1.getC0L6(), Frase1.getC0L7(), Frase1.getC0L8(), Frase1.getC0L9(),
								Frase1.getC0L10(), Frase1.getC0L11(), Frase1.getC0L12(), Frase1.getC0L13(), Frase1.getC0L14(),
								Frase1.getC0L15(), Frase1.getC0L16(), Frase1.getC0L17(), Frase1.getC0L18(), Frase1.getC0L19(),
								Frase1.getC0L20(), Frase1.getC0L21(), Frase1.getC0L22(), Frase1.getC0L23(), Frase1.getC0L24(),
								Frase1.getC0L25(), Frase1.getC0L26(), Frase1.getC0L27(), Frase1.getC0L28(), Frase1.getC0L29(),
								Frase1.getC0L30(), Frase1.getC0L31(), Frase1.getC0L32(), Frase1.getC0L33(), Frase1.getC0L34(),
								Frase1.getC0L35(), Frase1.getC0L36(), Frase1.getC0L37(), Frase1.getC0L38(), Frase1.getC0L39(),
								};

	private String[] parte2 = { Frase2.getC1L0(), Frase2.getC1L1(), Frase2.getC1L2(), Frase2.getC1L3(), Frase2.getC1L4(), 
								Frase2.getC1L5(), Frase2.getC1L6(), Frase2.getC1L7(), Frase2.getC1L8(), Frase2.getC1L9(), 
								Frase2.getC1L10(), Frase2.getC1L11(), Frase2.getC1L12(), Frase2.getC1L13(), Frase2.getC1L14(),
								Frase2.getC1L15(), Frase2.getC1L16(), Frase2.getC1L17(), Frase2.getC1L18(), Frase2.getC1L19(),
								Frase2.getC1L20(), Frase2.getC1L21(), Frase2.getC1L22(), Frase2.getC1L23(), Frase2.getC1L24(), 
								Frase2.getC1L25(), Frase2.getC1L26(), Frase2.getC1L27(), Frase2.getC1L28(), Frase2.getC1L29(),
								Frase2.getC1L30(), Frase2.getC1L31(), Frase2.getC1L32(), Frase2.getC1L33(), Frase2.getC1L34(), 
								Frase2.getC1L35(), Frase2.getC1L36(), Frase2.getC1L37(), Frase2.getC1L38(), Frase2.getC1L39()
								};

	private String[] parte3 = { Frase3.getC2L0(), Frase3.getC2L1(), Frase3.getC2L2(), Frase3.getC2L3(), Frase3.getC2L4(),
								Frase3.getC2L5(), Frase3.getC2L6(), Frase3.getC2L7(), Frase3.getC2L8(), Frase3.getC2L9(),
								Frase3.getC2L10(), Frase3.getC2L11(), Frase3.getC2L12(), Frase3.getC2L13(), Frase3.getC2L14(),
								Frase3.getC2L15(), Frase3.getC2L16(), Frase3.getC2L17(), Frase3.getC2L18(), Frase3.getC2L19(),
								Frase3.getC2L20(), Frase3.getC2L21(), Frase3.getC2L22(), Frase3.getC2L23(), Frase3.getC2L24(),
								Frase3.getC2L25(), Frase3.getC2L26(), Frase3.getC2L27(), Frase3.getC2L28(), Frase3.getC2L29(),
								Frase3.getC2L30(), Frase3.getC2L31(), Frase3.getC2L32(), Frase3.getC2L33(), Frase3.getC2L34(),
								Frase3.getC2L35(), Frase3.getC2L36(), Frase3.getC2L37(), Frase3.getC2L38(), Frase3.getC2L39()
								};

	private String[] parte4 = { Frase4.getC3L0(), Frase4.getC3L1(), Frase4.getC3L2(), Frase4.getC3L3(), Frase4.getC3L4(),
								Frase4.getC3L5(), Frase4.getC3L6(), Frase4.getC3L7(), Frase4.getC3L8(), Frase4.getC3L9(),
								Frase4.getC3L10(), Frase4.getC3L11(), Frase4.getC3L12(), Frase4.getC3L13(), Frase4.getC3L14(),
								Frase4.getC3L15(), Frase4.getC3L16(), Frase4.getC3L17(), Frase4.getC3L18(), Frase4.getC3L19(),
								Frase4.getC3L20(), Frase4.getC3L21(), Frase4.getC3L22(), Frase4.getC3L23(), Frase4.getC3L24(),
								Frase4.getC3L25(), Frase4.getC3L26(), Frase4.getC3L27(), Frase4.getC3L28(), Frase4.getC3L29(),
								Frase4.getC3L30(), Frase4.getC3L31(), Frase4.getC3L32(), Frase4.getC3L33(), Frase4.getC3L34(),
								Frase4.getC3L35(), Frase4.getC3L36(), Frase4.getC3L37(), Frase4.getC3L38(), Frase4.getC3L39()
								};

	public String gerarFrase() {
		int randomFrase1 = 0;
		int randomFrase2 = 0;
		int randomFrase3 = 0;
		int randomFrase4 = 0;

		for (int i = 0; i < 40; i++) {
			randomFrase1 = 1 + (int) (Math.random() * (parte1.length - 1));
			randomFrase2 = 1 + (int) (Math.random() * (parte2.length - 1));
			randomFrase3 = 1 + (int) (Math.random() * (parte3.length - 1));
			randomFrase4 = 1 + (int) (Math.random() * (parte4.length - 1));

			
		}
		return (parte1[randomFrase1] + ", " + parte2[randomFrase2] + ", " 
				+ parte3[randomFrase3] + ", " + parte4[randomFrase4]);
		
	}

}