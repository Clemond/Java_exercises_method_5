public class Main{

    // Skapa en metod som du döper till hittaLangstaOrdet. 
    // Metoden skall ta som inparameter en array med strängar. 
    // Metoden skall loopa igenom arrayen och returnera det längsta ordet.


    //metod för att hitta längsta ordet
    public static String hittaLangstaOrdet(String[]array){

        int index = 0;
        int longestRightNow = array[0].length();
        for( int i = 0; i < array.length; i++){

            if(array[i].length() > longestRightNow){
                index = i;
                longestRightNow = array[i].length();
            }

        }
        return array[index];

    }
    public static void main(String[] args) {
        
        //Sträng av frukt
        String[] frukt = {"banan", "melon", "kiwi", "citron"};
        //Sträng av namn
        String[] namn = {"Nicholas", "Carl", "Jean-Claude", "Miriam"};

        String longestWord = hittaLangstaOrdet(frukt);
        System.out.println("longest string in frukt is: " + longestWord);



    }
}