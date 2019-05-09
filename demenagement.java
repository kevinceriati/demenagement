/* SITUATION 1  //<>//


 int nombreCarton=34;

 int[] nombreColisDansBureau = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
 int[] cartonMax = { 3, 4, 2, 1, 3, 2, 5, 2, 2, 1, 1, 3, 3, 3, 4 };


 void setup() {
 remplirBureau();
 }

 void remplirBureau() {
 // espaceDisponible[0] = 3
 int bureauCourrant = 0;
 while(nombreCarton > 0){
 // Si le bureau est plein
 if(cartonMax[bureauCourrant] == nombreColisDansBureau[bureauCourrant]){
 bureauCourrant++;
 }
 nombreCarton--;
 nombreColisDansBureau[bureauCourrant] += 1;
 }
 }






 /* nombreCarton = 33;
 nombreColisDansBureau[0] += 1;

 nombreCarton = 32;
 nombreColisDansBureau[0] =2;

 nombreCarton = 31;
 nombreColisDansBureau[0] =3;

 nombreCarton = 30;
 nombreColisDansBureau[0] =1;

 println(espaceDisponible);*/


//int[] values = {1,2,3,4,5,6,7,8};

//for(int i = 0;i<8;i++){
// values[i] = values[i] * 2;
//}


//SITUATION 2

int nombreCarton=34;

        int[] nombreColisDansBureau = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] cartonMax = { 3, 4, 2, 1, 3, 2, 5, 2, 2, 1, 1, 3, 3, 3, 4 };


        void setup() {
        remplirBureau();
        permutationBureau();
        }

        void remplirBureau() {
        //int bureauCourant = 0;
        while (nombreCarton >0)
        for (int i=0; i<=14; i++)
        if ( nombreColisDansBureau[i]<cartonMax[i] )
        {
        nombreColisDansBureau[i]=nombreColisDansBureau[i]+1;
        nombreCarton--;
        println("le nombre de colis par bureau est de "+nombreColisDansBureau[i]);
        }
        }

        void permutationBureau() {
        int boiteDeTransite = 0;
        boiteDeTransite=nombreColisDansBureau[5];
        nombreColisDansBureau[5]=nombreColisDansBureau[10];
        nombreColisDansBureau[10]=boiteDeTransite;
        println("le nombre de colis dans le bureau 5 est désormais de "+nombreColisDansBureau[5]);
        println("le nombre de colis dans le bureau 10 est désormais de "+nombreColisDansBureau[10]);
        }


/* SITUATION 3 */