package homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        //որի մեջ սկզբից և վերջից կարող է լինել ցանկացած քանակությամբ''-ներ(բացատներ)։
        //Պետք է ստեղծել նոր՝ char[] result մասիվ,
        // որտեղ չեն լինի spaceArray-ի սկզբի և վերջի բացատները։
        // Այսինքն մեր լոգիկայի արդյունքում որ տպենք result մասիվի բոլոր էլեմենտները՝
        // կունենանք cat b i b (մեջտեղի սինվոլները մնալու են)
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
            //for (int i = 0; i < spaceArray.length; i++) {
              //  for (int j = 1; j < spaceArray.length ; j++) {
                    int beginIndex = 0;
                    int endIndex = spaceArray.length - 1;
                    while (beginIndex < endIndex && spaceArray[beginIndex] == ' '){
                        System.out.println(spaceArray);
                    }
                }

            }
        //}
   // }

