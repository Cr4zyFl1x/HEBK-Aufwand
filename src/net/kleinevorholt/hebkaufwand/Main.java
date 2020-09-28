package net.kleinevorholt.hebkaufwand;

class Main {
    public static void main(String[] args) {

    }


    public void aufgabe3a(int pAnzahl){

        int anw = 1;
        int ver = 0;

        System.out.println(pAnzahl);
        anw++; // ^

        anw += 2; // int i i=0
        for(int i=0;i<=pAnzahl;i++){
            System.out.println("Das ist super toll wunderbar");
            String k = "blavl";
            anw += 3; // i++ & println & String k
            ver++; // i < pAnzahl
        }
        ver++; // Abbruchvergleich

        anw += 2; // int i i=0
        for(int i=0;i<=pAnzahl;i++){
            System.out.println("Das ist super toll wunderbar");
            String k = "blavl";
            anw += 3; // i++ & println & String k
            ver++; // i < pAnzahl
        }
        ver++; // Abbruchvergleich

        System.out.println("Anweisungen: " + anw);
        System.out.println("Vergleiche: " + ver);
    }



    public void aufgabe3b(int pAnzahl){

        int anw = 1;
        int ver = 0;

        System.out.println(pAnzahl);
        anw++;

        anw += 2;
        for(int i=0;i<=pAnzahl;i++){
            ver++;
            System.out.println("Das ist super toll wunderbar");
            String k = "blavl";
            anw +=3;

            anw += 2;
            for(int j=0;j<=pAnzahl;j++){
                ver++;
                System.out.println("Das ist super toll wunderbar");
                String k2 = "blavl";
                anw +=3;
            }
            ver++;
        }
        ver++;

        System.out.println("Anweisungen: " + anw);
        System.out.println("Vergleiche: " + ver);

    }


    public void aufgabe3c(int[] pZusortieren) {

        int anw = 1;
        int ver = 0;

        int temp;
        anw++;

        anw +=2;
        for(int i=1; i<pZusortieren.length; i++) {
            ver++;
            anw +=2;
            for(int j=0; j<pZusortieren.length-i; j++) {
                ver++;
                anw++;
                if(pZusortieren[j]>pZusortieren[j+1]) {
                    temp=pZusortieren[j];
                    pZusortieren[j]=pZusortieren[j+1];
                    pZusortieren[j+1]=temp;
                    anw+=3;
                }
                ver++;

            }
            ver++;
        }
        ver++;

        System.out.println("Anweisungen: " + anw);
        System.out.println("Vergleiche: " + ver);
    }
}