// your solution here
//fix all the errors including package errors
public class Main {

    public static void main(String[] args) {
        Burger myBurger = new Burger.Builder().withCheese(true).withPeperone(true).withSize("big").build();
    }
}

class Burger{
    private boolean cheese;
    private boolean peperone;
    private boolean  letucci;
    private boolean  tomato;
    /*int size;*/
    String size;
    public static class Builder{
        private Burger newBurger;

        public Builder() {
            newBurger = new Burger();
        }

        public Builder withCheese(boolean cheese){
            newBurger.cheese = cheese;
            return this;
        }

        public Builder withPeperone(boolean peperone){
            newBurger.peperone = peperone;
            return this;
        }

        public Builder withLetucci(boolean letucci){
            newBurger.letucci = letucci;
            return this;
        }

        public Builder withTomato(boolean tomato){
            newBurger.tomato = tomato;
            return this;
        }
        public Builder withSize(String size){
            newBurger.size = size;
            return this;
        }

        public Burger build(){
            return newBurger;
        }
    }

}
