
//Task 1: Pick a random number from an array

//1.a Add the following array as a
//global variable:


//void setup()
//{

//  int[] arr = { 28, 230, 9, 310,72}

//  println(getRandom(arr));
//}

//  int getRandom(int[] arr)
//{

//  int num = arr
//  int num = (int)(random(arr.length));

//  return b;
//}

/*---------------------------------------------------*/

//Task 2: print et udsnit af et ord

//void setup()
// {
// String partOfWord = PrintPartOfWord("København", 1, 5);
// println(partOfWord);
// }

// String PrintPartOfWord(String word, int startIndex, int length)
// {
// return word.substring(startIndex, length);
// }


/*---------------------------------------------------*/

//Task 3: Working with String arrays

//String [] Rappers = {"Eminiem", "50 Cent", "Kendrick Lamar", "Kanye West"};
//String [] hits = {"cleaning out my closet", "many men", "money tress", "Runaway"};

// for(int i = 0; i < Rappers.length; i++)
// {
// println ((i + 1)+ "." + Rappers[i] + " : "+ hits[i]);
// }

/*---------------------------------------------------*/

//Task 4: Square objects in array

//Square[] squares = new Square [10];

//void setup()
//{
//  size(800, 800);
//  background(255);

//  for (int i = 0; i < squares.length; i++)
//  {
//    fill(0);
//    squares[i] = new Square(random(0, 600), random(0, 600));
//    //0,600 begrænser hvor squar må være på skræmen.
//    squares[i].display();
//  }
//}
/*---------------------------------------------------*/
/*Task 6: Draw a chess board using a
 nested for loop and a double int array.*/
//int [][]board = new int [8][8];

//void setup()

//{
//  for (int i = 0; i < board.length; i++)
//  {
//    for (int j = 0; < board [i].length; j++)
//    {
//      board[i][j]= (i+j)%2;
//    }
//  }
//}

//void draw()
//{
//  {
//  for (int i = 0; i < board.length; i++)
//  {
//    for (int j = 0; <board [i].length; j++)
//    {
//      if (board [i][j]==0 {
//        fill(0);
//      }else{
//        fill(255);
//      }
//      rect(i * sideLength, j * sideLength, sideLength, sideLength)
//    }
//  }
//}
//}
/*---------------------------------------------------*/
//Task 7: ArrayList

//ArrayList<Integer> ints = new ArrayList<Integer>();
//ArrayList<String> strings = new ArrayList <String>();
//ArrayList<Boolean> bools = new ArrayList<Boolean>();

//void setup()
//{
// Strings.add("Hej");
// Strings.add("Er");
// Strings.add("DET");
// Strings.add("Weekend");
//}

//printEachString(strings);

//void printEachString(ArrayList<String> strings)
//{
//  for (String s : strings)
//  {
//    println(s);
//  }
//}
//int returnSumOfList(ArrayList<Integer>intList)
//{
//  int sum = 0;
//  for(int a : intList)
//  {
//    sum += a;
//  }
//  return sum/intList.size();
//}

/*---------------------------------------------------*/
