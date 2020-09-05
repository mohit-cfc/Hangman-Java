import java.util.*;

class muv{
    static Scanner sc=new Scanner(System.in);
    static int i;
    static public String genWord(){
        ArrayList<String> wordsList = new ArrayList<String>();
        wordsList.add("javascript");
        wordsList.add("ruby");
        wordsList.add("java");
        wordsList.add("html");
        wordsList.add("css");
        wordsList.add("swift");
        wordsList.add("python");

        Random rand = new Random();
        int random = (int)(Math.random() * (wordsList.size()));
        String randomGenWord = wordsList.get(random);

        Dictionary list = new Hashtable();
        list.put("javascript","a front end web dev programming language");
        list.put("ruby","a cross platform programming language");
        list.put("html","base language of web dev");
        list.put("css","adds designs to websites and applications");
        list.put("swift","i only work on one specific OS");
        list.put("python","getting popular day by day");
        list.put("java","every SE has to learn it");

        System.out.println("Hint: "+list.get(randomGenWord));
        return randomGenWord;

    }
    static public void guess(String s,int x) {
        char[] filler=new char[s.length()];
        int i=0;
        while(i<(s.length())) {
            if(s.charAt(i)==' '){
                filler[i]=' ';
            }
            else
                filler[i]= '-';
            i++;
        }
        System.out.println(filler);
        System.out.println("life remaining = "+ x);
        //Scanner sc=new Scanner(System.in);
        ArrayList<Character> l=new ArrayList<Character>();
        while(x>0) {
            char z=sc.next().toLowerCase().charAt(0);
            if(l.contains(z)) {
                System.out.println("Already entered");
                continue;
            }
            l.add(z);
            if(s.contains(z+"")) {
                for(int y=0;y<s.length();y++) {
                    if(s.charAt(y)==z)
                        filler[y]=z;
                }
            }
            else {
                x--;
            }
            if(s.equals(String.valueOf(filler))) {
                System.out.println(filler);
                System.out.println("you win !!!!");
                break;
            }
            System.out.println(filler);
            System.out.println("life remaining = "+ x);
        }
        if(x==0) {
            System.out.println("You Lost !!!!");
        }
       // sc.close();
    }
    public static void main(String[] args) {
        muv obj = new muv();
        int conti = 0,out=0;
        do {
            System.out.println("Welcome to the Hangman game \n");
            System.out.println("Choose the topic from the menu by choosing the number");
            System.out.println("1. HTML");
            System.out.println("2. JAVA");
            System.out.println("3. CSS");
            System.out.println("4. PYTHON");
            System.out.println("5. JAVASCRIPT");
            System.out.println("6. Exit");

            //Scanner sc=new Scanner(System.in);
            int ch = sc.nextInt();
            int bh =0;

            switch (ch) {
                case 1:
                    System.out.println("\fhtml selected");
                    String tempWord = obj.html();
                    guess(tempWord , 6);
                    break;
                case 2:
                    System.out.println("\fjava selected");
                    //tempWord = obj.java();
                    //guess(tempWord , 6);
                    break;
                case 3:
                    System.out.println("\fcss selected");
                    tempWord = obj.css();
                    guess(tempWord , 6);
                    break;
                case 4:
                    System.out.println("\fpython selected");
                    tempWord = obj.python();
                    guess(tempWord, 6);
                    break;
                case 5:
                    tempWord = obj.javaScript();
                    guess(tempWord, 6);
                    break;
                case 6:
                    System.exit(0);
                    conti = 0;
                    out = 1;
                    break;
                default:
                    System.out.println("Wrong Choice");
                    conti = 1;

            }
            if(out==0)
            {
                System.out.println("press 1 to go to back to main menu");
                System.out.println("press any other key to exit");
                conti= sc.nextInt();
            }

        }

        while (conti==1);

        if(conti!=1) {
            System.exit(0);
        }
        //Scanner s=new Scanner(System.in);
        String word= genWord();
        int life=6;
        guess(word,life);
        //s.close();
    }
    public String html(){


        ArrayList<String> wordsList = new ArrayList<String>();
        wordsList.add("img");
        wordsList.add("html");
        wordsList.add("div");
        wordsList.add("audio");
        wordsList.add("canvas");
        wordsList.add("center");
        wordsList.add("frame");
        wordsList.add("li");
        wordsList.add("link");
        wordsList.add("strike");
        wordsList.add("title");


        Random rand = new Random();
        int random = (int)(Math.random() * (wordsList.size()));
        String randomGenWord = wordsList.get(random);

        Dictionary list = new Hashtable();
        list.put("img","Adds images and gifs");
        list.put("html","Container of all other html elements");
        list.put("div","Box");
        list.put("audio","Allows any music or any other sound type");
        list.put("canvas","Provides blank space to redraw graphics");
        list.put("center","Aligns text or other elements to center");
        list.put("frame","allows to open a web page within a web page");
        list.put("li","defines a list item");
        list.put("link","Creates link with external source");
        list.put("strike","draws a line through the text");
        list.put("title","defines title of the page");


        System.out.println("Hint: "+list.get(randomGenWord));
        return randomGenWord;
    }
    public String java(){


        ArrayList<String> wordsList = new ArrayList<String>();
        wordsList.add("image");
        wordsList.add("anchor");
        wordsList.add("div");


        Random rand = new Random();
        int random = (int)(Math.random() * (wordsList.size()));
        String randomGenWord = wordsList.get(random);

        Dictionary list = new Hashtable();
        list.put("image","add images and gifs");
        list.put("anchor","links and all stuff");
        list.put("div","box");


        System.out.println("Hint: "+list.get(randomGenWord));
        return randomGenWord;
    }
    public String css(){


        ArrayList<String> wordsList = new ArrayList<String>();
        wordsList.add("image");
        wordsList.add("anchor");
        wordsList.add("div");


        Random rand = new Random();
        int random = (int)(Math.random() * (wordsList.size()));
        String randomGenWord = wordsList.get(random);

        Dictionary list = new Hashtable();
        list.put("image","add images and gifs");
        list.put("anchor","links and all stuff");
        list.put("div","box");


        System.out.println("Hint: "+list.get(randomGenWord));
        return randomGenWord;
    }
    public String python(){

        ArrayList<String> wordsList = new ArrayList<String>();
        wordsList.add("py");
        wordsList.add("lambda");
        wordsList.add("ArithmeticError");
        wordsList.add("remove");
        wordsList.add("capitalize");


        Random rand = new Random();
        int random = (int)(Math.random() * (wordsList.size()));
        String randomGenWord = wordsList.get(random);

        Dictionary list = new Hashtable();
        list.put("py","What is the correct file extension for Python files?");
        list.put("lambda","what is used to create an anonymous function? ");
        list.put("ArithmeticError","Raised when an error occurs in numeric calculations.");
        list.put("remove","Removes the specified element of a set/list.");
        list.put("capitalize"," used to convert the first character to upper case.");

        System.out.println("Hint: "+list.get(randomGenWord));
        return randomGenWord;
    }
    public String javaScript()
    {


        ArrayList<String> wordsList = new ArrayList<String>();
        wordsList.add("promise");
        wordsList.add("this");
        wordsList.add("react");
        wordsList.add("parseint");
        wordsList.add("tostring");
        wordsList.add("addeventlistener");
        wordsList.add("setinterval");
        wordsList.add("settimeout");
        wordsList.add("getComputedStyle");
        wordsList.add("alert");


        Random rand = new Random();
        int random = (int)(Math.random() * (wordsList.size()));
        String randomGenWord = wordsList.get(random);

        Dictionary list = new Hashtable();
        list.put("promise","object represents the eventual completion (or failure) of an asynchronous operation, and its resulting value.");
        list.put("react","Most Popular Javascript Framework");
        list.put("parseint","parses a string and returns an integer");
        list.put("tostring","method returns the string representation of the object");
        list.put("addeventlistener","method attaches an event handler to the document.");
        list.put("setinterval","method calls a function or evaluates an expression at specified intervals ");
        list.put("settimeout","method calls a function or evaluates an expression after a specified number of milliseconds");
        list.put("getComputedStyle","method gets all the actual (computed) CSS property and values of the specified element");
        list.put("alert","method displays an alert box with a specified message");



        System.out.println("Hint: "+list.get(randomGenWord));
        return randomGenWord;
    }
    int tc()
    {
        int c;String c1;
        while(true)
        {
            try
            {
                c=sc.nextInt(); break;
            }
            catch(Exception e)
            {
                System.out.println("Error in inputing");
                System.out.println("Enter again");
                c1=sc.nextLine();
            }

        }
        return(c);
    }
    void delay()
    {
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=0;j<100000000;j++)
            {
            }
            System.out.print(".");
        }

    }
}
