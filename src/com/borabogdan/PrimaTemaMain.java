package com.borabogdan;

import static com.borabogdan.PrintColor.ANSI_RESET;
import static com.borabogdan.PrintColor.ANSI_YELLOW;

public class PrimaTemaMain {
    public static void main(String[] args) {
        Om primulOm = new Om(1.8, "Vasile", new Buletin());
        System.out.println(primulOm);
        Buletin buletin = new Buletin();
        buletin.setCnp(255875351245L);
        buletin.setAdresa("acasa");
        primulOm = new Om(1.7, "Ion", buletin);
        System.out.println(primulOm + "\n");

        Om primulCopil = new Copil(50, 1.4, "Alex", new Buletin());
        // nu pot apela .setGreutate() din interiorul clasei Copil, pot apela doar metodele din clasa Om
        System.out.println(primulCopil);
        Copil altCopil = new Copil(40, 1.5, "Cristi", new Buletin());
        altCopil.setGreutate(60);
        System.out.println(altCopil);

        Buletin buletin1 = new Buletin();
        buletin1.setAdresa("brasov");
        buletin1.setCnp(2001105110088L);
        primulCopil.setNume("Alexandra");
        primulCopil.setBuletin(buletin1);
        System.out.println(primulCopil);
        System.out.println(ANSI_YELLOW + primulOm.getBuletin());
        System.out.println(ANSI_RESET + "altCopil are inaltimea de(m): " + altCopil.getInaltime());

    }
}
