public class Demenagement {

        void setup()
         {
//            int size (400, 400);
//            {
                demenagement();
            }

        int cartons_anciens_locaux=34, cartons_nouveau_locaux=0, cartons_convoyer=0;
        int tas1=0, tas2=0, tas3=0, tas4=0;

        void charger_camion()
        {
            while ((cartons_anciens_locaux > 0) && (cartons_convoyer <9)) {
                // Ajouter catron dans camion
                cartons_anciens_locaux--;
                cartons_convoyer++;
            }
        }
        void demenagement()
        {
            // Tant que il reste des carton dans les aciens locaux
            while (cartons_anciens_locaux>0)
            {
                charger_camion();
                System.out.println("Camion A-> B");
                decharger_camion();
            }
        }

        void decharger_camion()
        {
            while ((cartons_convoyer > 0) && (cartons_nouveau_locaux<=34)) {
                cartons_convoyer--;
                cartons_nouveau_locaux++;
                int poidscarton= 1 + (int)(Math.random() * ((8 - 1) + 1));
                tripoids(poidscarton);
            }
        }

        void tripoids(float poidscarton)
        {
            if (poidscarton<=1){
                tas1+=1;
                System.out.print(" On ajoute un colis au tas 1 sa nouvelle valeur est : ");
                System.out. println(tas1);
            }

            else if (poidscarton>1 && poidscarton<=3){
                tas2+=1;
                System.out.print(" On ajoute un colis au tas 2 sa nouvelle valeur est : ");
                System.out.println(tas2);
            }

            else if (poidscarton>3 && poidscarton<=5){
                tas3+=1;
                System.out.print(" On ajoute un colis au tas 3 sa nouvelle valeur est : ");
                System.out.println(tas3);
            }

            else {
                tas4+=1;
                System.out.print(" On ajoute un colis au tas 4 sa nouvelle valeur est : ");
                System.out.println(tas4);
            }
        }
    }
