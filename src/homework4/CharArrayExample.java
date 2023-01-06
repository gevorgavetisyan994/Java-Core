package homework4;

public class CharArrayExample {
    public static void main(String[] args) {

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};
        char c = '0';
        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println(count);

        //պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println(chars2[chars2.length / 2] + " " + chars2[chars2.length / 2 - 1]);

        //պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        System.out.println(chars3[chars3.length - 2] == 'l'  &&  +chars3[chars3.length - 1] == 'y');

        //պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն
        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' '){
                System.out.print(text[i]);
            }
        }


    }
}