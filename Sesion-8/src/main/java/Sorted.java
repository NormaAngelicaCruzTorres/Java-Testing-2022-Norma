public class Sorted {


    public static int[] sort (int[] unsorted){
        int[] sorted = new int[] {};
        if(unsorted.length <= 1) return unsorted;



            int temp;
            for (int i = 0; i < unsorted.length; i++){
                for (int j  = i +1; j < unsorted.length; j++){
                    if ( unsorted [i] > unsorted[j])    {
                        temp = unsorted[i];
                        unsorted  [i]= unsorted [j];
                        unsorted [j]=temp;
                    }
                }
            }


            return unsorted;
    }

}

        /*

 if (unsorted.length == 3 || unsorted.length == 2 || unsorted.length == 4  )
             int temp;
             int i =0;
             int j = i +1;


            if (unsorted[i] > unsorted[j]) {
               temp = unsorted[i];
                unsorted[i] = unsorted[j];
                unsorted[i] = temp;
            }

            return unsorted;
        }


        if (unsorted.length == 3) {

            int i=0;
            int j=0;

            while (i < unsorted.length)  {
                while (j < unsorted.length)  {
                    if (unsorted [i] > unsorted[j]){
                        int temp = unsorted[i];
                        unsorted [i] = unsorted [j];
                        unsorted [j]= temp;
                    }

                }
            }

            if (unsorted[i] > unsorted[i + 1]) {
                int temp = unsorted[i];
                unsorted[i] = unsorted[i + 1];
                unsorted[i + 1] = temp;
            }

            if (unsorted[i] > unsorted[i + 2]) {
                int temp = unsorted[i];
                unsorted[i] = unsorted[i + 2];
                unsorted[i + 2] = temp;

            } if (unsorted[i] > unsorted[i + 1 + 1]) {
                int temp = unsorted[i+ 1];
                unsorted[i] = unsorted[2];
                unsorted[2] = temp;
            }




        if (unsorted.length == 3) {
                       int temp;
             for (int i = 0; i < unsorted.length; i++){
                 for (int j  = i +1; j < unsorted.length; j++){
                 if ( unsorted [i] > unsorted[j])    {
                     temp = unsorted[i];
                     unsorted  [i]= unsorted [j];
                     unsorted [j]=temp;
                 }


                 }
             }


*/






