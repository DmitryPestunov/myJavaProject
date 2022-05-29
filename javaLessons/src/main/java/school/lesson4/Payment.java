package school.lesson4;

import java.util.ArrayList;

public class Payment {

    ArrayList<Buy> purchases = new ArrayList();

    public void buy(Buy buy){
        purchases.add(buy);
    }

    public void showMyPurchases(){
        for (Buy b : purchases){
            System.out.println(b);
        }
    }

    public class Buy {
        private String name;
        private int cost;

        public Buy(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Buy{" +
                    "name='" + name + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
}
