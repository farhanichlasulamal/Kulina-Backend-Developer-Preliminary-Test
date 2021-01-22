package kulinatest;

public class Algorithm4 {

    public static void main(String[] args) {
        int trips = 100;
        int switches = 100;
        boolean[] array_lamps = new boolean[switches];
                
        for(int trip=1; trip<=trips; trip++){
            for(int lamp=1; lamp<=switches; lamp++){              
                if( (lamp % trip) == 0 ){
                    array_lamps[lamp-1] = !array_lamps[lamp-1];
                }
            }
        }
        
        int lamps_on = 0;
        for(int counter=0; counter<switches; counter++){
            if (array_lamps[counter])
                lamps_on++;
        }
        
        System.out.println(lamps_on);
    }
    
}
