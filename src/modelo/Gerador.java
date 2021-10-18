package modelo;

import dados.FraseDois;
import dados.FraseQuatro;
import dados.FraseTres;
import dados.FraseUm;

public class Gerador {

    FraseUm fraseUm = new FraseUm();
    private final String[] parte1 = {
            fraseUm.getC0L0(), fraseUm.getC0L1(), fraseUm.getC0L2(), fraseUm.getC0L3(), fraseUm.getC0L4(),
            fraseUm.getC0L5(), fraseUm.getC0L6(), fraseUm.getC0L7(), fraseUm.getC0L8(), fraseUm.getC0L9(),
            fraseUm.getC0L10(), fraseUm.getC0L11(), fraseUm.getC0L12(), fraseUm.getC0L13(), fraseUm.getC0L14(),
            fraseUm.getC0L15(), fraseUm.getC0L16(), fraseUm.getC0L17(), fraseUm.getC0L18(), fraseUm.getC0L19(),
            fraseUm.getC0L20(), fraseUm.getC0L21(), fraseUm.getC0L22(), fraseUm.getC0L23(), fraseUm.getC0L24(),
            fraseUm.getC0L25(), fraseUm.getC0L26(), fraseUm.getC0L27(), fraseUm.getC0L28(), fraseUm.getC0L29(),
            fraseUm.getC0L30(), fraseUm.getC0L31(), fraseUm.getC0L32(), fraseUm.getC0L33(), fraseUm.getC0L34(),
            fraseUm.getC0L35(), fraseUm.getC0L36(), fraseUm.getC0L37(), fraseUm.getC0L38(), fraseUm.getC0L39(),
    };
    FraseDois fraseDois = new FraseDois();
    private final String[] parte2 = {
            fraseDois.getC1L0(), fraseDois.getC1L1(), fraseDois.getC1L2(), fraseDois.getC1L3(), fraseDois.getC1L4(),
            fraseDois.getC1L5(), fraseDois.getC1L6(), fraseDois.getC1L7(), fraseDois.getC1L8(), fraseDois.getC1L9(),
            fraseDois.getC1L10(), fraseDois.getC1L11(), fraseDois.getC1L12(), fraseDois.getC1L13(), fraseDois.getC1L14(),
            fraseDois.getC1L15(), fraseDois.getC1L16(), fraseDois.getC1L17(), fraseDois.getC1L18(), fraseDois.getC1L19(),
            fraseDois.getC1L20(), fraseDois.getC1L21(), fraseDois.getC1L22(), fraseDois.getC1L23(), fraseDois.getC1L24(),
            fraseDois.getC1L25(), fraseDois.getC1L26(), fraseDois.getC1L27(), fraseDois.getC1L28(), fraseDois.getC1L29(),
            fraseDois.getC1L30(), fraseDois.getC1L31(), fraseDois.getC1L32(), fraseDois.getC1L33(), fraseDois.getC1L34(),
            fraseDois.getC1L35(), fraseDois.getC1L36(), fraseDois.getC1L37(), fraseDois.getC1L38(), fraseDois.getC1L39()
    };
    FraseTres fraseTres = new FraseTres();
    FraseQuatro fraseQuatro = new FraseQuatro();
    private String[] parte3 = {
            fraseTres.getC2L0(), fraseTres.getC2L1(), fraseTres.getC2L2(), fraseTres.getC2L3(), fraseTres.getC2L4(),
            fraseTres.getC2L5(), fraseTres.getC2L6(), fraseTres.getC2L7(), fraseTres.getC2L8(), fraseTres.getC2L9(),
            fraseTres.getC2L10(), fraseTres.getC2L11(), fraseTres.getC2L12(), fraseTres.getC2L13(), fraseTres.getC2L14(),
            fraseTres.getC2L15(), fraseTres.getC2L16(), fraseTres.getC2L17(), fraseTres.getC2L18(), fraseTres.getC2L19(),
            fraseTres.getC2L20(), fraseTres.getC2L21(), fraseTres.getC2L22(), fraseTres.getC2L23(), fraseTres.getC2L24(),
            fraseTres.getC2L25(), fraseTres.getC2L26(), fraseTres.getC2L27(), fraseTres.getC2L28(), fraseTres.getC2L29(),
            fraseTres.getC2L30(), fraseTres.getC2L31(), fraseTres.getC2L32(), fraseTres.getC2L33(), fraseTres.getC2L34(),
            fraseTres.getC2L35(), fraseTres.getC2L36(), fraseTres.getC2L37(), fraseTres.getC2L38(), fraseTres.getC2L39()
    };
    private String[] parte4 = {fraseQuatro.getC3L0(), fraseQuatro.getC3L1(), fraseQuatro.getC3L2(), fraseQuatro.getC3L3(), fraseQuatro.getC3L4(),
            fraseQuatro.getC3L5(), fraseQuatro.getC3L6(), fraseQuatro.getC3L7(), fraseQuatro.getC3L8(), fraseQuatro.getC3L9(),
            fraseQuatro.getC3L10(), fraseQuatro.getC3L11(), fraseQuatro.getC3L12(), fraseQuatro.getC3L13(), fraseQuatro.getC3L14(),
            fraseQuatro.getC3L15(), fraseQuatro.getC3L16(), fraseQuatro.getC3L17(), fraseQuatro.getC3L18(), fraseQuatro.getC3L19(),
            fraseQuatro.getC3L20(), fraseQuatro.getC3L21(), fraseQuatro.getC3L22(), fraseQuatro.getC3L23(), fraseQuatro.getC3L24(),
            fraseQuatro.getC3L25(), fraseQuatro.getC3L26(), fraseQuatro.getC3L27(), fraseQuatro.getC3L28(), fraseQuatro.getC3L29(),
            fraseQuatro.getC3L30(), fraseQuatro.getC3L31(), fraseQuatro.getC3L32(), fraseQuatro.getC3L33(), fraseQuatro.getC3L34(),
            fraseQuatro.getC3L35(), fraseQuatro.getC3L36(), fraseQuatro.getC3L37(), fraseQuatro.getC3L38(), fraseQuatro.getC3L39()
    };

    public Gerador() {
    }

    public String gerarFrase() {
        int randomFraseUm = 0;
        int randomFraseDois = 0;
        int randomFraseTres = 0;
        int randomFraseQuatro = 0;

        for (int i = 0; i < 40; i++) {
            randomFraseUm = 1 + (int) (Math.random() * (parte1.length - 1));
            randomFraseDois = 1 + (int) (Math.random() * (parte2.length - 1));
            randomFraseTres = 1 + (int) (Math.random() * (parte3.length - 1));
            randomFraseQuatro = 1 + (int) (Math.random() * (parte4.length - 1));


        }
        return (parte1[randomFraseUm] + ", " + parte2[randomFraseDois] + ", "
                + parte3[randomFraseTres] + ", " + parte4[randomFraseQuatro]);

    }

}