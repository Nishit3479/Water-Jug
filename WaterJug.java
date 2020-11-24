package ai.lab.project;

import java.util.*;

class WaterJug{
    public static void main(String sap[]){
    Scanner in = new Scanner(System.in);

    int j1 = 3;
    int j2 = 5;

    int count = j1 + j2;

    int jug1[] = new int[count];
    int jug2[] = new int[count];

    int i=0;
    
    jug1[i] = j1;
    jug2[i] = 0;
    i++;

    jug1[i] = 0;
    jug2[i] = j1;
    i++;

    while(i < count){
          if(jug1[i-1] > 0){
               jug1[i] = jug1[i-1];
               jug2[i] = 0;
          }
          else{
               jug1[i] = j1;
               jug2[i] = jug2[i-1];
          }
          i++;

          if(jug2[i-1] > 0){
               if(jug1[i-1] + jug2[i-1] < j2){
                     jug2[i] = jug1[i-1] + jug2[i-1];
                     jug1[i] = 0;
               }
               else{
                     int temp = jug2[i-1];
                     temp = j2 - temp;
                     jug2[i] = temp + jug2[i-1];
 
                     jug1[i] = jug1[i-1] - temp;
               }
          }
          else{
               jug2[i] = jug1[i-1];
               jug1[i] = 0; 
         }
         i++;
    }
    Gui g = new Gui();
    g.jug(jug2, jug1);
    for(i=0; i<count; i++){
             System.out.println("JUG2: "+jug2[i]+"\tJUG1: "+jug1[i]);
    }
    System.out.println();
    }
}