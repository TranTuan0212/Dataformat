
package view;

import java.util.ArrayList;



public abstract class Menu<T> {

    protected String title;
    protected ArrayList<T> mchoice;

    public Menu(String tt, String... mc) {
        this.title = tt;
        this.mchoice = new ArrayList<>();
        for (String s : mc) {
            mchoice.add((T) s);
        }
    }
    public void dispplay() { // print menu
        System.out.println(title);
        for (int i = 0; i < mchoice.size(); i++) {
            System.out.println((i + 1) + "." + mchoice.get(i));
        }
    }



    public abstract void execute();
    public void run(){
       execute();
    }
//    public void dispplay() {
//        System.out.println(title);
//        System.out.println("---------------------------");
//        for (int i = 0; i < mchoice.size(); i++) {
//            System.out.println((i + 1) + "." + mchoice.get(i));
//        }
//    }

}
